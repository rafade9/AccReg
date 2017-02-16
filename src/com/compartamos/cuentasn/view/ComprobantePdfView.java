/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.compartamos.cuentasn.view;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.gentera.cuentasn.entities.Persona;
import com.gentera.cuentasn.entities.Respuesta;
import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.entities.Usuario;
import com.gentera.cuentasn.service.impl.LeerCatalogosImpl;
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

/**
 * Clase encargada de armar los archivos pdf´s de comprobante y listas bloqueadas
 * 
 * @author Mara Vazquez Cruz
 * @version 1.0
 */
public class ComprobantePdfView extends AbstractPdfView{

	final static Logger logger = Logger.getLogger(ComprobantePdfView.class);

	public static Font letraC = FontFactory.getFont("arial",8,Font.NORMAL);
	public static Font letraM = FontFactory.getFont("arial",11,Font.NORMAL);

	@SuppressWarnings("rawtypes")
	protected void buildPdfDocument(Map model, Document document,PdfWriter writer, HttpServletRequest request,HttpServletResponse response)throws Exception {

		Respuesta respuesta = (Respuesta)model.get("respuesta");

		Persona persona = new Persona();
		persona = respuesta.getPersona();

		document.open();

		if(respuesta.getCodigo()==0){//generamos comprobante
			
			logger.info("*******Armando Pdf de comprobante para la cuenta: "+ respuesta.getCuenta() +" *******");

			//Tabla con información	
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

			PdfPCell bancaM = new PdfPCell(new Phrase("INSTITUCIÓN DE BANCA MULTIPLE", letraM));
			bancaM.setHorizontalAlignment(Element.ALIGN_CENTER);
			bancaM.setExtraParagraphSpace(5);
			bancaM.setBorder(0);

			LeerCatalogosImpl leerCatalogos = new LeerCatalogosImpl();
			Sucursal sucursal = new Sucursal();
			sucursal = leerCatalogos.getSucursalPlaza(Util.convierteIpTerminaCero(request.getRemoteAddr()));
			
			PdfPCell lugarExp = new PdfPCell(new Phrase(sucursal.getPlaza() + ", " + sucursal.getEstado(), letraM));
			lugarExp.setHorizontalAlignment(Element.ALIGN_CENTER);
			lugarExp.setExtraParagraphSpace(5);
			lugarExp.setBorder(0);


			PdfPCell fecha = new PdfPCell(new Phrase("Fecha:" + Util.getDateTime() , letraM));
			fecha.setHorizontalAlignment(Element.ALIGN_CENTER);
			fecha.setExtraParagraphSpace(5);
			fecha.setBorder(0);

			PdfPCell sede = new PdfPCell(new Phrase("Sede: "+sucursal.getId() +", "+sucursal.getPlaza(), letraM));
			sede.setHorizontalAlignment(Element.ALIGN_CENTER);
			sede.setExtraParagraphSpace(5);
			sede.setBorder(0);

			Usuario user = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			PdfPCell operador = new PdfPCell(new Phrase("Operador u Origne: " + user.getUsername(), letraM));//??
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

			//Folio de la tarjeta
			PdfPCell folioTar = new PdfPCell(new Phrase("Folio:", letraM));
			folioTar.setExtraParagraphSpace(5);
			folioTar.setBorder(0);

			PdfPCell numFolio = new PdfPCell(new Phrase(persona.getFolio(), letraM));
			numFolio.setExtraParagraphSpace(5);
			numFolio.setBorder(0);

			//Folio Operación
			PdfPCell folio = new PdfPCell(new Phrase("Folio de Operación:", letraM));
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
			tablaInfCuenta.addCell(folioTar);
			tablaInfCuenta.addCell(numFolio);
			tablaInfCuenta.addCell(folio);
			tablaInfCuenta.addCell(numFol);

			//agregamos la tabla interna a la principal
			tabla.addCell(tablaInfCuenta);

			//agregamos texto dudas y aclaraciones
			Paragraph dudas = new Paragraph("SOLICITUDES, DUDAS, ACLARACIONES Y QUEJAS, favor de dirigirse a la Unidad Especializada de Atención a Usuarios localizada en: Avenida Insurgentes Sur Número 1458, Colonia Actipan, Delegación Benito Juárez, Código Postal 03020, México, Distrito Federal Teléfono: 01-800-226-5432, correo electrónico: unidadespecializada@compartamos.com.\n Centro de Atención Telefónica de la Comisión Nacional para la Protección y Defensa de los usuarios de Servicios Financieros 01 800 999 8080 página de internet www.condusef.gob.mx o al correo electrónico opinion@condusef.gob.mx. Tus depósitos y ahorros están protegidos por el IPAB, para mayor información consulta la página www.ipab.org.mx", letraC);
			PdfPCell dudasAcla = new PdfPCell(dudas);
			dudasAcla.setExtraParagraphSpace(30);
			dudasAcla.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);

			tabla.addCell(dudas);

			//agregamos texto de mayor informaci�n
			Paragraph informacion = new Paragraph("El contrato está a tu disposición en: www.compartamos.com.mx\n para mayor información comunícate a Compartel: 01 800220 9000", letraM);
			PdfPCell masInfo = new PdfPCell(informacion);
			masInfo.setExtraParagraphSpace(5);
			masInfo.setHorizontalAlignment(Element.ALIGN_CENTER);
			masInfo.setBorder(0);

			tabla.addCell(masInfo);

			document.add(tabla);

			document.close();

		}else if(respuesta.getCodigo()==8){//generamos pdf de listas bloqueadas
			
			logger.info("*******Armando Pdf de listas bloqueadas*******");

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
			Image letreroB = generaImagen(ComprobantePdfView.class.getClassLoader().getResource("resources/imagenes/compartamosBanco.png").getPath());
			PdfPCell imagenP = new PdfPCell(letreroB);
			imagenP.setBorder(0);

			//cargamos logo del banco
			Image logoB = generaImagen(ComprobantePdfView.class.getClassLoader().getResource("resources/imagenes/logoCom.png").getPath());
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
			Paragraph textoP = new Paragraph("Por medio del presente escrito, se informa que usted ha sido introducido en la “Lista de Personas Bloqueadas”, dada a conocer a esta Institución por la Unidad de Inteligencia Financiera de la Secretaría de Hacienda y Crédito Público, bajo los parámetros establecidos por dicha Secretaría y las causas mencionadas en la 71ª de las Disposiciones de Carácter General a que se refiere el artículo 115 de la Ley de Instituciones de Crédito, que a la letra señala:", letraM);
			PdfPCell texto1 = new PdfPCell(textoP);
			texto1.setExtraParagraphSpace(30);
			texto1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			texto1.setBorder(0);

			//agregamos articulo 115
			Paragraph textoArt = new Paragraph("“71ª.-La Secretaría podrá introducir en la Lista de Personas Bloqueadas a las personas, bajo los siguientes parámetros:", letraC);
			PdfPCell textoArt115 = new PdfPCell(textoArt);
			textoArt115.setExtraParagraphSpace(20);
			textoArt115.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArt115.setBorder(0);

			Paragraph textoI = new Paragraph("I.	Aquellas que se encuentren dentro de las listas derivadas de las resoluciones 1267 (1999) y sucesivas, y 1373 (2001) y las demás que sean emitidas por el Consejo de Seguridad de las Naciones Unidas o las organizaciones  internacionales;", letraC);
			PdfPCell textoArtI = new PdfPCell(textoI);
			textoArtI.setExtraParagraphSpace(10);
			textoArtI.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtI.setBorder(0);

			Paragraph textoII = new Paragraph("II.	Aquellas que den a conocer autoridades extranjeras, organismos internacionales o agrupaciones intergubernamentales y que sean determinadas por la Secretaría en términos de los instrumentos internacionales celebrados por el Estado Mexicano con dichas autoridades, organismos o agrupaciones, o en términos de los convenios celebrados por la propia Secretaría;", letraC);
			PdfPCell textoArtII = new PdfPCell(textoII);
			textoArtII.setExtraParagraphSpace(10);
			textoArtII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtII.setBorder(0);

			Paragraph textoIII = new Paragraph("III.	Aquellas que den a conocer las autoridades nacionales competentes por tener indicios suficientes de que se encuentran relacionadas con los delitos de financiamiento al terrorismo, operaciones con recursos de procedencia ilícita o los relacionados con los delitos señalados, previstos en el Código Penal Federal;", letraC);
			PdfPCell textoArtIII = new PdfPCell(textoIII);
			textoArtIII.setExtraParagraphSpace(10);
			textoArtIII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtIII.setBorder(0);

			Paragraph textoIV = new Paragraph("IV.	Aquellas que estén compurgando sentencia por los delitos de financiamiento al terrorismo u operaciones con recursos de procedencia ilícita, previstos en el Código Penal Federal;", letraC);
			PdfPCell textoArtIV = new PdfPCell(textoIV);
			textoArtIV.setExtraParagraphSpace(10);
			textoArtIV.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtIV.setBorder(0);

			Paragraph textoV = new Paragraph("V.Aquellas que las autoridades nacionales competentes determinen que hayan realizado o realicen actividades que formen parte, auxilien, o estén relacionadas con los delitos de financiamiento al terrorismo u operaciones con recursos de procedencia ilícita, previstos en el Código Penal Federal, y ", letraC);
			PdfPCell textoArtV = new PdfPCell(textoV);
			textoArtV.setExtraParagraphSpace(10);
			textoArtV.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtV.setBorder(0);

			Paragraph textoVI = new Paragraph("VI.	Aquellas que omitan proporcionar información o datos, la encubran o impidan conocer el origen, localización, destino o propiedad de recursos, derechos o bienes que provengan de delitos de financiamiento al terrorismo u operaciones con recursos de procedencia ilícita, previstos en el Código Penal Federal o los relacionados con éstos.", letraC);
			PdfPCell textoArtVI = new PdfPCell(textoVI);
			textoArtVI.setExtraParagraphSpace(30);
			textoArtVI.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoArtVI.setBorder(0);

			Paragraph textoVII = new Paragraph("Por lo anterior, hemos sido instruidos por la citada Unidad de Inteligencia Financiera, a suspender de forma inmediata cualquier acto, operación o servicio que se pretenda o se tenga celebrado entre usted y Banco Compartamos, S.A., Institución de Banca Múltiple.", letraM);
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
			Image direccion = generaImagen(ComprobantePdfView.class.getClassLoader().getResource("resources/imagenes/direccionBanco.png").getPath());

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
			Paragraph textoSP = new Paragraph("Asimismo, se hace de su conocimiento que puede acudir ante el Titular de la Unidad de Inteligencia Financiera de la Secretaría de Hacienda y Crédito Público, a hacer valer sus derechos, dentro de un plazo de 10 días hábiles contados a partir de la notificación del presente escrito, para que manifieste por escrito lo que a su interés convenga, aporte elementos de prueba y formule alegatos, esto de conformidad en la 72ª y 73ª de las citadas Disposiciones, que a su letra señalan:  ", letraM);
			PdfPCell texto1SP = new PdfPCell(textoSP);
			texto1SP.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			texto1SP.setExtraParagraphSpace(30);
			texto1SP.setBorder(0);

			Paragraph texto72a = new Paragraph("“72ª.-…Las Entidades que en términos de la presente Disposición hayan suspendido los actos, Operaciones o servicios con sus Clientes o Usuarios, de manera inmediata deberán hacer de su conocimiento dicha situación por escrito, en el que se deberá informar a dichos Clientes y Usuarios los fundamentos y la causa o causas de dicha inclusión, así como que dentro de los diez días hábiles siguientes al día de la recepción del citado escrito, podrán acudir ante la autoridad competente para efectos de la 73ª de las presentes Disposiciones.", letraC);
			texto72a.setIndentationLeft(20);
			PdfPCell textoS72a = new PdfPCell(texto72a);
			textoS72a.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoS72a.setExtraParagraphSpace(20);
			textoS72a.setBorder(0);

			Paragraph texto73a = new Paragraph("73ª.- Las personas que hayan sido incluidas en la Lista de Personas Bloqueadas podrán hacer valer sus derechos ante el Titular de la Unidad de Inteligencia Financiera de la Secretaría conforme a lo siguiente:", letraC);
			PdfPCell textoS73a = new PdfPCell(texto73a);
			textoS73a.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoS73a.setExtraParagraphSpace(20);
			textoS73a.setBorder(0);

			Paragraph textoSI = new Paragraph("I.	Se otorgará audiencia al interesado para que dentro del plazo de diez días hábiles, contado a partir de que tenga conocimiento de la suspensión a que se refiere la Disposición 72ª anterior, manifieste por escrito lo que a su interés convenga, aporte elementos de prueba y formule alegatos. El Titular de la Unidad de Inteligencia Financiera, a petición de parte, podrá ampliar por una sola ocasión el plazo a que se refiere esta fracción, hasta por el mismo lapso, para lo cual considerará las circunstancias particulares del caso.", letraC);
			PdfPCell textoCSI = new PdfPCell(textoSI);
			textoCSI.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoCSI.setExtraParagraphSpace(10);
			textoCSI.setBorder(0);

			Paragraph textoSII = new Paragraph("II.	El Titular de la Unidad de Inteligencia Financiera, dentro de los diez días hábiles siguientes a que se presente el interesado en términos de la fracción I anterior, emitirá resolución por la cual funde y motive su inclusión en la Lista de Personas Bloqueadas y si procede o no su eliminación de la misma.”",letraC);
			PdfPCell textoCSII = new PdfPCell(textoSII);
			textoCSII.setExtraParagraphSpace(150);
			textoCSII.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			textoCSII.setBorder(0);

			PdfPCell saludo = new PdfPCell(new Phrase("Sin más por el momento, nos ponemos a sus órdenes.", letraM));
			saludo.setExtraParagraphSpace(30);
			saludo.setBorder(0);

			//datos Compartamos
			Paragraph atte = new Paragraph("A T E N T A M E N T E", letraM);
			Phrase nBanco = new Phrase("\nBANCO COMPARTAMOS, S.A.", letraM);
			Phrase calle = new Phrase("\nInsurgentes Sur No. 1458, Col. Actipan", letraM);
			Phrase delegacion = new Phrase("\nDelegación Benito Juárez", letraM);

			atte.add(nBanco);
			atte.add(calle);
			atte.add(delegacion);

			//Agregamos el codigo postal
			PdfPCell datosB = new PdfPCell();

			datosB.addElement(atte);
			datosB.setBorder(0);

			Paragraph cp = new Paragraph("México, DF, 03230", letraM);
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

	/**
	 * Método para realizar la carga de imagenes en los pdf´s
	 * @param ruta
	 * @return
	 * @throws BadElementException
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static Image generaImagen(String ruta) throws BadElementException, MalformedURLException, IOException{
		Image foto = null;
		foto = Image.getInstance(ruta);
		foto.scaleToFit(150, 150);
		foto.setAlignment(Chunk.ALIGN_LEFT);

		return foto;
	}


}
