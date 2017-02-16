/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.service.LeerCatalogos;
import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.multitype.GenericManageableCaptchaService;

/**
 * Clase Controller que comunica frontend con backend
 * @author Rafael Delgadillo
 * @version 1.0
 * 
 */
@Controller
public class loginController {

	/**
	 * Clase para manejo de captcha
	 */
	@Autowired
	private GenericManageableCaptchaService miCaptchaService;
	
	/**
	 * Clase para manejo de catalogos
	 */
	@Autowired
	private LeerCatalogos leerCatalogos;

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
		return "loginCompartamos";

	}

	/**
	 * Servicio para realizar el login
	 * @param req
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest req, Usuario usuario) {
		ModelAndView model;
		try {
			

			/**
			 * Verifica el origen
			 */
			System.out.println("Ip: " + req.getRemoteHost());
			//Origen compartamos
			if(usuario.getOrigen()!=null && usuario.getOrigen().toLowerCase().equals("compartamos")){
				model = new ModelAndView("redirect:/registroCompartamos");
//				model = new ModelAndView("registroCompartamos");

				//Verifica ip
//				if(!leerCatalogos.isIpPermitida(req.getRemoteHost())){
//					model = new ModelAndView("loginCompartamos");
//					model.addObject("error", "Acceso no autorizado");
//					return model;
//				}
				//Realiza el login con las credenciales dadas por el usuario mediante el authentication manager
				req.login(usuario.getUsername(), usuario.getPassword());
			}
			//Origen Yastas
			else if(usuario.getOrigen()!= null && usuario.getOrigen().toLowerCase().equals("yastas")){
				model = new ModelAndView("menuYastas");
				
				/**
				 * Valida captcha
				 */
				//Correcta
				if(miCaptchaService.validateResponseForID(req.getSession().getId(), usuario.getCaptcha())){
					req.login(usuario.getUsername(), "12345678");
				}
				//Incorrecta
				else{
					model = new ModelAndView("loginYastas");
					model.addObject("error", "Captcha incorrecto!");
				}
			}
			//Si no encuentra el origen, manda a paginaError
			else{
				model = new ModelAndView("paginaError");
				model.addObject("error", "No se puede detectar el origen.");
			}
			
			//Validar folio
			//validarFolio(folio)
			
			return model;
				
		} catch(CaptchaServiceException ex){
    		throw new LockedException("Captcha incorrecto.");
    		
    	}catch (ServletException e) {
			
			if(usuario.getOrigen().toLowerCase().equals("compartamos"))
				model = new ModelAndView("loginCompartamos");
			else if(usuario.getOrigen().toLowerCase().equals("yastas"))
				model = new ModelAndView("loginYastas");
			else
				model = new ModelAndView("paginaError");
			
			
			if(e.getMessage().startsWith("Bad credentials")){
				model.addObject("error", "Usuario o password incorrecto");
			}
			else if(e.getMessage().startsWith("Cannot perform login for")){
				logoutCompartamos(req, null, usuario.getOrigen());
				model.addObject("error", "No se ha podido conectar, por favor intente nuevamente.");
			}
			else{
				model.addObject("error", "No se ha podido conectar");
				e.printStackTrace();
			}
			return model;
		}
	}

	@RequestMapping(value = "/logout/{origen}", method = RequestMethod.GET)
	public String logoutCompartamos(HttpServletRequest req, HttpServletResponse res, @PathVariable String origen) {
		
		try {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			if(auth != null){
				new SecurityContextLogoutHandler().logout(req, res, auth);
			}
			
			if(origen.toUpperCase().equals("COMPARTAMOS")){
				return "redirect:/loginCompartamos";
			}else if(origen.toUpperCase().equals("YASTAS")){
				return "redirect:https://www.compartamos.com/CuentasN2/loginYastas";
//				return "redirect:/loginYastas";
			}else{
				return "redirect:/paginaError";
			}
		} 
		catch(Exception e){
			e.printStackTrace();
			return "redirect:/paginaError";
		}
		
		
	}

}
