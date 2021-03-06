/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.wsconnector.impl;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.Token;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub;
import com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.Execute;
import com.compartamos.cm.cardmanagement.de_oa_i_104.CMS_AccountAsignRequestStub.ExecuteResponse;
import com.compartamos.common.gdt.AcctOriginationBusinessPartnerName;
import com.compartamos.common.gdt.AcctOriginationBusinessPartnerPhone;
import com.compartamos.common.gdt.AddressTypeID;
import com.compartamos.common.gdt.BusinessDocumentMessageHeader;
import com.compartamos.common.gdt.BusinessPartnerDocumentIdentifier;
import com.compartamos.common.gdt.BusinessPartnerInternalID;
import com.compartamos.common.gdt.CommercelD;
import com.compartamos.common.gdt.CountryCode;
import com.compartamos.common.gdt.Date;
import com.compartamos.common.gdt.GLOBAL_DateTime;
import com.compartamos.common.gdt.GenderCode;
import com.compartamos.common.gdt.HouseID;
import com.compartamos.common.gdt.ItemID;
import com.compartamos.common.gdt.LANGUAGEINDEPENDENT_MEDIUM_Name;
import com.compartamos.common.gdt.OrganisationalCentreID;
import com.compartamos.common.gdt.PartyID;
import com.compartamos.common.gdt.PartyIdentifierTypeCode;
import com.compartamos.common.gdt.PhoneNumberSubscriberID;
import com.compartamos.common.gdt.PhoneNumberV1;
import com.compartamos.common.gdt.PhoneTypeID;
import com.compartamos.common.gdt.PostalCode;
import com.compartamos.common.gdt.RegionCode;
import com.compartamos.common.gdt.StreetName;
import com.compartamos.common.gdt.ZBankCardContractID;
import com.compartamos.common.structures.AcctOriginationBusinessPartnerAddress;
import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.service.LeerCatalogos;
import com.gentera.cuentasn.util.Properties;
import com.gentera.cuentasn.util.Util;
import org.datacontract.schemas._2004._07.wcfreferencemanager.ArrayOfReferenceAttributeData;
import org.datacontract.schemas._2004._07.wcfreferencemanager.ReferenceAttributeData;

import org.tempuri.CreationDateTime;
import org.tempuri.ExecuteIncrease;
import org.tempuri.ID;
import org.tempuri.RecipientBusinessSystemID;
import org.tempuri.RecipientParty;
import org.tempuri.ReferenceID;
import org.tempuri.ReferenceUUID;
import org.tempuri.SenderBusinessSystemID;
import org.tempuri.SenderParty;
import org.tempuri.TestDataIndicator;
import org.tempuri.UUID;
import org.datacontract.schemas._2004._07.wcfreferencemanager.ArrayOfContactPerson;
import org.datacontract.schemas._2004._07.wcfreferencemanager.ContactPerson;

import org.tempuri.ExecuteValidate;
import org.tempuri.ReferenceManagerStub;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;

import mx.com.gentera.crm.level2accountmanage.int_0133.BusinessPartnerCreateLevel2AccountData;
import mx.com.gentera.crm.level2accountmanage.int_0133.DT_Level2AccountCreationReq_sync;
import mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData;
import mx.com.gentera.crm.level2accountmanage.int_0133.Identifiers;
import mx.com.gentera.crm.level2accountmanage.int_0133.Level2AccountCreationData;
import mx.com.gentera.crm.level2accountmanage.int_0133.SI_LEVEL2ACCOUNTMANAGESYStub;
import mx.com.gentera.global.MT_Level2AccountCreationReq_sync;
import mx.com.gentera.global.MT_Level2AccountCreationResp_sync;

