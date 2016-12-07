package com.gentera.cuentasn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.ReposicionService;
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
				String guid = "414e414c363230343932303731323136";
				
				//1. Validar referencia
				Respuesta respuestaValidacion = wsConnector.validateReference(persona, guid);
				
				//2. Asignar plastico (si es correcto paso 1)
				Respuesta respuestaAsignacion = wsConnector.assignCard(persona);
				
				//3. Commit a referencia (si es correcto paso 2)
				Respuesta respuestaCommit = wsConnector.increaseReference(persona);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			respuesta.setMensaje(e.getMessage());
			respuesta.setCodigo(99);
		}
		
		return respuesta;
	}

	

}
