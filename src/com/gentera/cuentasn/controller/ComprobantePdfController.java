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

public class ComprobantePdfController extends AbstractController{

	final static Logger logger = Logger.getLogger(ComprobantePdfController.class);

	@Override
	@RequestMapping(value = "/imprimir", method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		logger.info("*******Entre a imprimir el comprobante de cuenta N2*******");
		
		
		Respuesta respuestaJSP = (Respuesta)request.getSession().getAttribute("respuesta");
		
		System.out.println("*****mi respuesta"+ respuestaJSP);
		
		Respuesta respuesta = new Respuesta();
		respuesta.setIdOportunidad("123456");//folio
		respuesta.setCLABE("234212123");
		respuesta.setCuenta("08778876");
		Persona persona = new Persona();
		persona.setPrimerNombre("YOLANDA");
		persona.setPaterno("OLMEDO");
		persona.setMaterno("CANABAL");
		persona.setFechaNacimiento("12/12/2000");
		respuesta.setNumTarjeta("******2343");
		
		respuesta.setPersona(persona);

//		if(output ==null || "".equals(output)){
//			//return normal view
//			return new ModelAndView("RevenueSummary","respuesta",respuesta);
//
//		}else if("PDF".equals(output.toUpperCase())){
			//return excel view
			return new ModelAndView("PdfRevenueSummary","respuesta",respuesta);
//
//		}else{
//			//return normal view
//			return new ModelAndView("comprobantepdf","respuesta",respuesta);
//
//		}

	}
	
	

}
