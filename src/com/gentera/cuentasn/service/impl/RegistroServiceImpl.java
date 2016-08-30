/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.service.impl;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.service.LeerCatalogos;
import com.gentera.cuentasn.service.RegistroService;
import com.gentera.cuentasn.util.MailService;
import com.gentera.cuentasn.util.Properties;
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
	
	@Autowired
	LeerCatalogos leerCatalogos;

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
				
				else{
					Usuario user = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
					String numPlazaOs = "";
					String nombrePlazaOs = "";
					if(user.getOrigen().equals("compartamos")){
						Sucursal plaza = leerCatalogos.getSucursalPlaza(Util.convierteIpTerminaCero(ip));
						
						if(plaza==null){
							numPlazaOs = "Plaza desconocida";
						}else{
							numPlazaOs = plaza.getId();
							nombrePlazaOs = plaza.getPlaza();
						}
					}else{
						Usuario usuario = leerCatalogos.getInfoPlazaByOperador(user.getUsername(), Properties.getProp("fileOperadores")+"OperadoresYastasN2.properties");
						numPlazaOs = usuario.getNumOficina();
					}
					
					String msj = "Se ha detectado un error: \n \n CRM ha devuelto Code " + respuesta.getCodigo() 
							+ "\n \n Mensaje: " + respuesta.getMensaje()
							+ "\n \n ---------DATOS DE ORIGINACION----------- \n \n"
							+ "\n Usuario: " + user.getUsername()
							+ "\n Folio: " + persona.getFolio()
							+ "\n Origen: " + user.getOrigen()
							+ "\n IP: " + ip
							+ "\n No. Plaza/OS: " + numPlazaOs
							+ "\n Nombre Plaza: " + nombrePlazaOs;
					String codigo = Util.generaClaveError();
					mailService.sendMail(codigo, msj);
				}
				
				respuesta.setPersona(persona);
			}

		} catch (Exception e) {
			
			String codigo = Util.generaClaveError();
			logger.error(codigo + "---" + e.getMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
//			e.printStackTrace();
			String msj = "Se ha detectado un error: \n \n "+ e.getMessage() +"\n \n Trama: \n \n" + sw.toString();
			mailService.sendMail(codigo,msj);
			throw new Exception(codigo);
		}

		return respuesta;
	}

	@Override
	public String pruebaWs() {
		return null;
	}

}
