<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yastas</title>
  <script src="resources/js/jquery-1.10.1.js"></script>
  <script type="text/javascript" charset="UTF-8" src="resources/js/menuYastas.js"></script>
 
  <link href="resources/css/YastasGen.css" rel="stylesheet" type="text/css">
  <link href="resources/css/menuYastas.css" rel="stylesheet" type="text/css">
  <link href="resources/img/faviconYastas.ico" rel="icon" type="image/x-icon">

</head>

<body>
<div id="main">
  <div id="top">
    <div id="logo"><img src="resources/img/logo.png"></div>
  </div>
   <div class="cf"></div>
  <div id="portalContent">
	<center>
 	<div id="formCompartamos" style='display:block;'>
		<input id="originacion" type="button" value="Originación" class="botonMenu">
		<input id="reposicion" type="button" value="Reposición" class="botonMenu">
		<br><br>
		<input type="hidden" id="origen" name="origen" value="yastas">
		<input type="submit" id="salir" name="salir" value="Salir" class="botonSalir">
	</div>
	</center>
  </div>
</div>

</body>
</html>