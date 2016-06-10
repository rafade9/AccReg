/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;

/**
 * Clase controller para el manejo de la impresión de pdf´s
 * @author extuscomunicacion02
 * @version 1.0
 */
public class ComprobantePdfController extends AbstractController{

	final static Logger logger = Logger.getLogger(ComprobantePdfController.class);

	@Override
	@RequestMapping(value = "/imprimir", method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("*******Entre a imprimir el comprobante de cuenta N2:*******");

		Respuesta respuesta = (Respuesta)request.getSession().getAttribute("respuesta");

		if(respuesta.getPersona() != null){

			Persona persona = new Persona();
			persona = respuesta.getPersona();

			respuesta.setPersona(persona);

			return new ModelAndView("PdfRevenueSummary","respuesta",respuesta);
		}else{
			logger.error("No se esta obteniendo el objeto de respuesta para armar pdf´s");
			return null;
		}
	}

}
