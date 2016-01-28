package com.gentera.cuentasn.controller;

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
import com.gentera.cuentasn.service.RegistroService;

@Controller
public class RegistroController {
	
	@Autowired
	RegistroService registroService;

	/**
	 * Temporal
	 * @return
	 */
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public ResponseEntity<Persona> getPersona() {
		Persona persona = new Persona();
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}

	/**
	 * Servicio para registrar los datos de la persona
	 * @param persona
	 * @return
	 */
	@RequestMapping(value = "/registro", method = RequestMethod.POST)
	public ResponseEntity<Respuesta> registrar(@RequestBody Persona persona) {
		try{
			Respuesta respuesta = registroService.registrar(persona);
			return new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<Respuesta>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Temporal
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/registroCompartamos", method = RequestMethod.GET)
	public String printLoginCompartamos(ModelMap model) {
		System.out.println("Entra a registro Compartamos");
		return "registroCompartamos";
 
	}
	
	@RequestMapping(value = "/registroYastas", method = RequestMethod.GET)
	public String registroYastas(ModelMap model) {
		System.out.println("Entra a registro Yastas");
		return "registroYastas";
 
	}
	
	@RequestMapping(value = "/registroPrueba", method = RequestMethod.GET)
	public ResponseEntity<Persona> registroPrueba() {
		registroService.pruebaWs();
		System.out.println("Entra a registro prueba");
		return new ResponseEntity<Persona>(HttpStatus.OK);
 
	}
}
