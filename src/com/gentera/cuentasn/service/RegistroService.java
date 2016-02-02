package com.gentera.cuentasn.service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;

public interface RegistroService {

	/**
	 * Metodo que conecta al consumo del servicio web
	 * @param persona
	 * @return Respuesta del servicio web procesada para el front
	 */
	public Respuesta registrar(Persona persona) throws Exception;
	
	public String pruebaWs();
}
