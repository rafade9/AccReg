package com.gentera.cuentasn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

	/**
	 * Funcion para atender recurso /welcome por GET
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("Entra a welcome");
		model.addAttribute("message", 2);
		System.out.print("hola");
		return "loginYastas";
 
	}
	
	@RequestMapping(value = "/loginCompartamos", method = RequestMethod.GET)
	public String printLoginCompartamos(ModelMap model) {
		System.out.println("Entra a welcome Compartamos");
		model.addAttribute("message", 2);
		return "loginYastas";
 
	}

}
