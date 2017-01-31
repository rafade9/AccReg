package com.gentera.cuentasn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.ReposicionService;



@Controller
public class ReposicionController {
	
	final static Logger logger = Logger.getLogger(ReposicionController.class);
	
	@Autowired
	ReposicionService reposicionService;

	@RequestMapping(value = "/reposicionYastas", method = RequestMethod.GET)
	public String reposicionWelcome(ModelMap model) {
		logger.info("Entrando a reposicion Yastas");
		return "reposicionYastas";
	}

	
	
	
	@RequestMapping(value = "/generaReposicion", method = RequestMethod.POST)
	public ResponseEntity<Respuesta> generaReposicion(HttpServletRequest request, HttpServletResponse response,@RequestBody Persona persona) {
		try{
//			logger.info("Datos Reposicion: " + persona.toString());
			
			Respuesta respuesta = reposicionService.reposicion(persona, request.getRemoteAddr());
			
//			request.getSession().setAttribute("respuesta", respuesta);
			System.out.println("Mensaje: " + respuesta.getMensaje());
			System.out.println("Codigo: " + respuesta.getCodigo());
			
			return new ResponseEntity<Respuesta>(respuesta , HttpStatus.OK);
			
		}catch(Exception e){
			Respuesta respuesta = new Respuesta();
			respuesta.setCodigo(99);
			respuesta.setMensaje(e.getMessage());
			return new ResponseEntity<Respuesta>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value ="/pruebaRepo", method = RequestMethod.GET)
	public ResponseEntity<Respuesta> pruebaRepo(HttpServletRequest request, HttpServletResponse response){
		try{
			Persona persona = new Persona();
			persona.setFolio("123");
			persona.setReferencia("789");
			persona.setFechaNacimiento("12/12/1990");
			Respuesta respuesta = reposicionService.reposicion(persona, request.getRemoteAddr());
			return new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		}catch(Exception e){
			Respuesta respuesta = new Respuesta();
			respuesta.setCodigo(99);
			respuesta.setMensaje(e.getMessage());
			return new ResponseEntity<Respuesta>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
