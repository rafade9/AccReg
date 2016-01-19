package com.gentera.cuentasn.service;

import java.util.List;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;

public interface CatalogosService {
	
	/**
	 * Metodo para recuperar la lista de los paises
	 * @return Lista de paises
	 */
	public List<Pais> getPaises();
	
	/**
	 * Metodo para recuperar la lista de estados
	 * @return Lista de estados
	 */
	public List<Estado> getEstados();

}