/**
 * Clase que implementa WebServiceConnector para el consumo de Servicios Web
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Service
public class WebServiceConnectorImpl implements WebServiceConnector {

	/**
	 * Log
	 */
	final static Logger logger = Logger.getLogger(WebServiceConnectorImpl.class);
	
	/**
	 * Variable que almacena el Endpoint de CRM
	 */
	final static String endPoint = Properties.getProp("EndPointCRM");
	
	/**
	 * Variable que almacena el Endpoint de Card Manager
	 */
	final static String endPointCardManager = Properties.getProp("EndPointCardManager");
	
	/**
	 * Variable que almacena el Endpoint de Card Manager para Reposicion
	 */
	final static String endPointCardManagerReposition = Properties.getProp("EndPointCardManagerReposicion");
	
	@Autowired
	LeerCatalogos leerCatalogos;

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.wsconnector.WebServiceConnector#sendData(com.gentera.cuentasn.entities.Persona)
	 */
	@Override
	public Respuesta sendData(Persona persona, String ip) throws Exception{
		Respuesta respuesta = new Respuesta();
		try {
		
			// Se genera el stub con el endpoint al cual apunta
			SI_LEVEL2ACCOUNTMANAGESYStub stub = new SI_LEVEL2ACCOUNTMANAGESYStub(endPoint);

			// Se configura autenticación
			HttpTransportProperties.Authenticator ba = new HttpTransportProperties.Authenticator();
			ba.setUsername(Properties.getProp("UserCRM"));
			ba.setPassword(Properties.getProp("PasswordCRM"));
			
			//Timeout
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, new Integer(Integer.valueOf(Properties.getProp("timeoutCRM"))));
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, new Integer(Integer.valueOf(Properties.getProp("timeoutCRM"))));
			//stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(Integer.valueOf(Properties.getProp("timeoutCRM")));

			stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			stub._getServiceClient().getOptions()
					.setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, ba);

			// Objeto MT sync
			MT_Level2AccountCreationReq_sync mtSync = new MT_Level2AccountCreationReq_sync();

			// Objeto DT sync
			DT_Level2AccountCreationReq_sync dtSync = new DT_Level2AccountCreationReq_sync();

			// Se genera un message header para incluir en DT sync
			BusinessDocumentMessageHeader messageHeader = new BusinessDocumentMessageHeader();
			// Se incluye la fecha actual
			GLOBAL_DateTime dateTime = new GLOBAL_DateTime();
			Calendar calendarToday = Calendar.getInstance();
			dateTime.setGLOBAL_DateTime(calendarToday); // Verificar
			messageHeader.setCreationDateTime(dateTime);

			/**
			 * DATA
			 */
			Level2AccountCreationData data = new Level2AccountCreationData();

			/**
			 * IDENTIFIERS
			 */
			Identifiers identifiers = new Identifiers();
			// ID Oficina ---Viene de CRM
			OrganisationalCentreID officeId = new OrganisationalCentreID();
			
			
			
			identifiers.setServiceOfficeID(officeId);

			// ID BP Empleado ---Viene de CRM
			BusinessPartnerInternalID bpEmpleado = new BusinessPartnerInternalID();
			
			Usuario user = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String origen = user.getOrigen();
			String numPlaza = "";
			String numEmpleado = "";
			
			if(origen.equals("compartamos")){
			
				numEmpleado = user.getNumEmpleado();
			
				if(numEmpleado==null){
					throw new Exception("El usuario " + user.getUsername() + " no cuenta con numero de nomina.");
				}
				//Se formatea el numero de empleado y se añade al bp
				numEmpleado = Util.formatNumEmpleado(numEmpleado);
				bpEmpleado.setBusinessPartnerInternalID(new Token(numEmpleado));
				
				Sucursal plaza = leerCatalogos.getSucursalPlaza(ip);
				
				if(plaza==null){
					throw new Exception("No se ha identificado la sucursal. No existe la ip("+ ip +") de origen.");
				}else{
					numPlaza = plaza.getId();
				}
				
				logger.info("ORIGINACION. Sucursal No. " + numPlaza);
				officeId.setOrganisationalCentreID(new Token(numPlaza));
			}
			
			else{
				
				Usuario usuario = leerCatalogos.getInfoPlazaByOperador(user.getUsername(), Properties.getProp("fileOperadores")+"OperadoresYastasN2.properties");
				
				numEmpleado = Util.formatNumEmpleado(usuario.getEmpleado());
				bpEmpleado.setBusinessPartnerInternalID(new Token(numEmpleado));
				
				numPlaza = usuario.getNumOficina();
				officeId.setOrganisationalCentreID(new Token(numPlaza));

			}
			
			identifiers.setServiceOfficeID(officeId);
			identifiers.setBusinessPartnerID(bpEmpleado);

			// ID Comercio --- Propio
			CommercelD commerce = new CommercelD();
			commerce.setCommercelD("J211");
			identifiers.setCommerceID(commerce);

			// ID Origen ---
			PartyID origin = new PartyID();
			origin.setPartyIDContent(new Token("Z06")); // Yastas
			identifiers.setOriginID(origin);

			data.setIdentifiers(identifiers);

			/**
			 * BP DATOS DE PERSONA
			 */
			BusinessPartnerCreateLevel2AccountData bp = new BusinessPartnerCreateLevel2AccountData();

			/**
			 * Data nombre
			 */
			AcctOriginationBusinessPartnerName nameData = new AcctOriginationBusinessPartnerName();
			LANGUAGEINDEPENDENT_MEDIUM_Name givenName = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name middleName = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name familyName = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name aditionalFamilyName = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name pais = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name municipio = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name ciudad = new LANGUAGEINDEPENDENT_MEDIUM_Name();
			LANGUAGEINDEPENDENT_MEDIUM_Name colonia = new LANGUAGEINDEPENDENT_MEDIUM_Name();

			// Primer nombre
			givenName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getPrimerNombre().toUpperCase().trim().replaceAll(" +", " "));
			nameData.setGivenName(givenName);

			// Segundo nombre
			if (persona.getSegundoNombre() != null && !persona.getSegundoNombre().equals("")) {
				middleName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getSegundoNombre().toUpperCase().trim().replaceAll(" +", " "));
				nameData.setMiddleName(middleName);
			}

			// Primer apellido
			familyName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getPaterno().toUpperCase().trim().replaceAll(" +", " "));
			nameData.setFamilyName(familyName);

			// Segundo apellido
			if (persona.getMaterno() != null && !persona.getMaterno().equals("")) {
				aditionalFamilyName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getMaterno().toUpperCase().trim().replaceAll(" +", " "));
				nameData.setAditionalFamilyName(aditionalFamilyName);
			}

			bp.setNameData(nameData);

			/**
			 * Fecha de Nacimiento
			 */
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date fechaDateUtil = dateFormat.parse(persona.getFechaNacimiento());
			Date fechaNacimiento = new Date();
			fechaNacimiento.setDate(fechaDateUtil);
			bp.setBirthDate(fechaNacimiento);

			/**
			 * Genero
			 */
			GenderCode genero = new GenderCode();
			genero.setGenderCode(new Token(persona.getGenero()));
			bp.setGender(genero);

			/**
			 * Identificacion
			 */
			BusinessPartnerDocumentIdentifier documentIdentifier = new BusinessPartnerDocumentIdentifier();
			// Tipo de identificacion
			PartyIdentifierTypeCode codeIdentifier = new PartyIdentifierTypeCode();
			codeIdentifier.setPartyIdentifierTypeCodeContent(new Token(persona.getTipoIdentificacion().toUpperCase().trim().replaceAll(" +", " ")));
			documentIdentifier.setCode(codeIdentifier);
			// Numero de identificacion
			ItemID idIdentifier = new ItemID();
			idIdentifier.setItemID(persona.getNumeroIdentificacion());
			documentIdentifier.setID(idIdentifier);
			bp.setDocumentIdentifier(documentIdentifier);

			/**
			 * Folio de tarjeta
			 */
			ZBankCardContractID cardIdentification = new ZBankCardContractID();
			cardIdentification.setZBankCardContractIDContent(new Token(Util.withoutZeros(persona.getFolio())));
			bp.setCardIdentification(cardIdentification);

			/**
			 * Lugar de nacimiento
			 */

			RegionCode regionBirth = new RegionCode();
			// regionBirth.setRegionCode(new
			// Token(persona.getPaisNacimiento()));
			regionBirth.setRegionCode(new Token(persona.getLugarNacimiento()));
			bp.setRegionBirth(regionBirth);

			/**
			 * Pais nacimiento
			 */
			CountryCode countryCode = new CountryCode();
			// countryCode.setCountryCode(new
			// Token(persona.getLugarNacimiento()));
			countryCode.setCountryCode(new Token(persona.getPaisNacimiento()));
			bp.setBirthCountryCode(countryCode);

			/**
			 * Nacionalidad
			 */
			CountryCode cp = new CountryCode();
			cp.setCountryCode(new Token("MX")); //
			bp.setCitizenshipCode(cp);

			/**
			 * Telefono
			 */
			if(!persona.getTelefono().equals("")){
				AcctOriginationBusinessPartnerPhone phoneData = new AcctOriginationBusinessPartnerPhone();
				// Tipo de telefono
				PhoneTypeID phoneType = new PhoneTypeID();
				
				if(persona.isSms()){
					phoneType.setPhoneTypeID(new Token("6"));
				}else{
					phoneType.setPhoneTypeID(new Token(persona.getTipoTelefono()));
				}
				
				phoneData.setPhoneTypeID(phoneType);
				PhoneNumberV1 phoneNumber = new PhoneNumberV1();
				PhoneNumberSubscriberID number = new PhoneNumberSubscriberID();
				number.setPhoneNumberSubscriberID(new Token(persona.getTelefono()));

				phoneNumber.setSubscriberID(number);
				phoneData.setPhoneNumber(phoneNumber);
				bp.setPhoneData(phoneData);
			}
			/**
			 * DIRECCION
			 */
			AcctOriginationBusinessPartnerAddress addressData = new AcctOriginationBusinessPartnerAddress();
			// Tipo de direccion (principal)
			AddressTypeID addressTypeCode = new AddressTypeID();
			addressTypeCode.setAddressTypeID("DEF");
			addressData.setAddressTypeCode(addressTypeCode);
			// Codigo Postal
			PostalCode pc = new PostalCode();
			pc.setPostalCode(new Token(persona.getCodigoPostal()));
			addressData.setStreetPostalCode(pc);
			// Pais
			pais.setLANGUAGEINDEPENDENT_MEDIUM_Name("MX");
			addressData.setCountryName(pais);
			// Estado
			RegionCode regionCode = new RegionCode();
			regionCode.setRegionCode(new Token(persona.getEstado()));
			addressData.setRegionCode(regionCode);
			// Municipio o Delegacion
			if(persona.getDelegacion().length()>40)
				municipio.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getDelegacion().toUpperCase().trim().replaceAll(" +", " ").substring(0, 40));
			else
				municipio.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getDelegacion().toUpperCase().trim().replaceAll(" +", " "));
			addressData.setDistrictName(municipio);
			// Ciudad
			if(persona.getCiudad().length()>40)
				ciudad.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getCiudad().toUpperCase().trim().replaceAll(" +", " ").substring(0, 40));
			else
				ciudad.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getCiudad().toUpperCase().trim().replaceAll(" +", " "));
			addressData.setCityName(ciudad);
			// Colonia
			if(persona.getColonia().length()>40)
				colonia.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getColonia().toUpperCase().trim().replaceAll(" +", " ").substring(0, 40));
			else
				colonia.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getColonia().toUpperCase().trim().replaceAll(" +", " "));
			addressData.setAdditionalCityName(colonia);
			// Calle
			StreetName streetName = new StreetName();
			streetName.setStreetName(persona.getCalle().toUpperCase().trim().replaceAll(" +", " "));
			addressData.setStreetName(streetName);
			// No Ext
			HouseID numExt = new HouseID();
			numExt.setHouseID(new Token(persona.getNumExterior().toUpperCase().trim().replaceAll(" +", " ")));
			addressData.setHouseID(numExt);
			// No Int
			if (persona.getNumInterior() != null && !persona.getNumInterior().equals("")) {
				HouseID numInt = new HouseID();
				numInt.setHouseID(new Token(persona.getNumInterior().toUpperCase().trim().replaceAll(" +", " ")));
				addressData.setAdditionalHouseID(numInt);
			}
			bp.setAddressData(addressData);

			data.setBusinessPartnerCreateLevel2AccountData(bp);

			dtSync.setMessageHeader(messageHeader);
			dtSync.setLevel2AccountCreationData(data);
			mtSync.setMT_Level2AccountCreationReq_sync(dtSync);
			
			logger.info("ORIGINACION. Se envia peticion a CRM con los sig datos:"
					+ " ---->Origen: " + origen
					+ " ---->Sucursal: " + numPlaza
					+ " ---->Empleado: " + numEmpleado
					+ " ---->Usuario app: " + user.getUsername()
					+ " ---->Folio: " + persona.getFolio()
					+ " ---->Usuario CRM: " + Properties.getProp("UserCRM")
					+ " ---->Endpoint CRM: " + endPoint);
			
			MT_Level2AccountCreationResp_sync response = stub.createLevel2Account(mtSync);

