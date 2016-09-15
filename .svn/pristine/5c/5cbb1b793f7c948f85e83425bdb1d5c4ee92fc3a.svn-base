/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.CatalogosService;
import com.gentera.cuentasn.taks.ArchivoOperadoresTask;
import com.gentera.cuentasn.util.OperadoresArchivo;

/**
 * Clase controller para exponer los catalogos para el formulario de registro
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Controller
@RequestMapping(value="/catalogos")
public class CatalogosController {
	
	final static Logger logger = Logger.getLogger(CatalogosController.class);
	
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
		return catalogos.getEstadosByClavePais(clavePais);
	}
	
	/**
	 * Servicio para probar el log (Temporal)
	 */
	@RequestMapping(value = "/log", method = RequestMethod.GET)
	public @ResponseBody String log(){
		logger.info("PRUEBA DE ESCRITURA EN LOG");
		return "hecho";
	}
	
	/**
	 * Servicio para regenerar el array de operadores (Temporal)
	 */
	@RequestMapping(value = "/regOperadores", method = RequestMethod.GET)
	public @ResponseBody String regOperadores(){
		try{
			List<String> operadores = ArchivoOperadoresTask.obtenerOperadores("2");
			if(operadores.size()!=0){
				OperadoresArchivo.setNumOperadores(operadores);
				return "Hecho!";
			}
			else{
				return "Sin operadores";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "Falla";
		}
	}
}
