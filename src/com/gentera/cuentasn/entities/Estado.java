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
public class Estado {

	private String nombre;
	private String clave;
	private String clavePais;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getClavePais() {
		return clavePais;
	}

	public void setClavePais(String clavePais) {
		this.clavePais = clavePais;
	}

}
