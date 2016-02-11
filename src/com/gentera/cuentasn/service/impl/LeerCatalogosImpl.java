package com.gentera.cuentasn.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.LeerCatalogos;
import com.google.gson.Gson;

@Service
public class LeerCatalogosImpl implements LeerCatalogos {
	
	ClassLoader loader = LeerCatalogosImpl.class.getClassLoader();
	private static Gson gson = new Gson();
	private static Properties prop = new Properties();

	@Override
	public List<Pais> leerCsvPaises() {
		String csvPaises = LeerCatalogosImpl.class.getClassLoader().getResource("resources/csvPaises.csv").getPath().replaceAll("%20", " ");
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		Pais pais;
		List<Pais> paises = new ArrayList<Pais>();
		
		try{
//			br = new BufferedReader(new FileReader(csvPaises));
			br = new BufferedReader(new InputStreamReader(new FileInputStream(csvPaises), "UTF8"));
			while ((line = br.readLine()) != null) {

			        // use comma as separator
				String[] country = line.split(cvsSplitBy);
				pais = new Pais();
				pais.setClave(country[0]);
				pais.setNombre(country[1]);
				paises.add(pais);
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return paises;
	}

	@Override
	public List<Estado> leerCsvEstados() {
		return null;
	}

	@Override
	public Estado[] getEstadosByIdPais(String idPais) {
		try{
			prop.load(LeerCatalogosImpl.class.getClassLoader().getResourceAsStream("resources/Estados.properties"));
			Estado estado[] = gson.fromJson(prop.getProperty(idPais.toUpperCase()), Estado[].class);
			return estado;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
