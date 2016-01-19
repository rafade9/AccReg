package com.gentera.cuentasn.entities;

public class Usuario {
	
	private Integer idUsuario;
	private String username;
	private String password;
	private String folioTarjeta;
	private String origen;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFolioTarjeta() {
		return folioTarjeta;
	}
	public void setFolioTarjeta(String folioTarjeta) {
		this.folioTarjeta = folioTarjeta;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}
