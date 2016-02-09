package com.compartamos.cuentasn.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.view.AbstractView;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.gentera.cuentasn.controller.ComprobantePdfController;
import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.util.Util;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ComprobantePdfView extends AbstractPdfView{
	
	final static Logger logger = Logger.getLogger(ComprobantePdfView.class);
	
	public static Font letraC = FontFactory.getFont("arial",10,Font.NORMAL);
	public static Font letraM = FontFactory.getFont("arial",14,Font.NORMAL);

	protected void buildPdfDocument(Map model, Document document,
			PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		
		logger.info("*******Armando Pdf de comprobante*******");
		
		Respuesta respuesta = (Respuesta)model.get("respuesta");
		respuesta.setCodigo(0);
	
		if(respuesta.getCodigo()==0){
		
		
		System.out.println(respuesta.getMensaje());
		
//		Respuesta respuesta = new Respuesta();
		
		Persona persona = new Persona();
		persona = respuesta.getPersona();
		
		//Tabla con informaci�n		
		PdfPTable tabla = new PdfPTable(1);
		tabla.setWidthPercentage(100);
		PdfPTable tablaInfCuenta = new PdfPTable(2);

		//Establecemos las medidas de la tabla interna, que contiene la informaci�n de la Cuenta
		float[] medidaCeldas = {3.50f, 7.00f};
		try {
			tablaInfCuenta.setWidths(medidaCeldas);
		}catch (DocumentException e2) {
			e2.printStackTrace();
		}
		//abrimos el documento
		document.open();

		//Empezamos a agregar las frases al documento		
		PdfPCell nombreB = new PdfPCell(new Phrase("BANCO COMPARTAMOS, S.A. ", letraM));
		nombreB.setHorizontalAlignment(Element.ALIGN_CENTER);
		nombreB.setExtraParagraphSpace(5);
		nombreB.setBorder(0);

		PdfPCell bancaM = new PdfPCell(new Phrase("INSTITUCI�N DE BANCA MULTIPLE", letraM));
		bancaM.setHorizontalAlignment(Element.ALIGN_CENTER);
		bancaM.setExtraParagraphSpace(5);
		bancaM.setBorder(0);

		PdfPCell lugarExp = new PdfPCell(new Phrase("Minatitl�n, Veracruz", letraM));
		lugarExp.setHorizontalAlignment(Element.ALIGN_CENTER);
		lugarExp.setExtraParagraphSpace(5);
		lugarExp.setBorder(0);


		PdfPCell fecha = new PdfPCell(new Phrase("Fecha:" + Util.getDateTime() , letraM));
		fecha.setHorizontalAlignment(Element.ALIGN_CENTER);
		fecha.setExtraParagraphSpace(5);
		fecha.setBorder(0);

		PdfPCell sede = new PdfPCell(new Phrase("Sede: 2079, Acayucan", letraM));//??
		sede.setHorizontalAlignment(Element.ALIGN_CENTER);
		sede.setExtraParagraphSpace(5);
		sede.setBorder(0);

		PdfPCell operador = new PdfPCell(new Phrase("Operador: hramirez", letraM));//??
		operador.setHorizontalAlignment(Element.ALIGN_CENTER);
		operador.setExtraParagraphSpace(20);
		operador.setBorder(0);

		PdfPCell aperturaC = new PdfPCell(new Phrase("APERTURA DE CUENTA", letraM));
		aperturaC.setHorizontalAlignment(Element.ALIGN_CENTER);
		aperturaC.setExtraParagraphSpace(10);

		PdfPCell vacia = new PdfPCell();
		vacia.setHorizontalAlignment(Element.ALIGN_CENTER);
		vacia.setExtraParagraphSpace(100);
		vacia.setBorder(0);

		tabla.addCell(vacia);
		tabla.addCell(nombreB);
		tabla.addCell(bancaM);
		tabla.addCell(lugarExp);
		tabla.addCell(fecha);
		tabla.addCell(sede);
		tabla.addCell(operador);
		tabla.addCell(aperturaC);
		tabla.addCell(vacia);


		//Llenamos la tabla con la informaci�n de la cuenta
		PdfPCell producto = new PdfPCell(new Phrase("Producto:", letraM));
		producto.setExtraParagraphSpace(5);
		producto.setBorder(0);

		PdfPCell tipoProd = new PdfPCell(new Phrase("Cuenta a mi favor Compartamos", letraM));
		tipoProd.setExtraParagraphSpace(5);
		tipoProd.setBorder(0);

		//titular de la cuenta
		PdfPCell titular = new PdfPCell(new Phrase("Titular:", letraM));
		titular.setExtraParagraphSpace(5);
		titular.setBorder(0);

		PdfPCell nombreTit = new PdfPCell(new Phrase(Util.obtenerNombreC(persona), letraM));
		nombreTit.setExtraParagraphSpace(5);
		nombreTit.setBorder(0);

		//Cuenta
		PdfPCell cuenta = new PdfPCell(new Phrase("Cuenta:", letraM));
		cuenta.setExtraParagraphSpace(5);
		cuenta.setBorder(0);

		PdfPCell numCuenta = new PdfPCell(new Phrase(respuesta.getCuenta(), letraM));
		numCuenta.setExtraParagraphSpace(5);
		numCuenta.setBorder(0);

		//Cuenta Clabe
		PdfPCell clabe = new PdfPCell(new Phrase("Cuenta Clabe:", letraM));
		clabe.setExtraParagraphSpace(5);
		clabe.setBorder(0);

		PdfPCell numClabe = new PdfPCell(new Phrase(respuesta.getCLABE(), letraM));
		numClabe.setExtraParagraphSpace(5);
		numClabe.setBorder(0);

		//Tarjeta
		PdfPCell tarjeta = new PdfPCell(new Phrase("Tarjeta:", letraM));
		tarjeta.setExtraParagraphSpace(5);
		tarjeta.setBorder(0);

		PdfPCell numTar = new PdfPCell(new Phrase(respuesta.getNumTarjeta(), letraM));//??
		numTar.setExtraParagraphSpace(5);
		numTar.setBorder(0);

		//Folio Operaci�n
		PdfPCell folio = new PdfPCell(new Phrase("Folio de Operaci�n:", letraM));
		folio.setExtraParagraphSpace(5);
		folio.setBorder(0);

		PdfPCell numFol = new PdfPCell(new Phrase("122222", letraM));//??
		numFol.setExtraParagraphSpace(2);
		numFol.setBorder(0);
		//llenamos tabla interna
		tablaInfCuenta.addCell(producto);
		tablaInfCuenta.addCell(tipoProd);
		tablaInfCuenta.addCell(titular);
		tablaInfCuenta.addCell(nombreTit);
		tablaInfCuenta.addCell(cuenta);
		tablaInfCuenta.addCell(numCuenta);
		tablaInfCuenta.addCell(clabe);
		tablaInfCuenta.addCell(numClabe);
		tablaInfCuenta.addCell(tarjeta);
		tablaInfCuenta.addCell(numTar);
		tablaInfCuenta.addCell(folio);
		tablaInfCuenta.addCell(numFol);

		//agregamos la tabla interna a la principal
		tabla.addCell(tablaInfCuenta);

		//agregamos texto dudas y aclaraciones
		Paragraph dudas = new Paragraph("SOLICITUDES, DUDAS, ACLARACIONES Y QUEJAS, favor de dirigirse a la Unidad Especializada de Atenci�n a Usuarios localizada en: Avenida Insurgentes Sur N�mero 1458, Colonia Actipan, Delegaci�n Benito Ju�rez, C�digo Postal 03020, M�xico, Distrito Federal Tel�fono: 01-800-226-5432, correo electr�nico: unidadespecializada@compartamos.com.\n Centro de Atenci�n Telef�nica de la Comisi�n Nacional para la Protecci�n y Defensa de los usuarios de Servicios Financieros 01 800 999 8080 p�gina de internet www.condusef.gob.mx o al correo eletr�nico opinion@condusef.gob.mx. Tus dep�sitos y ahorros est�n protegidos por el IPAB, para mayor informaci�n consulta la p�gina www.ipab.org.mx", letraC);
		PdfPCell dudasAcla = new PdfPCell(dudas);
		dudasAcla.setExtraParagraphSpace(30);
		dudasAcla.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);

		tabla.addCell(dudas);

		//agregamos texto de mayor informaci�n
		Paragraph informacion = new Paragraph("El contrato est� a tu disposici�n en: www.compartamos.com.mx\n para mayor informaci�n comun�cate a Compartel: 01 800220 9000", letraM);
		PdfPCell masInfo = new PdfPCell(informacion);
		masInfo.setExtraParagraphSpace(5);
		masInfo.setHorizontalAlignment(Element.ALIGN_CENTER);
		masInfo.setBorder(0);

		tabla.addCell(masInfo);

		document.add(tabla);

		document.close();

		}else if(respuesta.getCodigo()==7){
			
			
		}
	}



}
