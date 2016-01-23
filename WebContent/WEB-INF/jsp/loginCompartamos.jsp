<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Compartamos</title>  
  <link href="resources/css/YastasGen.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" title="" href="resources/css/loginCompartamos.css" type="text/css">
  
  <script src="resources/js/jquery-1.11.0.js"></script>
  <script src="resources/js/jquery.validate.js"></script>
  <script src="resources/js/loginCompartamos.js"></script>
  <script src="resources/js/messages_es.js"></script>
 </head>
<body>
<div id="main">
   <div id="top">
      <div id="logo"><a href="http://www.compartamos.com.mx/"><img src="resources/img/logo_banco.png"></a></div>
   		<div class="cf"></div>
  			<div id="portalContent" > 
   					<p class="tituloMango"><br><br>
						Bienvenido al módulo de apertura de <br/> Cuenta a mi favor Compartamos
					</p><br><br>
					<c:if test="${not empty error}">
						<div class="error" id="mensajeError">${error}</div>
					</c:if>
					<br>
					<form id="formularioCompartamos" action="./loginProcessCompartamos" method="post" novalidate align="center" commandName="Persona">

	     				<label for="username"  class="texGris09_13" >Usuario  *</label> <input type="text" id="username" name="username"  class="texGris09_13" >
	     				<div class="clear"> </div>
	     				<label for="password"  class="texGris09_13" >Password  *</label> <input type="password" id="password" name="password"  class="texGris09_13" >
	     				<div class="clear"> </div>
	     				<input type="hidden" id="origen" name="origen" value="compartamos">
	     				<input class="enviar" type="submit" value="Enviar">

					</form>
					<div class="clear"> </div>
			
			</div>
 <div id="footer">	
  	<!-- bottomMenu -->

    <!-- ends bottomMenu -->
	
</div>
</div>
</div>
</body>
</html>

