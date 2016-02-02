package com.gentera.cuentasn.wsconnector.impl;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.databinding.types.Token;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

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
import com.gentera.cuentasn.util.Properties;
import com.gentera.cuentasn.wsconnector.WebServiceConnector;

import mx.com.gentera.crm.level2accountmanage.int_0133.BusinessPartnerCreateLevel2AccountData;
import mx.com.gentera.crm.level2accountmanage.int_0133.DT_Level2AccountCreationReq_sync;
import mx.com.gentera.crm.level2accountmanage.int_0133.ExchangeFaultData;
import mx.com.gentera.crm.level2accountmanage.int_0133.Identifiers;
import mx.com.gentera.crm.level2accountmanage.int_0133.Level2AccountCreationData;
import mx.com.gentera.crm.level2accountmanage.int_0133.SI_LEVEL2ACCOUNTMANAGESYStub;
import mx.com.gentera.global.MT_Level2AccountCreationReq_sync;
import mx.com.gentera.global.MT_Level2AccountCreationResp_sync;

@Service
public class WebServiceConnectorImpl implements WebServiceConnector {
	
	final static Logger logger = Logger.getLogger(WebServiceConnectorImpl.class);
	final static String endPoint = Properties.getProp("EndPoint");

	@Override
	public Respuesta sendData(Persona persona) {
		Respuesta respuesta = new Respuesta();
		try {
			// Se genera el stub con el endpoint al cual apunta
			SI_LEVEL2ACCOUNTMANAGESYStub stub = new SI_LEVEL2ACCOUNTMANAGESYStub(endPoint);
			ServiceClient serviceClient = stub._getServiceClient();
			Options options = serviceClient.getOptions();
			options.setUserName("CONCCN");
	        options.setPassword("s4tCCN01@");
	        serviceClient.setOptions(options);
	        stub._setServiceClient(serviceClient);
	        
			//Objeto MT sync
			MT_Level2AccountCreationReq_sync mtSync = new MT_Level2AccountCreationReq_sync();
			
			//Objeto DT sync
			DT_Level2AccountCreationReq_sync dtSync = new DT_Level2AccountCreationReq_sync(); 
			
			//Se genera un message header para incluir en DT sync
			BusinessDocumentMessageHeader messageHeader = new BusinessDocumentMessageHeader();
			//Se incluye la fecha actual
			GLOBAL_DateTime dateTime = new GLOBAL_DateTime();
			Calendar calendarToday = Calendar.getInstance();
			dateTime.setGLOBAL_DateTime(calendarToday); //Verificar
			messageHeader.setCreationDateTime(dateTime);
			
			/**
			 * DATA
			 */
			Level2AccountCreationData data = new Level2AccountCreationData();
			
			/**
			 * IDENTIFIERS
			 */
			Identifiers identifiers = new Identifiers();
			//ID Oficina ---Viene de CRM
			OrganisationalCentreID officeId = new OrganisationalCentreID();
			officeId.setOrganisationalCentreID(new Token("156"));
			identifiers.setServiceOfficeID(officeId);
			
			//ID BP Empleado ---Viene de CRM
			BusinessPartnerInternalID bpEmpleado = new BusinessPartnerInternalID();
			bpEmpleado.setBusinessPartnerInternalID(new Token("E000000028"));
			identifiers.setBusinessPartnerID(bpEmpleado);
			
			//ID Comercio --- Propio
			CommercelD commerce = new CommercelD();
			commerce.setCommercelD("J211");
			identifiers.setCommerceID(commerce);
			
			//ID Origen --- 
			PartyID origin = new PartyID();
			origin.setPartyIDContent(new Token("Z06"));
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
			
			//Primer nombre
			givenName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getPrimerNombre());
			nameData.setGivenName(givenName);
			
			//Segundo nombre
			if(persona.getSegundoNombre()!=null){
				middleName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getSegundoNombre());
				nameData.setMiddleName(middleName);
			}
			
