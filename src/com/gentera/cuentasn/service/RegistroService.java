/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;

/**
 * Interfaz
 * @author Rafael Delgadillo
 * @version 1.0
 */
public interface RegistroService {

	/**
	 * Metodo que conecta al consumo del servicio web
	 * @param persona
	 * @return Respuesta del servicio web procesada para el front
	 */
	public Respuesta registrar(Persona persona) throws Exception;
	
	public String pruebaWs();
}
