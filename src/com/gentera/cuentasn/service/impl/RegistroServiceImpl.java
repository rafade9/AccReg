/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.RegistroService;
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

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.service.RegistroService#registrar(com.gentera.cuentasn.entities.Persona)
	 */
	@Override
	public Respuesta registrar(Persona persona, String ip) throws Exception {
		Respuesta respuesta = new Respuesta();
		try {
			// Se realiza la conexion
			respuesta = wsConnector.sendData(persona, Util.convierteIpTerminaCero(ip));
			if (respuesta != null && respuesta.getCodigo() != null) {
				logger.info("La respuesta trae codigo de retorno " + respuesta.getCodigo());

				if (respuesta.getCodigo() == 0) {
					respuesta.setMensaje("Cuenta Creada con &Eacute;xito");

					/*
					 * //Se busca el número de tarjeta CardNumbers[] cns =
					 * wsConnector.getTarjetas(respuesta.getIdBP());
					 * logger.info("Se recuperaron " + cns.length + " tarjetas."
					 * ); for(CardNumbers cn : cns){
					 * if(validaNumeroTarjeta(cn.getCardNumber())){
					 * respuesta.setNumTarjeta(String.valueOf(cn.getCardNumber()
					 * )); break; } }
					 */

				}
				
				respuesta.setPersona(persona);
			}

		} catch (Exception e) {
			String codigo = Util.generaClaveError();
			logger.error(codigo + "---" + e.getMessage());
			throw new Exception(codigo);
		}

		return respuesta;
	}

	@Override
	public String pruebaWs() {
		return null;
	}

}
