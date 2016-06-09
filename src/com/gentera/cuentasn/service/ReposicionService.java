package com.gentera.cuentasn.service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;


public interface ReposicionService {
	
	public Respuesta reposicion(Persona persona, String ip)throws Exception;

}
