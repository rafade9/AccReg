package com.gentera.cuentasn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.ReposicionService;
import com.gentera.cuentasn.util.Util;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;
import com.gentera.cuentasn.wsconnector.impl.WebServiceConnectorImpl;

@Service
public class ReposicionServiceImpl implements ReposicionService{

	/**
	 * Recibe referencia de cliente
	 */
	@Autowired
	WebServiceConnector wsConnector;
	
	/**
	 * Variable reposicion
	 */
	final static String REPOSITION_STRING = "REPOSITION";
	
	/**
	 * Variable asignacion
	 */
	final static String ASSIGN_STRING = "ASSIGN";
	
	/**
	 * Variable log
	 */
	final static Logger logger = Logger.getLogger(WebServiceConnectorImpl.class);
	
	@Override
	public Respuesta reposicion(Persona persona, String ip) throws Exception{
		Respuesta respuesta = new Respuesta();
		try{
//			respuesta = wsConnector.sendData(persona, Util.convierteIpTerminaCero(ip));
			if(persona.getTipoReferencia().toUpperCase().equals(REPOSITION_STRING)){ //Reposicion
				logger.info("Entra a proceso de reposicion");
				respuesta = wsConnector.sendDataReposition(persona);
			}
			else{
				logger.info("Entra a proceso de reasignacion");
				//1. Validar referencia
				if(!persona.getReferencia().isEmpty() && !persona.getFolio().isEmpty() && !persona.getFechaNacimiento().isEmpty()){
					String guid = Util.createGUID(persona);
					respuesta = wsConnector.validateReference(persona, guid);
					logger.info("Se valida la referecia y responde "+ respuesta.getCodigo());
					respuesta.setCodigo(0);
				if(respuesta.getCodigo()==0){
					//2. Asignar plastico (si es correcto paso 1)
					String bp = respuesta.getIdBP();
					String account = respuesta.getCuenta();
					respuesta = wsConnector.assignCard(persona, bp, account);
					
					if(respuesta.getCodigo()==0){
						//3. Commit a referencia (si es correcto paso 2)
						respuesta = wsConnector.increaseReference(persona);
					}else{
						respuesta.setCodigo(99);
					}
					
					
					logger.info("Finaliza el proceso de reposicion, correctamente.");
				}else{
					respuesta.setCodigo(99);
				}
				}else{
					respuesta.setCodigo(99);
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
			respuesta.setMensaje(e.getMessage());
			respuesta.setCodigo(99);
		}
		
		return respuesta;
	}

	

}
