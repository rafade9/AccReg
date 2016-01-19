package com.gentera.cuentasn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.CatalogosService;
import com.gentera.cuentasn.service.LeerCatalogos;

@Service
public class CatalogosServiceImpl implements CatalogosService {
	
	@Autowired
	LeerCatalogos leerCatalogos;

	@Override
	public List<Pais> getPaises() {
		
		List<Pais> paises = leerCatalogos.leerCsvPaises();
		
		
		return paises;
	}

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

}
