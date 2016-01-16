package com.gentera.cuentasn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gentera.cuentasn.entities.Persona;

@Controller
public class RegistroController {

	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public ResponseEntity<Persona> getPersona() {
		Persona persona = new Persona();
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}

	@RequestMapping(value = "/registro", method = RequestMethod.POST)
	public ResponseEntity<Persona> registrar(@RequestBody Persona persona) {

		return new ResponseEntity<>(persona, HttpStatus.OK);
	}

	@RequestMapping(value = "/registroCompartamos", method = RequestMethod.GET)
	public String printLoginCompartamos(ModelMap model) {
		System.out.println("Entra a registro Compartamos");
		return "registroCompartamos";
 
	}
}
