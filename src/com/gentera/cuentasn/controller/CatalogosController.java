/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.CatalogosService;

/**
 * Clase controller para exponer los catalogos para el formulario de registro
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Controller
@RequestMapping(value="/catalogos")
public class CatalogosController {
	
	/**
	 * Recibe referencia de servicio
	 */
	@Autowired
	CatalogosService catalogos;

	/**
	 * Servicio para consultar los paises en el catalogo
	 * @return List de paises
	 */
	@RequestMapping(value = "/paises", method = RequestMethod.GET)
	public @ResponseBody List<Pais> getPaises() {
		return catalogos.getPaises();
	}
	
	/**
	 * Servicio para consultar los estados en el catalogo
	 * @return List de estados
	 */
	@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public @ResponseBody List<Estado> getEstados() {
		return catalogos.getEstados();
	}
	
	/**
	 * Servicio para consultar los estados en el catalogo por clave de pais
	 * @return List de estados
	 * @param clavePais que sera la clave a consultar
	 */
	@RequestMapping(value = "/estadosByClavePais/{clavePais}", method = RequestMethod.GET)
	public @ResponseBody Estado[] getEstadosByClavePais(@PathVariable String clavePais) {
		System.out.println(clavePais);
		return catalogos.getEstadosByClavePais(clavePais);
	}
}
