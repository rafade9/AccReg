<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yastás</title>
<link href="http://www.yastas.com/wps/themes/html/YastasOrg/images/favicon.ico" rel="shortcut icon">
<link href="./Yastás_files/styles.jsp" rel="styleSheet" type="text/css">
<link href="./Yastás_files/cssYastasContenido.css" rel="stylesheet" type="text/css">
<link href="./Yastás_files/YastasGen.css" rel="stylesheet" type="text/css">
<link href="./Yastás_files/menu.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/resources/css/screen.css">
<script type="text/javascript" src="/resources/js/jquery.js"></script>
<script src="/resources/js/jquery.validate.js"></script>
</head>
<style>

		#contact label{
			display: inline-block;
			width: 100px;
			text-align: right;
		}
		#contact_submit{
			padding-left: 100px;
		}
		#contact div{
			margin-top: 1em;
		}
		textarea{
			vertical-align: top;
			height: 5em;
		}
			
		.error{
			display: none;
			margin-left: 10px;
		}		
		
		.error_show{
			color: red;
			margin-left: 10px;
		}
		
		input.invalid, textarea.invalid{
			border: 2px solid red;
		}
		
		input.valid, textarea.valid{
			border: 2px solid green;
		}


input
{
   width: 220px; 
   height: 20px; 
   padding: 5px 20px 0px 20px; 
   margin: 0 0 20px 0;
   border-radius: 5px; 
   -moz-border-radius: 5px; 
   -webkit-border-radius: 5px;
   -moz-box-shadow: 0px 0px 0px #f2f2f2;
   -webkit-box-shadow: 0px 1px 0px #f2f2f2;
   font-family: Arial; 
   font-size: 16px;
}

input:focus, textarea:focus {
   background: white;
   }
   
   
label { display: inline-block; width: 160px; text-align: right; }

input[type="radio"] {
    width: 40px;
  }
 
input[type="button"] {
	height: 25px; 
    width: 90px;
	background:#CA005D;
	color: white;
	font-size: 16px;
  }
select{
	border-radius: 5px
	-moz-border-radius: 5px; 
    -webkit-border-radius: 5px;
	-moz-box-shadow: 0px 0px 0px #f2f2f2;
    -webkit-box-shadow: 0px 1px 0px #f2f2f2;
	height: 30px;
	width: 265px;
}

body {
    background-color: #ce4676;
}

	form label.error, form input.submit {
		margin-left: 253px;
	}
	
	#formularioCompartamos label.error {
		margin-left: 10px;
		width: auto;
		display: inline;
	}


</style>


<script type="text/javascript">
	$.validator.setDefaults({
		submitHandler: function() {
			alert("submitted!");
		}
	});

	$(document).ready(function(){
		$("#formularioCompartamos").validate({
			rules: {
				txUsuario: {
					required: true,
					minlength: 5
					}
				},
			messages: {
				txUsuario: {
					required: 'Por favor proporciona el usuario',
					minlength: "La logitud del usuario debe ser mayor 5"
				}
			}
	});
});
</script>


<body>
<div id="main">
  <div id="top">
    <div id="logo"><a href="http://www.yastas.com/"><img src="./Compartamos Banco_files/logo_banco.png"></a></div>
   <div class="cf"></div>
  <div id="portalContent" > 
	<p class="tituloMango"><br><br>
			Bienvenido al módulo de apertura de <br/> Cuenta a mi favor Compartamos
	</p>
	<br><br>
	<div>
	<center>
	<form id="formularioCompartamos" class="cmxform" method="post" action="">
			<label class="texGris09_13" for="txUsuario">Usuario: </label><input type="text" id="txUsuario" name="txUsuario" title="Por favor ingrese su Usuario" required ><br><br>
			<label class="texGris09_13">Contraseña: </label><input type="text" required title="Por favor ingrese su Password"><br><br>
			<input type="submit" id="submitCom" value="Enviar">
	</form>
	</div>
	</div>
		    <div id="footer">	
  	<!-- bottomMenu -->
      	
        <img src="./Yastás_files/PieYastas.png" width="945" height="25" usemap="#barnav_inf" border="0">
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
</body>
</html>