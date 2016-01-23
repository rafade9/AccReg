<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="resources/js/jquery-1.11.0.js"></script>
<script src="resources/js/jquery.validate.js"></script>
<script src="resources/js/messages_es.js"></script>
<script src="resources/js/loginYastas.js"></script>

<link rel="stylesheet" type="text/css" href="resources/css/YastasGen.css"/>
<link rel="stylesheet" type="text/css" href="resources/css/loginYastas.css"/>

<title>Yastás</title>

</head>
<body>
<div id="main">
  <div id="top">
    <div id="logo"><a href="http://www.yastas.com/"><img src="resources/img/logo.png"></a></div>
  </div>
   <div class="cf"></div>
   <div id="portalContent" >
	<p class="tituloMango">
			Bienvenido al módulo de apertura de <br/> Cuenta a mi favor Compartamos
	</p><br/><br/><br/>
	<c:if test="${not empty error}">
						<div class="error" id="mensajeError">${error}</div>
					</c:if>
	<div id="formYastas">

	<form id="formularioYastas" action="./loginProcessCompartamos" method="post">
		
		<label class="texGris09_13">Ingrese el ID del operador:</label> <input type="text" id="username" name="username" class="texGris09_13">
		<div class="clear"> </div>
		
	<table>
			<tr>
				<td style="border: 1px solid #7F9DB9;"><img alt="Captcha"
					src="captcha.htm"></td>
				<td width="31"></td>
			</tr>
		</table>
		<table border="0" cellpadding="0" cellspacing="4">
			<tr>
				<label class="texGris09_13">Ingrese la secuencia:</label>
				<td valign="top"><input type="text" style="width: 173px;"
					name="captcha" id="captcha"
					class="requerido captcha captchaBloquear"></td>
				<td valign="middle"><a href="loginYastas"><img
						src="resources/img/imgRefresh.jpg" width="23" height="23"></a></td>
				<td width="29"></td>
			</tr>
		</table>
		<input type="hidden" id="origen" name="origen" value="yastas">		
		<input type="submit" value="Enviar">
	</form>
	
	</div>
		    <div id="footer">	
  	<!-- bottomMenu -->
      	
        <img src="resources/img/PieYastas.png" width="945" height="25" usemap="#barnav_inf" border="0">
        <map name="barnav_inf">		
			<area shape="rect" coords="0,6,56,19" href="http://www.yastas.com/wps/portal/Yastas/AvisoPrivacidad" title="Aviso de Privacidad">
			<area shape="rect" coords="87,6,167,19" href="http://www.yastas.com/wps/portal/Yastas/MapaSitio" title="Mapa de Sitio">
			<area shape="rect" coords="890,3,908,21" href="http://www.facebook.com/YastasMexico" title="Facebook">
			<area shape="rect" coords="914,3,933,21" href="http://www.twitter.com/Red_Yastas" title="Twitter">
			<area shape="rect" coords="939,3,963,21" href="http://www.youtube.com/yastasmx" title="YouTube">						
		</map>


    <!-- ends bottomMenu -->
	</div>
  </div>
</div>
</body></html>