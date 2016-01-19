package com.gentera.cuentasn.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gentera.cuentasn.entities.Usuario;

@Controller
public class loginController {

	HttpServletRequest httpServlet;

	/**
	 * Funcion para atender recurso /welcome por GET
	 * 
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

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String printLoginCompartamos(ModelMap model) {
		System.out.println("Entra a welcome Compartamos");
		return "loginCompartamos";

	}

	@RequestMapping(value = "/loginPrueba", method = RequestMethod.GET)
	public String loginPrueba() {
		System.out.println("Entra a login Prueba");
		return "loginPrueba";
	}

	@RequestMapping(value = "/loginProcessCompartamos", method = RequestMethod.POST)
	public ModelAndView loginProcessCompartamos(HttpServletRequest req, Usuario usuario) {
		ModelAndView model;
		try {
			System.out.println(usuario.getUsername());
			req.login(usuario.getUsername(), usuario.getPassword());
			
		} catch (ServletException e) {
			
			if(e.getMessage().startsWith("Bad credentials")){
				model = new ModelAndView("loginPrueba");
				model.addObject("error", "Usuario o password incorrecto");
				return model;
			}
		}
		model = new ModelAndView("index");
		return model;
	}

	@RequestMapping(value = "/logoutCompartamos", method = RequestMethod.GET)
	public void logoutCompartamos(HttpServletRequest req) {
		try {
			req.logout();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
