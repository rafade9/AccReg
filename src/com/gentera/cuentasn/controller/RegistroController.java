package com.gentera.cuentasn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gentera.cuentasn.entities.Persona;

@Controller
@RequestMapping(value="/registro")
public class RegistroController {

	@RequestMapping(value="/compartamos", method = RequestMethod.GET)
	public ResponseEntity<Persona> getPersona(){
		Persona persona = new Persona();
		persona.setNombre("Andrea");
		persona.setPaterno("Tellez");
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		
		model.addAttribute("message", 2);
		return "loginYastas";
 
	}
}
