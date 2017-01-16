package com.gentera.cuentasn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.ReposicionService;
import com.gentera.cuentasn.util.MailService;
import com.gentera.cuentasn.util.Properties;
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
	
	@Autowired
	MailService mailService;
	
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
	final static Logger logger = Logger.getLogger(ReposicionServiceImpl.class);
	
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
					logger.info("Respuesta de validateReference " + respuesta.getCodigo());
					if(respuesta.getCodigo()==0){
						//2. Asignar plastico (si es correcto paso 1)
						String bp = respuesta.getIdBP();
						String account = respuesta.getCuenta();
						logger.info("Entra al proceso de asignar tarjeta. CODIGO: " + respuesta.getCodigo());
						respuesta = wsConnector.assignCard(persona, bp, account);
						if(respuesta.getCodigo()==0){
							//3. Commit a referencia (si es correcto paso 2)
							respuesta = wsConnector.increaseReference(persona,guid, "UTILIZAR");//cancelar 3 check
							logger.info("Finaliza el proceso de reposicion, correctamente.");
						}else if(respuesta.getCodigo()==3){
							respuesta.setCodigo(3);
						}else{
							respuesta.setCodigo(99);
						}
						
						
					}else if (respuesta.getCodigo()==11){
						logger.info("Error en referencia");
						respuesta.setCodigo(102);
						//enviar correo prevencion de fraudes;

						String subject = "Error - Detección de Asignación sospechoso.";
						//Se ha detectado un intento de originacion sospechoso. \n \n
						String msj = "Se ha detectado un intento de asignación sospechoso, al ingresar el número de referencia y/o fecha de nacimiento.  \n \n";
						
//						"y/o fecha de nacimiento." +
//						"Referencia: " +
//						"Fecha de Nacimiento: " +
//						"Reposicion N2 - Yastas.";
								if(persona.isSms()){
									mailService.sendMail(subject, msj);
								}
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
