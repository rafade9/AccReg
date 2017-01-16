/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.wsconnector;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;

/**
 * Interfaz
 * @author Rafael Delgadillo
 * @version 1.0
 */
public interface WebServiceConnector {
	
	/**
	 * Consumo de Web Service CRM para registrar persona
	 * @param persona
	 * @Param ip
	 * @return
	 */
	public Respuesta sendData(Persona persona, String ip) throws Exception;

	/**
	 * Consumo de Web Service Card Manager para consultar tarjetas
	 * @param bp
	 * @return
	 */
//	public CardNumbers[] getTarjetas(String bp);
	
	/**
	 * Consumo de Web Service Card Manager para reposicion de TDD
	 * @param persona
	 * @return
	 * @throws Exception
	 */
	public Respuesta sendDataReposition(Persona persona) throws Exception;
	
	/**
	 * Consumo de Web Service RMS para validacion de referencia
	 * @param persona
	 * @param guid
	 * @return
	 * @throws Exception
	 */
	public Respuesta validateReference(Persona persona, String guid) throws Exception;
	
	/**
	 * Consumo de Web Service RMS para incrementar los intentos de uso de una referencia
	 * @param persona
	 * @return
	 * @throws Exception
	 */
	public Respuesta increaseReference(Persona persona, String guid, String referenceCode) throws Exception;
	
	/**
	 * Consumo de Web Service Card Manager para asignacion de TDD
	 * @param persona
	 * @return
	 * @throws Exception
	 */
	public Respuesta assignCard(Persona persona, String bp, String account) throws Exception;
}
