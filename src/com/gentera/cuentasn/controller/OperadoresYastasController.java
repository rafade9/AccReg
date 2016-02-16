package com.gentera.cuentasn.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.gentera.cuentasn.service.OperadoresYastasService;
import com.gentera.cuentasn.util.OperadoresArchivo;



public class OperadoresYastasController {


	@Autowired
	OperadoresYastasService operadoresYastas;

	public void obtenerOperadores(){

		List<String> operadores = new ArrayList<String>();

			operadores =operadoresYastas.obtenerOperadoresY();

			if(operadores !=null){
				
				OperadoresArchivo.setNumOperadores(operadores);

			}
			
	}
}
