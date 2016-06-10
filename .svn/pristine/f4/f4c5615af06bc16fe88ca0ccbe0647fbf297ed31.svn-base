/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.service;

import java.util.List;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;

/**
 * Interfaz
 * @author Rafael Delgadillo
 * @version 1.0
 */
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
	
	/**
	 * Metodo para recuperar lista de estados por clave de pais
	 * @return Array de Estados filtrados por clave de pais
	 */
	public Estado[] getEstadosByClavePais(String clavePais);

}
