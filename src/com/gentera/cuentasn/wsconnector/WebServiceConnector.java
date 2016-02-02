package com.gentera.cuentasn.wsconnector;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;

public interface WebServiceConnector {
	
	public Respuesta sendData(Persona persona);

}
