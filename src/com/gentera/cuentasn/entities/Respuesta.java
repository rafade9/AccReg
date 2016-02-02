package com.gentera.cuentasn.entities;

public class Respuesta {

	private Integer tipo;
	private Integer codigo;
	private String mensaje;

	private String idBP;
	private String CLABE;
	private String cuenta;
	private String idOportunidad;

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getIdBP() {
		return idBP;
	}

	public void setIdBP(String idBP) {
		this.idBP = idBP;
	}

	public String getCLABE() {
		return CLABE;
	}

	public void setCLABE(String cLABE) {
		CLABE = cLABE;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getIdOportunidad() {
		return idOportunidad;
	}

	public void setIdOportunidad(String idOportunidad) {
		this.idOportunidad = idOportunidad;
	}

}
