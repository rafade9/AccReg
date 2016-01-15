package com.gentera.cuentasn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.CatalogosService;

@Controller
@RequestMapping(value="/catalogos")
public class CatalogosController {
	
	@Autowired
	CatalogosService catalogos;

	@RequestMapping(value = "/paises", method = RequestMethod.GET)
	public @ResponseBody List<Pais> getPaises() {
		return catalogos.getPaises();
	}
}
