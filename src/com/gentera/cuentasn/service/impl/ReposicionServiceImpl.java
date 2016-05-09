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
			
			respuesta.setCodigo(6);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return respuesta;
	}

	

}
