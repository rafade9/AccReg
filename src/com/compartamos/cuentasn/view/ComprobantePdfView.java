package com.compartamos.cuentasn.view;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.util.ListaBloqueoPdf;
import com.gentera.cuentasn.util.Util;
import com.lowagie.text.BadElementException;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ComprobantePdfView extends AbstractPdfView{

	final static Logger logger = Logger.getLogger(ComprobantePdfView.class);

	public static Font letraC = FontFactory.getFont("arial",8,Font.NORMAL);
	public static Font letraM = FontFactory.getFont("arial",11,Font.NORMAL);

	protected void buildPdfDocument(Map model, Document document,PdfWriter writer, HttpServletRequest request,HttpServletResponse response)throws Exception {

		logger.info("*******Armando Pdf de comprobante*******");

		Respuesta respuesta = (Respuesta)model.get("respuesta");
		//		respuesta.setCodigo(7);

		Persona persona = new Persona();
		persona = respuesta.getPersona();

		System.out.println(persona.getPrimerNombre());

		document.open();

		if(respuesta.getCodigo()==0){

			System.out.println(respuesta.getMensaje());

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
//			PdfPCell tarjeta = new PdfPCell(new Phrase("Tarjeta:", letraM));
//			tarjeta.setExtraParagraphSpace(5);
//			tarjeta.setBorder(0);
//
//			PdfPCell numTar = new PdfPCell(new Phrase(Util.enmascaraTarj(respuesta.getNumTarjeta()), letraM));
//			numTar.setExtraParagraphSpace(5);
//			numTar.setBorder(0);

			//Folio Operaci�n
			PdfPCell folio = new PdfPCell(new Phrase("Folio de Operaci�n:", letraM));
			folio.setExtraParagraphSpace(5);
			folio.setBorder(0);

			PdfPCell numFol = new PdfPCell(new Phrase(respuesta.getIdOportunidad(), letraM));//??
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
//			tablaInfCuenta.addCell(tarjeta);
//			tablaInfCuenta.addCell(numTar);
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

			//Tabla con logos		
			PdfPTable tablaP = new PdfPTable(2);
			PdfPTable tablaF = new PdfPTable(2);
			PdfPTable tablaC = new PdfPTable(2);
			PdfPTable textos = new PdfPTable(1);
			PdfPTable pie = new PdfPTable(2);
			float[] medidaCeldas = {5.00f, 5.00f};

			try {
				tablaP.setWidths(medidaCeldas);
				tablaF.setWidths(medidaCeldas);
				tablaC.setWidths(medidaCeldas);
				pie.setWidths(medidaCeldas);
			}catch (DocumentException e2) {
				e2.printStackTrace();
			}
			//abrimos nuestro documento
			document.open();

			//cargamos imagen Compartamos Banco
			Image letreroB = generaImagen(ListaBloqueoPdf.class.getClassLoader().getResource("resources/imagenes/compartamosBanco.png").getPath());
			PdfPCell imagenP = new PdfPCell(letreroB);
			imagenP.setBorder(0);

			//cargamos logo del banco
			Image logoB = generaImagen(ListaBloqueoPdf.class.getClassLoader().getResource("resources/imagenes/logoCom.png").getPath());
			PdfPCell imagenL = new PdfPCell(logoB);
			imagenL.setHorizontalAlignment(Element.ALIGN_RIGHT);
			imagenL.setBorder(0);

			tablaP.addCell(imagenP);
			tablaP.addCell(imagenL);

			//Parrafo con fecha
			PdfPCell vacia = new PdfPCell();
			vacia.setBorder(0);
			PdfPCell fecha = new PdfPCell(new Phrase("Fecha de Entrega: "+ Util.generaFecha() +".", letraC));
			fecha.setHorizontalAlignment(Element.ALIGN_RIGHT);
			fecha.setBorder(0);

			//Datos del Cliente
			Phrase nombre = new Phrase("C. " + Util.obtenerNombreC(persona), letraM);
			Phrase fechaNacimiento = new Phrase("Fecha de nacimiento: " + persona.getFechaNacimiento().replace('/', '.'), letraM);


			PdfPCell datosC = new PdfPCell();
			datosC.setBorder(0);

			//Agregamos los datos a la tabla
			datosC.addElement(nombre);
			datosC.addElement(fechaNacimiento);

			//agregamos la fecha a la tabla
			tablaF.addCell(vacia);
			tablaF.addCell(fecha);

			//agregamos texto Presente.
			PdfPCell presente = new PdfPCell(new Phrase("Presente.", letraM));
			presente.setBorder(0);
			presente.setExtraParagraphSpace(30);

			//agregamos texto principal
			Paragraph textoP = new Paragraph("Por medio del presente escrito, se informa que usted ha sido introducido en la �Lista de Personas Bloqueadas�, dada a conocer a esta Instituci�n por la Unidad de Inteligencia Financiera de la Secretar�a de Hacienda y Cr�dito P�blico, bajo los par�metros establecidos por dicha Secretar�a y las causas mencionadas en la 71� de las Disposiciones de Car�cter General a que se refiere el art�culo 115 de la Ley de Instituciones de Cr�dito, que a la letra se�ala:", letraM);
			PdfPCell texto1 = new PdfPCell(textoP);
			texto1.setExtraParagraphSpace(30);
			texto1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			texto1.setBorder(0);

			//agregamos articulo 115
			Paragraph textoArt = new Paragraph("�71�.-La Secretar�a podr� introducir en la Lista de Personas Bloqueadas a las personas, bajo los siguientes par�metros:", letraC);
			PdfPCell textoArt115 = new PdfPCell(textoArt);
			textoArt115.setExtraParagraphSpace(20);
			textoArt115.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArt115.setBorder(0);

			Paragraph textoI = new Paragraph("I.Aquellas que se encuentren dentro de las listas derivadas de las resoluciones 1267 (1999) y sucesivas, y 1373 (2001) y las dem�s que sean emitidas por el Consejo de Seguridad de las Naciones Unidas o las organizaciones  internacionales;", letraC);
			PdfPCell textoArtI = new PdfPCell(textoI);
			textoArtI.setExtraParagraphSpace(10);
			textoArtI.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtI.setBorder(0);

			Paragraph textoII = new Paragraph("II.	Aquellas que den a conocer autoridades extranjeras, organismos internacionales o agrupaciones intergubernamentales y que sean determinadas por la Secretar�a en t�rminos de los instrumentos internacionales celebrados por el Estado Mexicano con dichas autoridades, organismos o agrupaciones, o en t�rminos de los convenios celebrados por la propia Secretar�a;", letraC);
			PdfPCell textoArtII = new PdfPCell(textoII);
			textoArtII.setExtraParagraphSpace(10);
			textoArtII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtII.setBorder(0);

			Paragraph textoIII = new Paragraph("III.Aquellas que den a conocer las autoridades nacionales competentes por tener indicios suficientes de que se encuentran relacionadas con los delitos de financiamiento al terrorismo, operaciones con recursos de procedencia il�cita o los relacionados con los delitos se�alados, previstos en el C�digo Penal Federal;", letraC);
			PdfPCell textoArtIII = new PdfPCell(textoIII);
			textoArtIII.setExtraParagraphSpace(10);
			textoArtIII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtIII.setBorder(0);

			Paragraph textoIV = new Paragraph("IV.Aquellas que est�n compurgando sentencia por los delitos de financiamiento al terrorismo u operaciones con recursos de procedencia il�cita, previstos en el C�digo Penal Federal;", letraC);
			PdfPCell textoArtIV = new PdfPCell(textoIV);
			textoArtIV.setExtraParagraphSpace(10);
			textoArtIV.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtIV.setBorder(0);

			Paragraph textoV = new Paragraph("V.Aquellas que las autoridades nacionales competentes determinen que hayan realizado o realicen actividades que formen parte, auxilien, o est�n relacionadas con los delitos de financiamiento al terrorismo u operaciones con recursos de procedencia il�cita, previstos en el C�digo Penal Federal, y ", letraC);
			PdfPCell textoArtV = new PdfPCell(textoV);
			textoArtV.setExtraParagraphSpace(10);
			textoArtV.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtV.setBorder(0);

			Paragraph textoVI = new Paragraph("VI.Aquellas que omitan proporcionar informaci�n o datos, la encubran o impidan conocer el origen, localizaci�n, destino o propiedad de recursos, derechos o bienes que provengan de delitos de financiamiento al terrorismo u operaciones con recursos de procedencia il�cita, previstos en el C�digo Penal Federal o los relacionados con �stos.", letraC);
			PdfPCell textoArtVI = new PdfPCell(textoVI);
			textoArtVI.setExtraParagraphSpace(30);
			textoArtVI.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtVI.setBorder(0);

			Paragraph textoVII = new Paragraph("Por lo anterior, hemos sido instruidos por la citada Unidad de Inteligencia Financiera, a suspender de forma inmediata cualquier acto, operaci�n o servicio que se pretenda o se tenga celebrado entre usted y Banco Compartamos, S.A., Instituci�n de Banca M�ltiple.", letraM);
			PdfPCell textoArtVII = new PdfPCell(textoVII);
			textoArtVII.setExtraParagraphSpace(120);
			textoArtVII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtVII.setBorder(0);

			textos.addCell(datosC);
			textos.addCell(presente);
			textos.addCell(texto1);
			textos.addCell(textoArt115);
			textos.addCell(textoArtI);
			textos.addCell(textoArtII);
			textos.addCell(textoArtIII);
			textos.addCell(textoArtIV);
			textos.addCell(textoArtV);
			textos.addCell(textoArtVI);
			textos.addCell(textoArtVII);


			//cargamos imagen pie Compartamos
			Image direccion = generaImagen(ListaBloqueoPdf.class.getClassLoader().getResource("resources/imagenes/direccionBanco.png").getPath());

			PdfPCell pieC = new PdfPCell(direccion);
			pieC.setHorizontalAlignment(Element.ALIGN_RIGHT);
			pieC.setBorder(0);

			pie.addCell(vacia);
			pie.addCell(pieC);

			document.add(tablaP);
			document.add(tablaF);
			document.add(tablaC);
			document.add(textos);
			document.add(pie);

			//Pagina 2
			document.newPage();

			//tabla para la segunda pagina
			PdfPTable textosSP = new PdfPTable(1);

			//agregamos texto principal a la segunda pagina
			Paragraph textoSP = new Paragraph("Asimismo, se hace de su conocimiento que puede acudir ante el Titular de la Unidad de Inteligencia Financiera de la Secretar�a de Hacienda y Cr�dito P�blico, a hacer valer sus derechos, dentro de un plazo de 10 d�as h�biles contados a partir de la notificaci�n del presente escrito, para que manifieste por escrito lo que a su inter�s convenga, aporte elementos de prueba y formule alegatos, esto de conformidad en la 72� y 73� de las citadas Disposiciones, que a su letra se�alan:  ", letraM);
			PdfPCell texto1SP = new PdfPCell(textoSP);
			texto1SP.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			texto1SP.setExtraParagraphSpace(30);
			texto1SP.setBorder(0);

			Paragraph texto72a = new Paragraph("�72�.-�Las Entidades que en t�rminos de la presente Disposici�n hayan suspendido los actos, Operaciones o servicios con sus Clientes o Usuarios, de manera inmediata deber�n hacer de su conocimiento dicha situaci�n por escrito, en el que se deber� informar a dichos Clientes y Usuarios los fundamentos y la causa o causas de dicha inclusi�n, as� como que dentro de los diez d�as h�biles siguientes al d�a de la recepci�n del citado escrito, podr�n acudir ante la autoridad competente para efectos de la 73� de las presentes Disposiciones", letraC);
			texto72a.setIndentationLeft(20);
			PdfPCell textoS72a = new PdfPCell(texto72a);
			textoS72a.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoS72a.setExtraParagraphSpace(20);
			textoS72a.setBorder(0);

			Paragraph texto73a = new Paragraph("73�.- Las personas que hayan sido incluidas en la Lista de Personas Bloqueadas podr�n hacer valer sus derechos ante el Titular de la Unidad de Inteligencia Financiera de la Secretar�a conforme a lo siguiente:", letraC);
			PdfPCell textoS73a = new PdfPCell(texto73a);
			textoS73a.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoS73a.setExtraParagraphSpace(20);
			textoS73a.setBorder(0);

			Paragraph textoSI = new Paragraph("I.Se otorgar� audiencia al interesado para que dentro del plazo de diez d�as h�biles, contado a partir de que tenga conocimiento de la suspensi�n a que se refiere la Disposici�n 72� anterior, manifieste por escrito lo que a su inter�s convenga, aporte elementos de prueba y formule alegatos. El Titular de la Unidad de Inteligencia Financiera, a petici�n de parte, podr� ampliar por una sola ocasi�n el plazo a que se refiere esta fracci�n, hasta por el mismo lapso, para lo cual considerar� las circunstancias particulares del caso.", letraC);
			PdfPCell textoCSI = new PdfPCell(textoSI);
			textoCSI.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoCSI.setExtraParagraphSpace(10);
			textoCSI.setBorder(0);

			Paragraph textoSII = new Paragraph("II.	El Titular de la Unidad de Inteligencia Financiera, dentro de los diez d�as h�biles siguientes a que se presente el interesado en t�rminos de la fracci�n I anterior, emitir� resoluci�n por la cual funde y motive su inclusi�n en la Lista de Personas Bloqueadas y si procede o no su eliminaci�n de la misma.�",letraC);
			PdfPCell textoCSII = new PdfPCell(textoSII);
			textoCSII.setExtraParagraphSpace(150);
			textoCSII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoCSII.setBorder(0);

			PdfPCell saludo = new PdfPCell(new Phrase("Sin m�s por el momento, nos ponemos a sus �rdenes.", letraM));
			saludo.setExtraParagraphSpace(30);
			saludo.setBorder(0);

			//datos Compartamos
			Paragraph atte = new Paragraph("A T E N T A M E N T E", letraM);
			Phrase nBanco = new Phrase("\nBANCO COMPARTAMOS, S.A.", letraM);
			Phrase calle = new Phrase("\nInsurgentes Sur No. 1458, Col. Actipan", letraM);
			Phrase delegacion = new Phrase("\nDelegaci�n Benito Ju�rez", letraM);

			atte.add(nBanco);
			atte.add(calle);
			atte.add(delegacion);

			//Agregamos el codigo postal
			PdfPCell datosB = new PdfPCell();

			datosB.addElement(atte);
			datosB.setBorder(0);

			Paragraph cp = new Paragraph("M�xico, DF, 03230", letraM);
			PdfPCell datosCp = new PdfPCell(cp);
			datosCp.setBorder(0);
			datosCp.setExtraParagraphSpace(80);

			//empezamos a llenar la tabla de la segunda pagina

			textosSP.addCell(vacia);
			textosSP.addCell(vacia);
			textosSP.addCell(vacia);
			textosSP.addCell(texto1SP);
			textosSP.addCell(textoS72a);
			textosSP.addCell(textoS73a);
			textosSP.addCell(textoCSI);
			textosSP.addCell(textoCSII);
			textosSP.addCell(saludo);
			textosSP.addCell(datosB);
			textosSP.addCell(datosCp);

			document.add(tablaP);
			document.add(textosSP);
			document.add(pie);

			document.close();
		}
	}

	public static Image generaImagen(String ruta) throws BadElementException, MalformedURLException, IOException{
		Image foto = null;
		foto = Image.getInstance(ruta);
		foto.scaleToFit(150, 150);
		foto.setAlignment(Chunk.ALIGN_LEFT);

		return foto;
	}


}
