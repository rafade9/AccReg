package com.gentera.cuentasn.wsconnector;

import com.gentera.cuentasn.entities.Persona;

public interface WebServiceConnector {
	
	public String sendData(Persona persona);

}
