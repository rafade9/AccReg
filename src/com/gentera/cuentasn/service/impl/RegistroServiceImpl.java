package com.gentera.cuentasn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compartamos.cm.cardmanagement.de_oa_i_104.CardNumbers;
import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.service.RegistroService;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;

@Service
public class RegistroServiceImpl implements RegistroService {
	
	final static Logger logger = Logger.getLogger(RegistroServiceImpl.class);
	
	@Autowired
	WebServiceConnector wsConnector;

	@Override
	public Respuesta registrar(Persona persona) throws Exception{
		Respuesta respuesta = new Respuesta();
		try{
			//Se realiza la conexion
			respuesta = wsConnector.sendData(persona);
			if(respuesta!=null && respuesta.getCodigo()!=null){
				logger.info("La respuesta trae codigo de retorno");
				System.out.println("---DATOS DE RESPUESTA---");
				System.out.println("BP: " + respuesta.getIdBP());
				System.out.println("Oportunidad: " + respuesta.getIdOportunidad());
				System.out.println("Clabe: " + respuesta.getCLABE());
				System.out.println("Cuenta: " + respuesta.getCuenta());
				System.out.println("Codigo de retorno: " + respuesta.getCodigo());
		
				if(respuesta.getCodigo()==0){
					respuesta.setMensaje("Cuenta Creada con &Eacute;xito");
					
					/*
					//Se busca el número de tarjeta
					CardNumbers[] cns = wsConnector.getTarjetas(respuesta.getIdBP());
					logger.info("Se recuperaron " + cns.length + " tarjetas.");
					for(CardNumbers cn : cns){
						if(validaNumeroTarjeta(cn.getCardNumber())){
							respuesta.setNumTarjeta(String.valueOf(cn.getCardNumber()));
							break;
						}
					}
					*/
					
					respuesta.setPersona(persona);
					
				}
//				else if(respuesta.getCodigo()==1 || respuesta.getCodigo()==2){
//					respuesta.setMensaje("El folio de la Tarjeta es inv&aacute;lido. Capture uno diferente.");
//				}
//				else if(respuesta.getCodigo()==7){
//					respuesta.setMensaje("El solicitante se encuentra en listas de bloqueo. Imprimir Carta de Lista de Personas Bloqueadas (En construcci&oacute;n).");
//				}
//				else {
//					respuesta.setMensaje("Su operaci&oacute;n no se pudo completar. Intente m&aacute;s tarde.");
//				}
			}
				
//			
//			Random random = new Random();
//			Integer valor = random.nextInt(3);
//			
//			switch(valor){
//			case 0:
//				respuesta.setCodigo(0);
//				respuesta.setMensaje("Proceso satisfactorio");
//				break;
//			
//			case 1:
//				respuesta.setCodigo(0);
//				respuesta.setMensaje("El folio de la Tarjeta es invalido");
//				break;
//				
//			case 2:
//				respuesta.setCodigo(0);
//				respuesta.setMensaje("El folio de la Tarjeta ya existe");
//				break;
//			}
		}catch(Exception e){
			logger.error(e.toString());
			throw new Exception(e);
		}
		
		return respuesta;
	}

	@Override
	public String pruebaWs() {
		try{
			logger.info("Va a consumir servicio");
			CardNumbers[] cns = wsConnector.getTarjetas("780125");
			logger.info("Consume servicio");
			logger.info("Se encontraron " + cns.length + " tarjetas");
			for(CardNumbers cn : cns){
				if(validaNumeroTarjeta(cn.getCardNumber())){
					System.out.println("Tarjeta encontrada");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	private boolean validaNumeroTarjeta(Long numero){
		String numStr = numero.toString().substring(7, 9);
		if(Integer.valueOf(numStr)>80 && Integer.valueOf(numStr)<99)
			return true;
		else
			return false;
	}

}
