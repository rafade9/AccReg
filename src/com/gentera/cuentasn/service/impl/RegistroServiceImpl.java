/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.service.impl;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.RegistroService;
import com.gentera.cuentasn.util.MailService;
import com.gentera.cuentasn.util.Util;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;

/**
 * Clase que implementa RegistroService para realizar el envío de información
 * hacia el web service client
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Service
public class RegistroServiceImpl implements RegistroService {

	/**
	 * Log
	 */
	final static Logger logger = Logger.getLogger(RegistroServiceImpl.class);

	/**
	 * Recibe referencia de cliente
	 */
	@Autowired
	WebServiceConnector wsConnector;
	
	@Autowired
	MailService mailService;

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.service.RegistroService#registrar(com.gentera.cuentasn.entities.Persona)
	 */
	@Override
	public Respuesta registrar(Persona persona, String ip) throws Exception {
		Respuesta respuesta = new Respuesta();
		try {
			
			switch(persona.getFolio()){
			
			case "10000":
				respuesta.setCodigo(0);
				respuesta.setCLABE("130888001000363977");
				respuesta.setIdBP("78027");
				respuesta.setIdOportunidad("0100015151");
				respuesta.setCuenta("1000363977");
				break;
				
			case "10001":
				respuesta.setCodigo(1);
				break;
				
			case "10002":
				respuesta.setCodigo(2);
				break;
				
			case "10003":
				respuesta.setCodigo(3);
				break;
				
			case "10004":
				respuesta.setCodigo(4);
				break;
				
			case "10005":
				respuesta.setCodigo(5);
				break;
				
			case "10006":
				respuesta.setCodigo(6);
				break;
				
			case "10007":
				respuesta.setCodigo(7);
				break;
				
			case "10008":
				respuesta.setCodigo(8);
				break;
				
			case "10009":
				respuesta.setCodigo(9);
				break;
				
			case "10010":
				respuesta.setCodigo(10);
				break;
				
			default:
				respuesta.setCodigo(99);
				break;
			}
			
			respuesta.setPersona(persona);
			
			// Se realiza la conexion
//			respuesta = wsConnector.sendData(persona, Util.convierteIpTerminaCero("172.20.191.1"));
//			if (respuesta != null && respuesta.getCodigo() != null) {
//
//				if (respuesta.getCodigo() == 0) {
//					respuesta.setMensaje("Cuenta Creada con &Eacute;xito");
//
//				}
//				
//				respuesta.setPersona(persona);
//			}

		} catch (Exception e) {
			
			String codigo = Util.generaClaveError();
			logger.error(codigo + "---" + e.getMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
//			String msj = "Se ha detectado un error: \n \n "+ e.getMessage() +"\n \n Trama: \n \n" + sw.toString();
//			mailService.sendMail(codigo,msj);
			throw new Exception(codigo);
		}

		return respuesta;
	}

	@Override
	public String pruebaWs() {
		return null;
	}

}
