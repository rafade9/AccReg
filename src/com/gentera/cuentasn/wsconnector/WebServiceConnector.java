/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.wsconnector;

import com.compartamos.cm.cardmanagement.de_oa_i_104.CardNumbers;
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
	 * @return
	 */
	public Respuesta sendData(Persona persona);

	/**
	 * Consumo de Web Service Card Manager para consultar tarjetas
	 * @param bp
	 * @return
	 */
	public CardNumbers[] getTarjetas(String bp);
}
