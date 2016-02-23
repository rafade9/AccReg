package com.gentera.cuentasn.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.taks.ArchivoPlazasTask;
import com.gentera.cuentasn.util.PlazasArchivo;


public class PlazasInfoServiceImpl implements Job{

	final static Logger logger = Logger.getLogger(PlazasInfoServiceImpl.class);
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		logger.info("Entrando a tarea programa de lectura de Excel Plazas");
		
		List<Sucursal> sucursales = new ArrayList<Sucursal>();
		
		sucursales = ArchivoPlazasTask.obtenerIPs();
		
		if(sucursales != null){
			
			if(sucursales.size()!=0){
				
				PlazasArchivo.setPlazas(sucursales);
				
			}else{
				logger.error("**El archivo de Plaza esta vacio, no se puede establecer nuevas plazas**");
			}
			
		}else{
			
			logger.error("**El archivo de Plaza no existe, no se puede establecer nuevas plazas**");
		}
		
		logger.info("Saliendo de tarea programa lectura de Excel Plazas");
	}

}
