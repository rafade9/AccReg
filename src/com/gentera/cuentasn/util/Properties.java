package com.gentera.cuentasn.util;

import java.io.InputStream;

import org.apache.log4j.Logger;

public class Properties {
	
	final static Logger logger = Logger.getLogger(Properties.class);
	
	static java.util.Properties prop = new java.util.Properties();
	static InputStream input = null;
	static String filename = "resources/Config.properties";
	
	public static String getProp(String key){
		String property = "";
		try{
			input = Properties.class.getClassLoader().getResourceAsStream(filename);
			if(input == null){
				logger.error("No se encuentra el archivo de configuracion");
				return null;
			}
			
			prop.load(input);
			
			property = prop.getProperty(key);
			
			if(property == null || property.equals("")){
				logger.error("No existe la propiedad " + key);
				return null;
			}
			
			return property;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return property;
	}

}
