/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.entities;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Entidad
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class Usuario implements UserDetails{

	private Integer idUsuario;
	private String username;
	private String password;
	private String folioTarjeta;
	private String origen;
	private String captcha;
	
	private String numEmpleado;
	private boolean enabled;

	
	private String numPlaza;
	private String empleado;
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
	
	/**
	 * Getter numEmpleado
	 * @return numEmpleado
	 */
	public String getNumEmpleado() {
		return numEmpleado;
	}

	/**
	 * Setter numEmpleado
	 * @param numEmpleado the numEmpleado to set
	 */
	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	/**
	 * Getter numPlaza
	 * @return numPlaza
	 */
	public String getNumPlaza() {
		return numPlaza;
	}

	/**
	 * Setter numPlaza
	 * @param numPlaza
	 */
	public void setNumPlaza(String numPlaza) {
		this.numPlaza = numPlaza;
	}

	/**
	 * Getter empleado
	 * @return empleado
	 */
	public String getEmpleado() {
		return empleado;
	}

	/**
	 * Setter empleado
	 * @param empleado
	 */
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
	 */
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
	 */
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return this.enabled;
	}

}
