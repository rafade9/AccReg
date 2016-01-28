package com.gentera.cuentasn.wsconnector.impl;

import java.rmi.RemoteException;
import java.util.Calendar;

import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.Token;
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

	@Override
	public String sendData(Persona persona) {
		try {
			// Se genera el stub con el endpoint al cual apunta
			SI_LEVEL2ACCOUNTMANAGESYStub stub = new SI_LEVEL2ACCOUNTMANAGESYStub(
					"http://EXTUSCOMUNICA03:8088/mockSSL_SOAP12");
			
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
			//ID Oficina
			OrganisationalCentreID officeId = new OrganisationalCentreID();
			officeId.setOrganisationalCentreID(new Token("12345678901234567890"));
			identifiers.setServiceOfficeID(officeId);
			
			//ID BP Empleado
			BusinessPartnerInternalID bpEmpleado = new BusinessPartnerInternalID();
			bpEmpleado.setBusinessPartnerInternalID(new Token("1234567890"));
			identifiers.setBusinessPartnerID(bpEmpleado);
			
			//ID Comercio
			CommercelD commerce = new CommercelD();
			commerce.setCommercelD("1234567890");
			identifiers.setCommerceID(commerce);
			
			//ID Origen
			PartyID origin = new PartyID();
			origin.setPartyIDContent(new Token("1234567890"));
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
			givenName.setLANGUAGEINDEPENDENT_MEDIUM_Name("Mario");
			nameData.setGivenName(givenName);
			
			//Segundo nombre
			middleName.setLANGUAGEINDEPENDENT_MEDIUM_Name("Rafael");
			nameData.setMiddleName(middleName);
			
			//Primer apellido
			familyName.setLANGUAGEINDEPENDENT_MEDIUM_Name("Delgadillo");
			nameData.setFamilyName(familyName);
			
			//Segundo apellido
			aditionalFamilyName.setLANGUAGEINDEPENDENT_MEDIUM_Name("Esparza");
			nameData.setAditionalFamilyName(aditionalFamilyName);
			
			bp.setNameData(nameData);
			
			/**
			 * Fecha de Nacimiento
			 */
			Date fechaNacimiento = new Date();
			fechaNacimiento.setDate(new java.util.Date()); //Verificar
			bp.setBirthDate(fechaNacimiento);
			
			/**
			 * Genero
			 */
			GenderCode genero = new GenderCode();
			genero.setGenderCode(new Token("1"));
			bp.setGender(genero);
			
			/**
			 * Identificacion
			 */
			BusinessPartnerDocumentIdentifier documentIdentifier = new BusinessPartnerDocumentIdentifier();
			PartyIdentifierTypeCode codeIdentifier = new PartyIdentifierTypeCode();
			codeIdentifier.setPartyIdentifierTypeCodeContent(new Token("ZCVELE"));
			documentIdentifier.setCode(codeIdentifier);
			ItemID idIdentifier = new ItemID();
			idIdentifier.setItemID("abcdefghijklmno");
			documentIdentifier.setID(idIdentifier);
			bp.setDocumentIdentifier(documentIdentifier);
			
			/**
			 * Folio de tarjeta
			 */
			ZBankCardContractID cardIdentification = new ZBankCardContractID();
			cardIdentification.setZBankCardContractIDContent(new Token("123451234512345"));
			bp.setCardIdentification(cardIdentification);
			
			/**
			 * Lugar de nacimiento
			 */
			
			RegionCode regionBirth = new RegionCode();
			regionBirth.setRegionCode(new Token("MX"));
			bp.setRegionBirth(regionBirth);
			
			/**
			 * Entidad nacimiento
			 */
			CountryCode countryCode = new CountryCode();
			countryCode.setCountryCode(new Token("AGS"));
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
			PhoneTypeID phoneType = new PhoneTypeID();
			phoneType.setPhoneTypeID(new Token("1"));
			phoneData.setPhoneTypeID(phoneType);
			PhoneNumberV1 phoneNumber = new PhoneNumberV1();
			PhoneNumberSubscriberID number = new PhoneNumberSubscriberID();
			number.setPhoneNumberSubscriberID(new Token("5512345678"));
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
			pc.setPostalCode(new Token("12345"));
			addressData.setStreetPostalCode(pc);
			//Pais
			pais.setLANGUAGEINDEPENDENT_MEDIUM_Name("MX");
			addressData.setCountryName(pais);
			//Estado
			RegionCode regionCode = new RegionCode();
			regionCode.setRegionCode(new Token("AGS"));
			addressData.setRegionCode(regionCode);
			//Municipio o Delegacion
			municipio.setLANGUAGEINDEPENDENT_MEDIUM_Name("Benito Juarez");
			addressData.setDistrictName(municipio);
			//Ciudad
			ciudad.setLANGUAGEINDEPENDENT_MEDIUM_Name("Algo");
			addressData.setCityName(ciudad);
			//Colonia
			colonia.setLANGUAGEINDEPENDENT_MEDIUM_Name("Progreso");
			addressData.setAdditionalCityName(colonia);
			//Calle
			StreetName streetName = new StreetName();
			streetName.setStreetName("Av Independencia");
			addressData.setStreetName(streetName);
			//No Ext
			HouseID numExt = new HouseID();
			numExt.setHouseID(new Token("100"));
			addressData.setHouseID(numExt);
			//No Int
			HouseID numInt = new HouseID();
			numInt.setHouseID(new Token("1"));
			addressData.setAdditionalHouseID(numInt);
			
			bp.setAddressData(addressData);
			
			data.setBusinessPartnerCreateLevel2AccountData(bp);
			
			dtSync.setMessageHeader(messageHeader);
			dtSync.setLevel2AccountCreationData(data);
			mtSync.setMT_Level2AccountCreationReq_sync(dtSync);
			MT_Level2AccountCreationResp_sync response = stub.createLevel2Account(mtSync);
			String bpId = response.getMT_Level2AccountCreationResp_sync().getLevel2AccountCreationDataResponse().getBusinessPartnerIDCreated().toString();
			System.out.println("Exito: " + bpId);
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ExchangeFaultData e) {
			e.printStackTrace();
		}
		return null;
	}

}
