package com.gentera.cuentasn.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.service.OperadoresYastasService;
import com.gentera.cuentasn.taks.ArchivoOperadoresTask;

@Service
public class OperadoresYastasServiceImpl implements OperadoresYastasService{

	final static Logger logger = Logger.getLogger(OperadoresYastasServiceImpl.class);

	@Override
	public List<String> obtenerOperadoresY() {

		logger.info("Entrando a tarea programa de carga Operadores Yastas");
		
		List<String> operadores = ArchivoOperadoresTask.obtenerOperadores();

		if(operadores != null){
			
			if(operadores.size()!=0){
				
				return operadores;
			}else{
				logger.error("**El archivo de Operadores esta vacio, no se puede establecer nueva lista de operadores**");
				return null;
			}
		}
		else{
			logger.error("**El archivo de Operadores no existe, no se puede establecer nueva lista de operadores**");
			return null;
		}
	}



}
