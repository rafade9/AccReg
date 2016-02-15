<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yastas</title>

  <script src="resources/js/jquery-1.11.0.js"></script>
    <script src="resources/js/jquery-ui-1.10.4.custom.js"></script>
  <script src="resources/js/jquery.validate.js"></script>
  <script src="resources/js/messages_es.js"></script>
  <script src="resources/js/registroYastas.js"></script>
  <script src="resources/js/jquery.maskedinput.min.js" type="text/javascript"></script>
  
 
<link href="resources/css/YastasGen.css" rel="stylesheet" type="text/css">
<link href="resources/css/registroYastas.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="resources/css/jquery-ui.css">
  
 <style>
  .custom-combobox {
    position: relative;
    display: inline-block;
  }
  .custom-combobox-toggle {
    position: absolute;
    top: 0;
    bottom: 0;
    margin-left: -28px;
    padding: 0;
  }
  .custom-combobox-input {
    margin: 0;
    padding: 5px 21px;
  }
  
  .ui-widget {
    font-family: Arial,Helvetica,sans-serif;
    font-size: 13px;
    font-style: normal;
    font-variant: normal;
    font-weight: lighter;
    line-height: 15px;
    text-align: left;
    text-decoration: none;
}

.ui-widget-content {
    background: #ffffff  repeat-x scroll 50% 50%;
    border: 1px solid #aaaaaa;
    color: #222222;
}

  </style>

</head>

