package com.gentera.cuentasn.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.RegistroService;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;

@Service
public class RegistroServiceImpl implements RegistroService {
	
	@Autowired
	WebServiceConnector wsConnector;

	@Override
	public Respuesta registrar(Persona persona) {
		Respuesta respuesta = new Respuesta();
		Random random = new Random();
		Integer valor = random.nextInt(3);
		
		switch(valor){
		case 0:
			respuesta.setCodigo(0);
			respuesta.setMensaje("Proceso satisfactorio");
			break;
		
		case 1:
			respuesta.setCodigo(0);
			respuesta.setMensaje("El folio de la Tarjeta es invalido");
			break;
			
		case 2:
			respuesta.setCodigo(0);
			respuesta.setMensaje("El folio de la Tarjeta ya existe");
			break;
		}
		
		
		return respuesta;
	}

	@Override
	public String pruebaWs() {
		Persona persona = new Persona();
		wsConnector.sendData(persona);
		return null;
	}

}
