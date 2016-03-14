/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.service.RegistroService;

/**
 * Clase que expone los servicios rest para pantallas y registro de información de cuentas
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Controller
public class RegistroController {
	
	final static Logger logger = Logger.getLogger(RegistroController.class);
	
	/**
	 * Referencia de capa de servicio 
	 */
	@Autowired
	RegistroService registroService;


	/**
	 * Servicio para registrar los datos de la persona
	 * @param persona los datos a registrar
	 * @return respuesta la informacion a mostrar al usuario
	 */
	@RequestMapping(value = "/registro", method = RequestMethod.POST)
	public ResponseEntity<Respuesta> registrar(HttpServletRequest request, HttpServletResponse response,@RequestBody Persona persona) {
		try{
			Respuesta respuesta = registroService.registrar(persona, request.getRemoteAddr());
			
			request.getSession().setAttribute("respuesta", respuesta);
			return new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		}catch(Exception e){
			Respuesta respuesta = new Respuesta();
			respuesta.setCodigo(99);
			respuesta.setMensaje(e.getMessage());
			return new ResponseEntity<Respuesta>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Servicio para mostrar pantalla de registro compartamos
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/registroCompartamos", method = RequestMethod.GET)
	public String printLoginCompartamos(ModelMap model) {
		if(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")){
			return "redirect:/loginCompartamos";
		}
		Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(usuario.getOrigen().equals("compartamos"))
			return "registroCompartamos";
		else if(usuario.getOrigen().equals("yastas"))
			return "redirect:/registroYastas";
		else
			return "redirect:/paginaError";
 
	}
	
	/**
	 * Servicio para mostrar pantalla de registro Yastas
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/registroYastas", method = RequestMethod.GET)
	public String registroYastas(ModelMap model) {
		if(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")){
			return "redirect:/loginYastas";
		}
		Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(usuario.getOrigen().equals("yastas"))
			return "registroYastas";
		else if(usuario.getOrigen().equals("compartamos"))
			return "redirect:/registroCompartamos";
		else
			return "redirect:/paginaError";
 
	}
	
}
