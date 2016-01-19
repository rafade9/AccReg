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
	 * Muestra el login de Yastas
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/loginYastas", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "loginYastas";

	}

	/**
	 * Muestra el login de Compartamos
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/loginCompartamos", method = RequestMethod.GET)
	public String printLoginCompartamos(ModelMap model) {
		System.out.println("Entra a welcome Compartamos");
		return "loginCompartamos";

	}

	/**
	 * Servicio para realizar el login
	 * @param req
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value = "/loginProcessCompartamos", method = RequestMethod.POST)
	public ModelAndView loginProcessCompartamos(HttpServletRequest req, Usuario usuario) {
		ModelAndView model;
		try {
			
			//Verifica el origen
			if(usuario.getOrigen().toLowerCase().equals("compartamos"))
				model = new ModelAndView("registroCompartamos");
			else if(usuario.getOrigen().toLowerCase().equals("yastas"))
				model = new ModelAndView("registroYastas");
			else{
				model = new ModelAndView("paginaError");
				model.addObject("error", "No se puede detectar el origen.");
			}
			
			//Realiza el login con las credenciales dadas por el usuario
			req.login(usuario.getUsername(), usuario.getPassword());	
			
			return model;
				
		} catch (ServletException e) {
			
			if(usuario.getOrigen().toLowerCase().equals("compartamos"))
				model = new ModelAndView("loginCompartamos");
			else if(usuario.getOrigen().toLowerCase().equals("yastas"))
				model = new ModelAndView("loginYastas");
			else
				model = new ModelAndView("paginaError");
			
			
			if(e.getMessage().startsWith("Bad credentials")){
				model.addObject("error", "Usuario o password incorrecto");
			}
			else{
				model.addObject("error", "No se ha podido conectar");
			}
			return model;
		}
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
