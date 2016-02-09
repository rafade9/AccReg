package com.gentera.cuentasn.wsconnector;

import com.compartamos.cm.cardmanagement.de_oa_i_104.CardNumbers;
import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;

public interface WebServiceConnector {
	
	public Respuesta sendData(Persona persona);

	public CardNumbers[] getTarjetas(String bp);
}
