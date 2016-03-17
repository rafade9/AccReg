/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.taks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.gentera.cuentasn.util.Properties;
import com.gentera.cuentasn.util.Util;

public class ArchivoOperadoresTask {

	public static List<String> obtenerOperadores(String tipoLectura){

		List<String> operadores = new ArrayList<String>();
		String cadena;

		FileReader f = null;
		BufferedReader b = null;
		boolean resultado = false;

//		Calendar calendario = new GregorianCalendar();
//
//		Integer dia = calendario.get(Calendar.DAY_OF_MONTH);
//		Integer mes = calendario.get(Calendar.MONTH)+1;
//		Integer anio = calendario.get(Calendar.YEAR);
//		String fecha = "";
//
//		if(dia<=9){
//			fecha = "0" + dia;
//		}else{
//			fecha += dia; 
//		}
//
//		if(mes<=9){
//			fecha+="0"+ mes;
//		}else{
//			fecha+=mes;
//		}
//
//		fecha += anio;

//		String archivo = "OperadoresYastasN2" + fecha+".properties";
		String archivo = "OperadoresYastasN2.properties";

		File fichero = new File(Properties.getProp("fileOperadores")+archivo);

		System.out.println(fichero);

		if(tipoLectura.equals("1")){
			while(!resultado){
				if(!fichero.exists()){
//					fecha = "";
//					dia-=1;
//					if(dia<=9 && dia >0){
//						fecha = "0" + dia;
//					}else if(dia==0){
//						mes -=1;
//						if(mes == 2){
//							dia = 29;
//							fecha = dia.toString();
//						}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
//							dia = 30;
//							fecha = dia.toString();
//						}else{
//						dia = 31;
//						fecha = dia.toString();
//						}
//					}else{
//						fecha += dia; 
//					}
//					if(mes<=9 && mes >0){
//						fecha+="0"+ mes;
//					}else if(mes == 0){
//						anio-=1;
//						mes = 12;
//						fecha+=mes;
//					}
//					else{
//						fecha+=mes;
//					}
//
//					fecha+=anio;
//					archivo = Properties.getProp("nombreArchivo") + fecha+".properties";
					archivo = Properties.getProp("nombreArchivo")+".properties";
					fichero = new File(Properties.getProp("fileOperadores")+archivo);
				}else{
					resultado = true;
				}
			}

		}else{
			if(fichero.exists()){
				resultado = true;
			}
		}

		if(resultado){

			try{
				try {

					f = new FileReader(fichero);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				b = new BufferedReader(f);
				try {
					while((cadena = b.readLine())!=null) {
						String numOperador[] = cadena.split("=");
						if(Util.isNumeric(numOperador[0])){
							operadores.add(numOperador[0]);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}finally{
				try {
					b.close();
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

			return operadores;
		}else{
			return null;
		}

	}
}
