package com.gentera.cuentasn.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.service.OperadoresYastasService;
import com.gentera.cuentasn.taks.ArchivoOperadoresTask;
import com.gentera.cuentasn.util.OperadoresArchivo;

@Service
public class OperadoresYastasServiceImpl implements Job{

	final static Logger logger = Logger.getLogger(OperadoresYastasServiceImpl.class);

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		logger.info("Entrando a tarea programa de carga Operadores Yastas");
		
		List<String> operadores = ArchivoOperadoresTask.obtenerOperadores();

		if(operadores != null){
			
			if(operadores.size()!=0){
				
				OperadoresArchivo.setNumOperadores(operadores);
				
			}else{
				logger.error("**El archivo de Operadores esta vacio, no se puede establecer nueva lista de operadores**");
			}
		}
		else{
			logger.error("**El archivo de Operadores no existe, no se puede establecer nueva lista de operadores**");
			
		}
		
	}


}
