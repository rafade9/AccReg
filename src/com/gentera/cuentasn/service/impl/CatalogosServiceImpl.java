package com.gentera.cuentasn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Pais;
import com.gentera.cuentasn.service.CatalogosService;

@Service
public class CatalogosServiceImpl implements CatalogosService {

	@Override
	public List<Pais> getPaises() {
		List<Pais> paises = new ArrayList<Pais>();
		Pais pMex = new Pais();
		pMex.setNombre("Mexico");
		pMex.setClave("MEX");
		paises.add(pMex);
		pMex = new Pais();
		pMex.setNombre("Afganistan");
		pMex.setClave("AFG");
		paises.add(pMex);
		pMex = new Pais();
		pMex.setNombre("Albania");
		pMex.setClave("ALB");
		paises.add(pMex);
		return paises;
	}

}
