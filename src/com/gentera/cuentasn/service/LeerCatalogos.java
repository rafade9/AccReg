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
	
	/**
	 * Leer archivo csv de los estados y recuperar por clave de pais
	 * @param idPais la clave del pais
	 * @return Lista de estados pertenecientes a la clave
	 */
	public Estado[] getEstadosByIdPais(String idPais);

}
