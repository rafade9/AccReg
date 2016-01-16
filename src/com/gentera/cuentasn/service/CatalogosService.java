package com.gentera.cuentasn.service;

import java.util.List;

import com.gentera.cuentasn.entities.Estado;
import com.gentera.cuentasn.entities.Pais;

public interface CatalogosService {
	
	public List<Pais> getPaises();
	
	public List<Estado> getEstados();

}