			//Primer apellido
			familyName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getPaterno());
			nameData.setFamilyName(familyName);
			
			//Segundo apellido
			aditionalFamilyName.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getMaterno());
			nameData.setAditionalFamilyName(aditionalFamilyName);
			
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
			//Tipo de identificacion
			PartyIdentifierTypeCode codeIdentifier = new PartyIdentifierTypeCode();
			codeIdentifier.setPartyIdentifierTypeCodeContent(new Token(persona.getTipoIdentificacion()));
			documentIdentifier.setCode(codeIdentifier);
			//Numero de identificacion
			ItemID idIdentifier = new ItemID();
			idIdentifier.setItemID(persona.getNumeroIdentificacion());
			documentIdentifier.setID(idIdentifier);
			bp.setDocumentIdentifier(documentIdentifier);
			
			/**
			 * Folio de tarjeta
			 */
			ZBankCardContractID cardIdentification = new ZBankCardContractID();
			cardIdentification.setZBankCardContractIDContent(new Token(persona.getFolio()));
			bp.setCardIdentification(cardIdentification);
			
			/**
			 * Lugar de nacimiento
			 */
			
			RegionCode regionBirth = new RegionCode();
			regionBirth.setRegionCode(new Token(persona.getPaisNacimiento()));
			bp.setRegionBirth(regionBirth);
			
			/**
			 * Entidad nacimiento
			 */
			CountryCode countryCode = new CountryCode();
			countryCode.setCountryCode(new Token(persona.getLugarNacimiento()));
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
			AcctOriginationBusinessPartnerPhone phoneData = new AcctOriginationBusinessPartnerPhone();
			//Tipo de telefono
			PhoneTypeID phoneType = new PhoneTypeID();
			if(persona.isSms()){
				phoneType.setPhoneTypeID(new Token("6")); //Si cliente acepta sms, se pone por decreto el 6 (celular para sms)
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
			
			/**
			 * DIRECCION
			 */
			AcctOriginationBusinessPartnerAddress addressData = new AcctOriginationBusinessPartnerAddress();
			//Tipo de direccion (principal)
			AddressTypeID addressTypeCode = new AddressTypeID();
			addressTypeCode.setAddressTypeID("DEF");
			addressData.setAddressTypeCode(addressTypeCode);
			//Codigo Postal
			PostalCode pc = new PostalCode();
			pc.setPostalCode(new Token(persona.getCodigoPostal()));
			addressData.setStreetPostalCode(pc);
			//Pais
			pais.setLANGUAGEINDEPENDENT_MEDIUM_Name("MX");
			addressData.setCountryName(pais);
			//Estado
			RegionCode regionCode = new RegionCode();
			regionCode.setRegionCode(new Token("AGS"));
			addressData.setRegionCode(regionCode);
			//Municipio o Delegacion
			municipio.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getDelegacion());
			addressData.setDistrictName(municipio);
			//Ciudad
			ciudad.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getCiudad());
			addressData.setCityName(ciudad);
			//Colonia
			colonia.setLANGUAGEINDEPENDENT_MEDIUM_Name(persona.getColonia());
			addressData.setAdditionalCityName(colonia);
			//Calle
			StreetName streetName = new StreetName();
			streetName.setStreetName(persona.getCalle());
			addressData.setStreetName(streetName);
			//No Ext
			HouseID numExt = new HouseID();
			numExt.setHouseID(new Token(persona.getNumExterior()));
			addressData.setHouseID(numExt);
			//No Int
			if(persona.getNumInterior()!=null && !persona.getNumInterior().equals("")){
				HouseID numInt = new HouseID();
				numInt.setHouseID(new Token(persona.getNumInterior()));
				addressData.setAdditionalHouseID(numInt);
			}
			bp.setAddressData(addressData);
			
			data.setBusinessPartnerCreateLevel2AccountData(bp);
			
			dtSync.setMessageHeader(messageHeader);
			dtSync.setLevel2AccountCreationData(data);
			mtSync.setMT_Level2AccountCreationReq_sync(dtSync);
			logger.info("Se prepara para enviar petición al endpoint: " + endPoint);
			MT_Level2AccountCreationResp_sync response = stub.createLevel2Account(mtSync);
			
			String code = response.getMT_Level2AccountCreationResp_sync().getLog().getItem()[0].getCategoryCode().toString();
			System.out.println("CODIGO: " + code);
			if(code!=null){
				if(code.equals("0")){
					respuesta.setIdBP(response.getMT_Level2AccountCreationResp_sync().getLevel2AccountCreationDataResponse().getBusinessPartnerIDCreated().toString());
					respuesta.setCLABE(response.getMT_Level2AccountCreationResp_sync().getLevel2AccountCreationDataResponse().getCLABEAccount().toString());
					respuesta.setCuenta(response.getMT_Level2AccountCreationResp_sync().getLevel2AccountCreationDataResponse().getBankAccountContractID().toString());
					respuesta.setIdOportunidad(response.getMT_Level2AccountCreationResp_sync().getLevel2AccountCreationDataResponse().getOpportunityID().toString());
				}
				respuesta.setCodigo(Integer.valueOf(code));
			}
			
		} catch (AxisFault e) {
			logger.error("Error AxisFault " +e);
			e.printStackTrace();
		} catch (RemoteException e) {
			logger.error("Error Remote " +e);
			e.printStackTrace();
		} catch (ExchangeFaultData e) {
			logger.error("Error Exchange Data " +e);
			e.printStackTrace();
		} catch (ParseException e) {
			logger.error("Error General " +e);
			e.printStackTrace();
		}
		return respuesta;
	}

}
