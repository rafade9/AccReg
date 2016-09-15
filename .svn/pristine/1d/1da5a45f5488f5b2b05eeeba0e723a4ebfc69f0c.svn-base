/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.CatalogosService;
import com.gentera.cuentasn.service.LeerCatalogos;

/**
 * Clase que implementa CatalogosService para la generación de catalogos
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Service
public class CatalogosServiceImpl implements CatalogosService {
	
	/**
	 * Recibe referencia de Servicio
	 */
	@Autowired
	LeerCatalogos leerCatalogos;

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.service.CatalogosService#getPaises()
	 */
	@Override
	public List<Pais> getPaises() {
		
		List<Pais> paises = leerCatalogos.leerCsvPaises();
		
		
		return paises;
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.service.CatalogosService#getEstados()
	 */
	@Override
	public List<Estado> getEstados() {
		List<Estado> estados = new ArrayList<Estado>();
		Estado estado = new Estado();
		estado.setClave("AGS");
		estado.setNombre("AGUASCALIENTES");
		estados.add(estado);
		estado = new Estado();
		estado.setClave("AGS");
		estado.setNombre("BAJA CALIFORNIA SUR");
		estados.add(estado);
		return estados;
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.service.CatalogosService#getEstadosByClavePais(java.lang.String)
	 */
	@Override
	public Estado[] getEstadosByClavePais(String clavePais) {
		return leerCatalogos.getEstadosByIdPais(clavePais);
	}

}
