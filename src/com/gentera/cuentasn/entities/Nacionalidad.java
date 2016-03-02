/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.entities;

/**
 * Entidad
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class Nacionalidad {

	private String nombre;
	private String clave;

	/**
	 * Getter Nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter Nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter Clave
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * Setter Clave
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

}
