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
 * @author extuscomunicacion03
 *
 */
@Controller
@RequestMapping(value="/catalogos")
public class CatalogosController {
	
	@Autowired
	CatalogosService catalogos;

	/**
	 * Servicio para consultar los paises en el catálogo
	 * @return
	 */
	@RequestMapping(value = "/paises", method = RequestMethod.GET)
	public @ResponseBody List<Pais> getPaises() {
		return catalogos.getPaises();
	}
	
	/**
	 * Servicio para consultar los estados en el catálogo
	 * @return
	 */
	@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public @ResponseBody List<Estado> getEstados() {
		return catalogos.getEstados();
	}
	
	/**
	 * Servicio para consultar los estados en el catálogo por clave de país
	 * @return
	 */
	@RequestMapping(value = "/estadosByClavePais/{clavePais}", method = RequestMethod.GET)
	public @ResponseBody Estado[] getEstadosByClavePais(@PathVariable String clavePais) {
		System.out.println(clavePais);
		return catalogos.getEstadosByClavePais(clavePais);
	}
}