//			if (response.getMT_Level2AccountCreationResp_sync().getLog().getItem() != null) {
//				String code = response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getCategoryCode()
//						.toString();
//				logger.error("Respuesta de CRM: "
//						+ " ---->Folio: " + persona.getFolio()
//						+ " ---->Codigo: " + response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getCategoryCode()
//						+ " ---->Nota: " + response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getNote().toString());
//				respuesta.setCodigo(Integer.valueOf(code));
//				respuesta.setMensaje(response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getNote().toString());
//			} else {
//				logger.info("Respuesta exitosa de CRM: "
//						+ " ---->Folio: " + persona.getFolio()
//						+ " ---->Codigo: 0");
//				respuesta.setCodigo(0); // Cambia?
//			}
			
			//Se valida que venga el objeto log
			if(response.getMT_Level2AccountCreationResp_sync().getLog() != null){
				//Se valida que venga el objeto BusinessDocumentProcessingResultCode
				if(response.getMT_Level2AccountCreationResp_sync().getLog().getBusinessDocumentProcessingResultCode()!=null){
					String resultCode = response.getMT_Level2AccountCreationResp_sync().getLog().getBusinessDocumentProcessingResultCode().toString();
					//Se valida la respuesta obtenida
					if(resultCode.equals("3")){
						respuesta.setCodigo(0);
						respuesta.setCodigoServicios(Integer.valueOf(response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getSeverityCode().toString()));
						respuesta.setMensaje(response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getNote().toString());
						
						logger.info("ORIGINACION. Respuesta exitosa de CRM: "
								+ " ---->Folio: " + persona.getFolio()
								+ " ---->Codigo: 0"
								+ " ---->Servicios digitales: " + respuesta.getMensaje());
					}else if(resultCode.equals("5")){
						//Se valida que venga un objeto Item
						if(response.getMT_Level2AccountCreationResp_sync().getLog().getItem()!=null){
							int longitud = response.getMT_Level2AccountCreationResp_sync().getLog().getItem().length;
							String code = response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[longitud-1].getCategoryCode().toString();
							respuesta.setCodigo(Integer.valueOf(code));
							respuesta.setMensaje(response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[longitud-1].getNote().toString());
							
							logger.error("ORIGINACION. Respuesta de CRM: "
									+ " ---->Folio: " + persona.getFolio()
									+ " ---->Codigo: " + response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[longitud-1].getCategoryCode()
									+ " ---->Nota: " + response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[longitud-1].getNote().toString());
						}else{
							throw new Exception("La respuesta de CRM no contiene Item");
						}
					}else{
						throw new Exception("Error no mapeado de CRM");
					}
				}else{
					throw new Exception("No existe objeto BusinessDocumentProcessingResultCode en respuesta de CRM.");
				}
			}else{
				throw new Exception("Trama de respuesta de CRM incompleta.");
			}
			

			if (respuesta.getCodigo() != null) {
				if (respuesta.getCodigo() == 0) {
					respuesta.setIdBP(response.getMT_Level2AccountCreationResp_sync()
							.getLevel2AccountCreationDataResponse().getBusinessPartnerIDCreated().toString());
					respuesta.setCLABE(response.getMT_Level2AccountCreationResp_sync()
							.getLevel2AccountCreationDataResponse().getCLABEAccount().toString());
					// respuesta.setCuenta(response.getMT_Level2AccountCreationResp_sync().getLevel2AccountCreationDataResponse().getBankAccountContractID().toString());
					respuesta.setCuenta(respuesta.getCLABE().substring(6, 17));
					respuesta.setIdOportunidad(response.getMT_Level2AccountCreationResp_sync()
							.getLevel2AccountCreationDataResponse().getOpportunityID().toString());
				}
			}

		} catch (AxisFault e) {
			logger.error("ORIGINACION. Error AxisFault " + e);
			respuesta.setCodigo(99);
//			e.printStackTrace();
			throw new Exception(e);
		} catch (RemoteException e) {
			logger.error("ORIGINACION. Error Remote " + e);
			respuesta.setCodigo(99);
//			e.printStackTrace();
			throw new Exception(e);
		} catch (ExchangeFaultData e) {
			logger.error("ORIGINACION. Error Exchange Data " + e);
			respuesta.setCodigo(99);
//			e.printStackTrace();
			throw new Exception(e);
		} catch (ParseException e) {
			logger.error("ORIGINACION. Error Parse " + e);
			respuesta.setCodigo(99);
//			e.printStackTrace();
			throw new Exception(e);
		} catch (Exception e) {
			logger.error("ORIGINACION. Error General" + e);
			e.printStackTrace();
			throw new Exception(e);
		}
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.wsconnector.WebServiceConnector#sendDataReposition()
	 */
	@Override
	public Respuesta sendDataReposition(Persona persona) throws Exception {
		Respuesta respuesta = new Respuesta();
		
		try{
			
			Usuario user = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			Usuario usuario = leerCatalogos.getInfoPlazaByOperador(user.getUsername(), Properties.getProp("fileOperadores")+"OperadoresYastasN2.properties");
			String numEmpleado = Util.formatNumEmpleado(usuario.getEmpleado());
			
			// Se genera el stub con el endpoint al cual apunta
			CMS_AccountAsignRequestStub stub = new CMS_AccountAsignRequestStub(endPointCardManagerReposition);
			
			// Se configura autenticación
			HttpTransportProperties.Authenticator ba = new HttpTransportProperties.Authenticator();
			ba.setUsername(Properties.getProp("UserCardManagerReposition"));
			ba.setPassword(Properties.getProp("PasswordCardManagerReposition"));
			
			stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
					Boolean.FALSE);
			stub._getServiceClient().getOptions()
					.setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, ba);
			
			//Se genera instancia de Execute para data
			Execute data = new Execute();
			
			//Se incluye folio
			data.setCardID(persona.getFolio());
			
			//Se incluye fecha de nacimiento
			data.setBankCardCardHolderParty(persona.getFechaNacimiento());
			
			//Se incluye referencia
			data.setBankAccountID(persona.getReferencia());
			
			//Otros datos requeridos
			data.setCMSUserId(Properties.getProp("CMSUserIdReposition"));
			data.setExternalUser("IDOperador-"+user.getUsername()+", EmpResponsable-"+numEmpleado);
			
			logger.info("REPOSICION. Se envia peticion a CMS con los sig datos:"
					+ " ---->Usuario CMS: " + Properties.getProp("UserCardManagerReposition")
					+ " ---->Usuario Interno: " + Properties.getProp("CMSUserIdReposition")
					+ " ---->Referencia " + persona.getReferencia()
					+ " ---->Folio" + persona.getFolio()
					+ " ---->Endpoint CRM: " + endPointCardManagerReposition);
			
			ExecuteResponse response = stub.execute(data);
			logger.info("REPOSICION. Respuesta de CMS: "
					+ "---->Referencia: " + persona.getReferencia()
					+ "---->Folio: " + persona.getFolio()
					+ "---->Codigo: " + response.getExecuteResult().getRCCode()
					+ "---->Descripcion: " + response.getExecuteResult().getRCDescription());
			System.out.println(response.getExecuteResult().getRCCode() + " - " + response.getExecuteResult().getRCDescription());
			
			if(response!=null && response.getExecuteResult()!=null){
				respuesta.setCodigo((int)response.getExecuteResult().getRCCode());
				respuesta.setMensaje(response.getExecuteResult().getRCDescription());
			}
		}catch (AxisFault e) {
			logger.error("REPOSICION. Error AxisFault " + e);
			respuesta.setCodigo(99);
			e.printStackTrace();
			throw new Exception(e);
		} catch (RemoteException e) {
			logger.error("REPOSICION. Error Remote " + e);
			respuesta.setCodigo(99);
			e.printStackTrace();
			throw new Exception(e);
		} catch(Exception e){
			logger.error("REPOSICION. Error general" + e);
			e.printStackTrace();
			throw new Exception(e);
		}
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.wsconnector.WebServiceConnector#validateReference(com.gentera.cuentasn.entities.Persona)
	 */
	@Override
	public Respuesta validateReference(Persona persona, String guid) throws Exception {
		Respuesta respuesta = new Respuesta();
		
		//Se recupera ambiente configurado
		String ambiente = Properties.getProp("Ambiente");
		
		/**
		 * Endpoint
		 */
		String endPointRms = Properties.getProp("EndPointRMS");
		
		guid = "414e414c363230343932303731323136";
		
		ReferenceManagerStub stub = new ReferenceManagerStub(endPointRms);
		
		//Timeout
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, new Integer(Integer.valueOf(Properties.getProp("timeoutWS"))));
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, new Integer(Integer.valueOf(Properties.getProp("timeoutWS"))));
		
		/**
		 * FECHA DE CREACION - CreationDateTime
		 */
		CreationDateTime creationDateTime = new CreationDateTime();
		creationDateTime.setCreationDateTime(Calendar.getInstance());
		
		/**
		 * ID - ID
		 */
		ID id = new ID();
		id.setID(guid); 
		
		/**
		 * RECIPIENT BUSINESS SYSTEM - RecipientBusinessSystemID
		 */
		RecipientBusinessSystemID recipientBusinessSystemID = new RecipientBusinessSystemID();
		recipientBusinessSystemID.setRecipientBusinessSystemID(Properties.getProp("recipient")); 
		
		/**
		 * PERSONAS DE CONTACTO
		 */
		RecipientParty recipientParty = new RecipientParty();
		
		//Objeto que contiene array de contactos
		ArrayOfContactPerson contactPersons = new ArrayOfContactPerson();
		
		//Array de contactos
		ContactPerson[] contactPersonsArray = new ContactPerson[1];
		
		//Unico contacto
		ContactPerson contactPerson = new ContactPerson();
		contactPerson.setInternalID(Properties.getProp("internalId"));
		contactPersonsArray[0] = contactPerson;
		
		contactPersons.setContactPerson(contactPersonsArray);
		recipientParty.setRecipientParty(contactPersons);
		
		/**
		 * REFERENCE ID
		 */
		ReferenceID referenceID = new ReferenceID();
		referenceID.setReferenceID(guid); //32 HEX
		
		/**
		 * REFERENCE UUID
		 */
		ReferenceUUID referenceUUID = new ReferenceUUID();
		referenceUUID.setReferenceUUID(guid); //32 HEX
		
		/**
		 * ORIGEN
		 */
		SenderBusinessSystemID senderBusinessSystemID = new SenderBusinessSystemID();
		senderBusinessSystemID.setSenderBusinessSystemID(Properties.getProp("sender"));
		
		/**
		 * 
		 */
		SenderParty senderParty = new SenderParty();
		
		//Objeto que contiene array de contactos
