package com.gentera.cuentasn.service;

import java.util.List;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;

public interface LeerCatalogos {
	
	/**
	 * Leer archivo csv con los paises
	 * @return
	 */
	public List<Pais> leerCsvPaises();
	
	/**
	 * Leer archivo csv con los estados
	 * @return
	 */
	public List<Estado> leerCsvEstados();

}