<body>
<div id="main">
  <div id="top">
    <div id="logo"><img src="resources/img/logo.png"></a></div>
  </div>
   <div class="cf"></div>
  <div id="portalContent">
  
  <!-- div de formulario de registro --> 
	
	<div id="formCompartamos" style='display:block;'>
		<form id="formularioCompartamos" action="" novalidate align="center">
		<div id="seccionTarjeta">
		<!-- Folio de la tarjeta -->
			<p class="tituloMango">Datos de Tarjeta<br></p><br><br>
				<label for="folio" class="texGris09_13">Folio * </label><input type="text" id="folio" name="folio" class="texGris09_13 inputText" maxlength="15"><br>
				<div class="clear"> </div><br><br>
		</div>
		<div id="seccionCliente" style='display:block;'>
	    <!-- Datos del cliente -->
			<p class="tituloMango">Datos Personales<br></p>
			<br><br><br><br>
				<label class="texGris09_13">Tipo de identificación * </label>
				<label class="texGris09_13"><input type="radio" name="tipoIdentificacion" id="ine" value="ZCVELE" class="inputRadio" checked>IFE/INE</label>
				<label class="texGris09_13"><input type="radio" name="tipoIdentificacion" id="pasaporte" value="FS0002" class="inputRadio">Pasaporte</label><br>
				<div class="clear"> </div>
				<label for="numeroIdentificacion" class="texGris09_13">Número de identificación * </label><input type="text" id="numeroIdentificacion" name="numeroIdentificacion" class="texGris09_13 inputText"><br>
				<div class="clear"> </div>
				<label for="primerNombre" class="texGris09_13">Primer nombre * </label><input type="text" id="primerNombre" name="primerNombre" class="texGris09_13 inputText" maxlength="40"><br>
				<div class="clear"> </div>
				<label for="segundoNombre" class="texGris09_13">Segundo nombre </label><input type="text" id="segundoNombre" name="segundoNombre" class="texGris09_13 inputText" maxlength="40"><br>
				<div class="clear"> </div>
				<label for="paterno" class="texGris09_13">Apellido Paterno * </label><input type="text" id="paterno" name="paterno" class="texGris09_13 inputText"maxlength="40" ><br>
				<div class="clear"> </div>
				<label for="materno" class="texGris09_13">Apellido Materno </label><input type="text" id="materno" name="materno" class="texGris09_13 inputText" maxlength="40"><br>
				<div class="clear"> </div>
				<label for="fechaNacimiento" class="texGris09_13">Fecha de nacimiento * </label><input type="text" name="fechaNacimiento" size="11" class="texGris09_13 inputText" id="fechaNacimiento" ><br>
				<div class="clear"> </div>
		
				<label class="texGris09_13">Nacionalidad * </label>
				<select class="select inputText"  id="nacionalidad" name="nacionalidad">
					<option value="" class="texGris09_13">--Nacionalidad--</option>
					<option value="MX" class="texGris09_13">Mexicano</option>
					<option value="Otro" class="texGris09_13">Otro</option>
				</select><br><br>
		
				<label class="texGris09_13">Pais Nacimiento * </label>
				<select class="select inputText texGris09_13" name="paisNacimiento" id="paisNacimiento" ></select><br><br>
		
				<label class="texGris09_13">Lugar de Nacimiento * </label>
				<select class="select inputText" name="lugarNacimiento" id="lugarNacimiento"></select><br><br>

				<label class="texGris09_13">Género * </label>
				<label class="texGris09_13"><input type="radio" name="genero" checked id ="generoM" value="2" class="inputRadio">Masculino</label>
				<label class="texGris09_13"><input type="radio" id="generoF" name="genero" value="1" class="inputRadio">Femenino</label><br>
		
				<label class="texGris09_13">¿Desea notificaciones SMS? * </label>
				<label class="texGris09_13"><input type="radio" name="sms" id="smsSi"  class="inputRadio" value="true">Si</label>
				<label class="texGris09_13"><input type="radio" name="sms" id="smsNo" class="inputRadio" value="false">No</label><br>
		
				<label class="texGris09_13"><input type="radio" name="tipoTelefono" id="celular"  class="inputRadio" value="2" checked>Celular</label>
				<label class="texGris09_13"><input type="radio" name="tipoTelefono" id="casa" class="inputRadio" value="1" >Casa</label>
				<label class="texGris09_13"><input type="radio" name="tipoTelefono" id="negocio" class="inputRadio" value="3">Negocio</label><br>
		
				<label for="telefono" class="texGris09_13">Teléfono de contacto * </label><input type="text" id="telefono" name="telefono" class="texGris09_13 inputText" maxlength="10">
				
		<!-- Direccion -->
			<p class="tituloMango">Dirección</p><br><br>
	
				<label for="codigoPostal" class="texGris09_13">Código Postal * </label><input type="text" id="codigoPostal" name="codigoPostal" class="texGris09_13 inputText" maxlength="5"><br>
		
				<label class="texGris09_13">Estado * </label>
				<select class="select inputText" id="estado" name="estado" >
								<option value="" class="texGris09_13">--- Selecciona ---</option><option value="AGS" class="texGris09_13">Aguascalientes</option><option value="BCN" class="texGris09_13">Baja California</option><option value="BCS" class="texGris09_13">Baja California Sur</option><option value="CAM" class="texGris09_13">Campeche</option><option value="CHS" class="texGris09_13">Chiapas</option><option value="CHI" class="texGris09_13">Chihuahua</option><option value="COA" class="texGris09_13">Coahuila De Zaragoza</option><option value="COL" class="texGris09_13">Colima</option><option value="DF" class="texGris09_13">Distrito Federal</option><option value="DGO" class="texGris09_13">Durango</option><option value="GTO" class="texGris09_13">Guanajuato</option><option value="GRO" class="texGris09_13">Guerrero</option><option value="HGO" class="texGris09_13">Hidalgo</option><option value="JAL" class="texGris09_13">Jalisco</option><option value="EM" class="texGris09_13">M&eacutexico</option><option value="MIC" class="texGris09_13">Michoac&aacuten de Ocampo</option><option value="MOR" class="texGris09_13">Morelos</option><option value="NAY" class="texGris09_13">Nayarit</option><option value="NL" class="texGris09_13">Nuevo Le&oacuten</option><option value="OAX" class="texGris09_13">Oaxaca</option><option value="PUE" class="texGris09_13">Puebla</option><option value="QRO" class="texGris09_13">Quer&eacutetaro</option><option value="QR" class="texGris09_13">Quintana Roo</option><option value="SLP" class="texGris09_13">San Luis Potos&iacute</option><option value="SIN" class="texGris09_13">Sinaloa</option><option value="SON" class="texGris09_13">Sonora</option><option value="TAB" class="texGris09_13">Tabasco</option><option value="TAM" class="texGris09_13">Tamaulipas</option><option value="TLA" class="texGris09_13">Tlaxcala</option><option value="VER" class="texGris09_13">Veracruz de Ignacio de la Llave</option><option value="YUC" class="texGris09_13">Yucat&aacuten</option><option value="ZAC" class="texGris09_13">Zacatecas</option>
				</select><br><br>
		
				<label class="texGris09_13">Delegación/Municipio * </label> 
				<input type="text" id="delegacion" name="delegacion" class="texGris09_13 inputText">
				<br><br>
		
				<label class="texGris09_13">Ciudad * </label>
				<input type="text" id="ciudad" name="ciudad" class="texGris09_13 inputText">
				<br><br>
		
				<label class="texGris09_13">Colonia * </label>
				<select class="select inputText" id="colonia" name="colonia">
				</select><br><br>
		
				<label class="texGris09_13">Calle * </label> <input type="text" id="calle" name="calle" class="texGris09_13 inputText" maxlength="60"><br>
				<label class="texGris09_13">Número Exterior * </label> <input type="text" id="numExterior" name="numExterior" class="texGris09_13 inputText" maxlength="10"><br>
				<label class="texGris09_13">Número Interior </label><input type="text" id="numInterior" name="numInterior" class="texGris09_13 inputText" maxlength="10"><br><br>
			</div>	
			<div id="seccionEnviar" style='display:block;'>	
				<input type="submit" id="enviar" name="enviar" value="Enviar">
				<input type="button" value=Salir id="btCancelar" />
			</div>	
		</form>
	</div>
<!-- Fin de formulario de registro -->	
	

<!--Mensaje que se enviaran como respuesta del servicio de registro  -->
	<div id="principalMensaje" style='display:none;' align="center">	
		<div id="mensajeRegistro"></div><br><br><br>
			<div id="botonSalir"  class="tituloMango" style='display:none;'>
				<input type="hidden" id="origen" name="origen" value="yastas">
				<input type="button" value=Salir id="btSalir" />
		    </div>
	</div>
<!--Fin de mensaje-->

	
<!--Mensaje que se enviara para los clientes que no son de Nacionalidad Mexicana -->	
	<div id="mensajeNac" class="" style='display:none;' class="tituloMango">
		<p>Por el momento este producto sólo aplica para ciudadanos Mexicanos</p><br>
		<input type="button" value="Aceptar" id="btMensaje" />
	
	</div>
<!-- Fin del mensaje que se enviará validando la nacionalidad -->	
	
	<div id="footer">	

    </div>
  </div>
</div>

</body>
</html>