//		ArrayOfContactPerson contactPersons2 = new ArrayOfContactPerson();
		
		senderParty.setSenderParty(contactPersons);
		
		//Objeto UUID - UUID
		UUID uuid = new UUID();
		uuid.setUUID(guid); //----GENERAR CODIGO 32 DIG HEX
		
		
		TestDataIndicator test = new TestDataIndicator();
		test.setTestDataIndicator("0"); //ENVIAR 0
		
		/*
		 * DATA
		 */
		ExecuteValidate executeValidate = new ExecuteValidate();
		org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteValidate param = new org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteValidate();
		
		//Tipo de referencia
		param.setReferenceType(Properties.getProp("referenceType"));
		//No. de Referencia
		param.setReferenceNumber(persona.getReferencia());
		//Atributos donde se envia la fecha de nacimiento
		ArrayOfReferenceAttributeData attributesData = new ArrayOfReferenceAttributeData();
		ReferenceAttributeData[] attributeData = new ReferenceAttributeData[1];
		attributesData.setReferenceAttributeData(attributeData);

		//BIRTHDATE: Dato de fecha de nacimiento
		ReferenceAttributeData birthdate = new ReferenceAttributeData();
		birthdate.setAttributeName("BIRTHDATE");
		birthdate.setAttributeValue(persona.getFechaNacimiento());
		attributeData[0] = birthdate;
		
		param.setReferenceAttributesData(attributesData);
		
		executeValidate.setExecuteValidate(param);
		
		org.tempuri.ExecuteResponse response = stub.validateRequestReference(executeValidate, creationDateTime, id, recipientBusinessSystemID, recipientParty, referenceID, referenceUUID, senderBusinessSystemID, senderParty, test, uuid);
		logger.info("Respuesta RMS Validate: " + response.getLog().getBusinessDocumentProcessingResultCode());
		respuesta.setCodigo(response.getLog().getBusinessDocumentProcessingResultCode());
		
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.wsconnector.WebServiceConnector#increaseReference(com.gentera.cuentasn.entities.Persona)
	 */
	@Override
	public Respuesta increaseReference(Persona persona) throws Exception {
		Respuesta respuesta = new Respuesta();
		try{
			ReferenceManagerStub stub = new ReferenceManagerStub(endPointCardManagerReposition);
			
			//Timeout
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, new Integer(Integer.valueOf(Properties.getProp("timeoutCRM"))));
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, new Integer(Integer.valueOf(Properties.getProp("timeoutCRM"))));
			
			
			/**
			 * DATA
			 */
			
			ExecuteIncrease executeIncrease = new ExecuteIncrease();
			org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteIncrease data = new org.datacontract.schemas._2004._07.wcfreferencemanager.ExecuteIncrease();
			
			
			//BIRTHDATE REFERENCEATTRIBUTESDATA
			
			//data.set
			executeIncrease.setExecuteIncrease(data);
			
			/**
			 * FECHA DE CREACION - CreationDateTime
			 */
			CreationDateTime creationDateTime = new CreationDateTime();
			creationDateTime.setCreationDateTime(Calendar.getInstance());
			
			/**
			 * ID - ID
			 */
			ID id = new ID();
			id.setID("1");
			
			/**
			 * RECIPIENT BUSINESS SYSTEM - RecipientBusinessSystemID
			 */
			RecipientBusinessSystemID recipientBusinessSystemID = new RecipientBusinessSystemID();
			recipientBusinessSystemID.setRecipientBusinessSystemID("1");
			
			/**
			 * PERSONAS DE CONTACTO
			 */
			RecipientParty recipientParty = new RecipientParty();
			
			//Objeto que contiene array de contactos
			ArrayOfContactPerson contactPersons = new ArrayOfContactPerson();
			
			//Array de contactos
			ContactPerson[] contactPersonsArray = new ContactPerson[1];
			
			//Unico contacto
			ContactPerson contactPerson = new ContactPerson();
			contactPerson.setInternalID("N2");
			contactPersonsArray[0] = contactPerson;
			
			contactPersons.setContactPerson(contactPersonsArray);
			recipientParty.setRecipientParty(contactPersons);
			
			/**
			 * REFERENCE ID
			 */
			ReferenceID referenceID = new ReferenceID();
			referenceID.setReferenceID("SDF10");
			
			/**
			 * REFERENCE UUID
			 */
			ReferenceUUID referenceUUID = new ReferenceUUID();
			referenceUUID.setReferenceUUID("SDF10");
			
			/**
			 * ORIGEN
			 */
			SenderBusinessSystemID senderBusinessSystemID = new SenderBusinessSystemID();
			senderBusinessSystemID.setSenderBusinessSystemID("N2WEB");
			
			/**
			 * 
			 */
			SenderParty senderParty = new SenderParty();
			
			//Objeto que contiene array de contactos
//			ArrayOfContactPerson contactPersons2 = new ArrayOfContactPerson();
			
			senderParty.setSenderParty(contactPersons);
			
			//Objeto UUID - UUID
			UUID uuid = new UUID();
			uuid.setUUID("X");
			
			
			TestDataIndicator test = new TestDataIndicator();
			test.setTestDataIndicator("X");
			
			
			stub.increaseRequestReference(executeIncrease, creationDateTime, id, recipientBusinessSystemID, recipientParty, referenceID, referenceUUID, senderBusinessSystemID, senderParty, test, uuid);
		}catch(Exception e){
			
		}
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.wsconnector.WebServiceConnector#assignCard(com.gentera.cuentasn.entities.Persona)
	 */
	@Override
	public Respuesta assignCard(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return null;
		
		
		
		
		//UTILIZADA
	}

	/* (non-Javadoc)
	 * @see com.gentera.cuentasn.wsconnector.WebServiceConnector#getTarjetas(java.lang.String)
	 */
//	public CardNumbers[] getTarjetas(String bp) {}

}
