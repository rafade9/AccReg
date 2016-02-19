/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.entities;

import java.io.Serializable;
/**
 * Entidad
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class Persona {

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String paterno;
	private String materno;
	private String fechaNacimiento;
	private String nacionalidad;
	private String paisNacimiento;
	private String lugarNacimiento;
	private String genero;
	private boolean sms;
	private String tipoTelefono;
	private String telefono;
	// Direccion
	private String codigoPostal;
	private String estado;
	private String delegacion;
	private String ciudad;
	private String colonia;
	private String calle;
	private String numExterior;
	private String numInterior;
	private String folio;

	/**
	 * Getter TipoIdentificacion
	 * @return the tipoIdentificacion
	 */
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * Setter TipoIdentificacion
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	/**
	 * Getter NumeroIdentificacion
	 * @return numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * Setter NumeroIdentificacion
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * Getter PrimerNombre
	 * @return primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * Setter PrimerNombre
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	/**
	 * Getter SegundoNombre
	 * @return segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}

	/**
	 * Setter SegundoNombre
	 * @param segundoNombre the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	/**
	 * Getter Paterno
	 * @return paterno
	 */
	public String getPaterno() {
		return paterno;
	}

	/**
	 * Setter Paterno
	 * @param paterno the paterno to set
	 */
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	/**
	 * Getter Materno
	 * @return materno
	 */
	public String getMaterno() {
		return materno;
	}

	/**
	 * Setter Materno
	 * @param materno the materno to set
	 */
	public void setMaterno(String materno) {
		this.materno = materno;
	}

	/**
	 * Getter FechaNacimiento
	 * @return fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Setter FechaNacimiento
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Getter Nacionalidad
	 * @return nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Setter Nacionalidad
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Getter PaisNacimiento
	 * @return paisNacimiento
	 */
	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	/**
	 * Setter PaisNacimiento
	 * @param paisNacimiento the paisNacimiento to set
	 */
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	/**
	 * Getter LugarNacimiento
	 * @return lugarNacimiento
	 */
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	/**
	 * Setter LugarNacimiento
	 * @param lugarNacimiento the lugarNacimiento to set
	 */
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	/**
	 * Getter Genero
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Setter Genero
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Getter sms
	 * @return sms
	 */
	public boolean isSms() {
		return sms;
	}

	/**
	 * Setter Sms
	 * @param sms the sms to set
	 */
	public void setSms(boolean sms) {
		this.sms = sms;
	}

	/**
	 * Getter TipoTelefono
	 * @return tipoTelefono
	 */
	public String getTipoTelefono() {
		return tipoTelefono;
	}

	/**
	 * Setter TipoTelefono
	 * @param tipoTelefono the tipoTelefono to set
	 */
	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

	/**
	 * Getter Telefono
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Setter Telefono
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Getter CodigoPostal
	 * @return codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Setter CodigoPostal
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * Getter Estado
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter Estado
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Getter Delegacion
	 * @return delegacion
	 */
	public String getDelegacion() {
		return delegacion;
	}

	/**
	 * Setter Delegacion
	 * @param delegacion the delegacion to set
	 */
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	/**
	 * Getter Ciudad
	 * @return ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Setter ciudad
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Getter Colonia
	 * @return colonia
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * Setter Colonia
	 * @param colonia the colonia to set
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * Getter Calle
	 * @return calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Setter Calle
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Getter NumExterior
	 * @return numExterior
	 */
	public String getNumExterior() {
		return numExterior;
	}

	/**
	 * Setter NumExterior
	 * @param numExterior the numExterior to set
	 */
	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	/**
	 * Getter NumInterior
	 * @return numInterior
	 */
	public String getNumInterior() {
		return numInterior;
	}

	/**
	 * Setter NumInterior
	 * @param numInterior the numInterior to set
	 */
	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	/**
	 * Getter Folio
	 * @return folio
	 */
	public String getFolio() {
		return folio;
	}

	/**
	 * Setter Folio
	 * @param folio the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}

}
