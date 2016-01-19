package com.gentera.cuentasn.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gentera.cuentasn.entities.Usuario;
import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.multitype.GenericManageableCaptchaService;

@Controller
public class loginController {

	@Autowired
	private GenericManageableCaptchaService miCaptchaService;

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
			

			/**
			 * Verifica el origen
			 */
			
			//Origen compartamos
			if(usuario.getOrigen()!=null && usuario.getOrigen().toLowerCase().equals("compartamos")){
				model = new ModelAndView("registroCompartamos");
				//Realiza el login con las credenciales dadas por el usuario mediante el authentication manager
				req.login(usuario.getUsername(), usuario.getPassword());
			}
			//Origen Yastas
			else if(usuario.getOrigen()!= null && usuario.getOrigen().toLowerCase().equals("yastas")){
				model = new ModelAndView("registroYastas");
				
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
				e.printStackTrace();
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
	
	@RequestMapping(value = "/loginPrueba", method = RequestMethod.GET)
	public ModelAndView loginPrueba(Usuario usuario){
		ModelAndView model = new ModelAndView("loginPrueba");
		return model;
	}
	
	@RequestMapping(value = "/loginPruebaCaptcha", method = RequestMethod.POST)
	public ModelAndView loginPruebaCaptcha(HttpServletRequest request, Usuario usuario){
		ModelAndView model = new ModelAndView("index");
		String captchaId = request.getSession().getId();
		System.out.println(captchaId);
		System.out.println(usuario.getCaptcha());
		boolean captchaPassed = false;
		
		try{
    		captchaPassed = miCaptchaService.validateResponseForID(captchaId, usuario.getCaptcha());
    		System.out.println("Resultado de evaluación: " + captchaPassed);
    	}catch(CaptchaServiceException ex){
    		throw new LockedException("Captcha incorrecto.");
    	}

		return model;
	}

}
