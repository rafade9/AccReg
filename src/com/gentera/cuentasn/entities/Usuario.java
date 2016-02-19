/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.entities;

/**
 * Entidad
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class Usuario {

	private Integer idUsuario;
	private String username;
	private String password;
	private String folioTarjeta;
	private String origen;
	private String captcha;

	/**
	 * Getter IdUsuario
	 * @return idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Setter IdUsuario
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * Getter Username
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter Username
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Getter Password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter Password
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Getter FolioTarjeta
	 * @return folioTarjeta
	 */
	public String getFolioTarjeta() {
		return folioTarjeta;
	}

	/**
	 * Setter FolioTarjeta
	 * @param folioTarjeta the folioTarjeta to set
	 */
	public void setFolioTarjeta(String folioTarjeta) {
		this.folioTarjeta = folioTarjeta;
	}

	/**
	 * Getter Origen
	 * @return origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Setter Origen
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Getter Captcha
	 * @return captcha
	 */
	public String getCaptcha() {
		return captcha;
	}

	/**
	 * Setter Captcha
	 * @param captcha the captcha to set
	 */
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

}
