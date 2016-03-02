/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.util;

import java.io.InputStream;

import org.apache.log4j.Logger;

/**
 * Clase de utileria para lectura de archivo properties de configuracion
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class Properties {

	/**
	 * Log
	 */
	final static Logger logger = Logger.getLogger(Properties.class);

	/**
	 * Clase properties para manejo de propiedades
	 */
	static java.util.Properties prop = new java.util.Properties();

	/**
	 * Clase inputStream para lectura
	 */
	static InputStream input = null;

	/**
	 * Clase Strin para manejar nombre de archivo de propiedades
	 */
	static String filename = "resources/Config.properties";

	/**
	 * Metodo estático para consultar el valor de una propiedad
	 * @param key la llave a consultar
	 * @return valor correspondiente a la llave
	 */
	public static String getProp(String key) {
		String property = "";
		try {
			input = Properties.class.getClassLoader().getResourceAsStream(filename);
			if (input == null) {
				logger.error("No se encuentra el archivo de configuracion");
				return null;
			}

			prop.load(input);

			property = prop.getProperty(key);

			if (property == null || property.equals("")) {
				logger.error("No existe la propiedad " + key);
				return null;
			}

			return property;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return property;
	}

}
