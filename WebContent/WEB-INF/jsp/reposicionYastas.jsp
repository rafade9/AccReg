<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yastas</title>

  <script src="resources/js/jquery-1.10.1.js"></script>
   <script src="resources/js/jquery.validate.js"></script>
  <script src="resources/js/messages_es.js"></script>
  <script type="text/javascript" charset="UTF-8" src="resources/js/reposicionYastas.js"></script>
  <script src="resources/js/jquery.maskedinput.min.js" type="text/javascript"></script>    
 
  <link href="resources/css/YastasGen.css" rel="stylesheet" type="text/css">
  <link href="resources/css/reposicionYastas.css" rel="stylesheet" type="text/css">
  <link href="resources/img/faviconYastas.ico" rel="icon" type="image/x-icon">

</head>
<body>
	<div id="main">
  <div id="top">
    <div id="logo"><img src="resources/img/logo.png"></div>
  </div>
   <div class="cf"></div>
  <div id="portalContent">
 	<div id="formCompartamos">
 			<div id="seccionTitulo">
 				<center>
					<p class="tituloMango">Reposición<br></p><br>
				</center>
 			</div>
 	
			<div id="seccionError" style='display:none;' align="center"></div><br><br>
		<form id="formulario" action="" novalidate>
				<div id="seccionReferencia" style='display:block;'>
					<label class="texGris09_13">Referencia * </label><input type="text" id="referencia" name="referencia" class=" texGris09_13 inputText" maxlength="18">
					<label id= "errorcontainer-referencia"></label><br>
					<div class="clear"> </div>
					<label class="texGris09_13">Confirmación *<br> Referencia </label><input type="text" id="referenciaConf" name="referenciaConf" class="texGris09_13 inputText " maxlength="18">
					<label id= "errorcontainer-referenciaConf"></label><br>
					<div class="clear"> </div>
				</div>
				<div id="seccionFecha" style='display:block;'>
					<label  class="texGris09_13">Fecha de nacimiento * <br> (DD/MM/AAAA)</label><input type="text" name="fechaNacimiento" size="11" class="texGris09_13 inputText" id="fechaNacimiento" >
					<label id= "errorcontainer-fechaNacimiento"></label><br>
				</div>
				<div id="seccionFolio" style='display:block;'>
					<label class="texGris09_13">Folio * </label><input type="text" id="folio" name="folio" class="texGris09_13 inputText mayusculas" maxlength="15">
					<label id= "errorcontainer-folio"></label><br>
				</div>
				<div id="seccionBotones">
					<input type="hidden" id="origen" name="origen" value="yastas">
					<input type="submit" id="enviar" name="enviar" value="Enviar">
					<input type="button" id="salir" name="salir" value="Salir">
				</div>
				<div id="seccionOk" style='display:none;' align="center">
					<center>
				</center>
			</div>
			<div id="seccionSalir" style='display:none;'>
				<center>
					<input type="button" id="cancelar" name="cancelar" value="Salir">
				</center>
		</div>
		</form>
	</div>

  </div>
</div>
</body>
</html>