package com.gentera.cuentasn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.ReposicionService;
import com.gentera.cuentasn.util.Util;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;

@Service
public class ReposicionServiceImpl implements ReposicionService{

	/**
	 * Recibe referencia de cliente
	 */
	@Autowired
	WebServiceConnector wsConnector;
	
	@Override
	public Respuesta reposicion(Persona persona, String ip) throws Exception{
		Respuesta respuesta = new Respuesta();
		try{
//			respuesta = wsConnector.sendData(persona, Util.convierteIpTerminaCero(ip));
			Integer proceso = 1;
			if(proceso == 1){ //Reposicion
			
				respuesta = wsConnector.sendDataReposition(persona);
			}
			else{
				String guid = Util.createGUID(persona);
				
				//1. Validar referencia
				if(!persona.getReferencia().isEmpty() && !persona.getFolio().isEmpty() && !persona.getFechaNacimiento().isEmpty()){
				respuesta = wsConnector.validateReference(persona, guid);
				
				if(respuesta.getCodigo()==0){

					//2. Asignar plastico (si es correcto paso 1)
					respuesta = wsConnector.assignCard(persona);
					
					if(respuesta.getCodigo()==0){
						//3. Commit a referencia (si es correcto paso 2)
						respuesta = wsConnector.increaseReference(persona);
					}else{
						respuesta.setCodigo(99);
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
