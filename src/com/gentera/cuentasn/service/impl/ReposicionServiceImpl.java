package com.gentera.cuentasn.service.impl;

import java.util.Calendar;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.service.LeerCatalogos;
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
	
	@Autowired
	LeerCatalogos leerCatalogos;
	
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
							respuesta.setCodigo(100);
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
						
						//Recuperar 
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


						String subject = "Error - Detección de Asignación sospechoso. En YASTAS N2";
						//Se ha detectado un intento de originacion sospechoso. \n \n
						String msj = "Se ha detectado un intento de asignación sospechoso, al ingresar el número de referencia y/o fecha de nacimiento incorrecto.  \n \n";
								msj += "\n Usuario: " + user.getUsername();
								msj += "\n Folio: " + persona.getFolio();
								msj += "\n Origen: " + user.getOrigen();
								msj += "\n No. Plaza/OS: " + numPlazaOs;
								
								msj += "\n Fecha: " + Util.getDateTime();
								msj += "\n\n\n Reposicion N2 - Yastas.";
								


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
