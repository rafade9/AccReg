  
  <link href="../resources/css/YastasGen.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" title="" href="../resources/css/cssYastasContenido.css" type="text/css">
   <link rel="stylesheet" href="../resources/css/estilo.css">
  
  <script src="../resources/js/jquery-1.11.0.js"></script>
  <script src="../resources/js/jquery.validate.js"></script>
  <script src="../resources/js/additional-methods.js"></script>
  <script src="../resources/js/messages_es.js"></script>
 </head>
<body>
<div id="main">
   <div id="top">
      <div id="logo"><a href="http://www.compartamos.com.mx/"><img src="../resources/img/logo_banco.png"></a></div>
   		<div class="cf"></div>
  			<div id="portalContent" > 
   					<p class="tituloMango"><br><br>
						Bienvenido al módulo de apertura de <br/> Cuenta a mi favor Compartamos
					</p><br><br>
					<form id="formularioCompartamos"action="../loginProcessCompartamos" method="post" novalidate align="center" commandName="Persona">

	     				<label for="nombre"  class="texGris09_13" >Usuario  *</label> <input type="text" id="username" name="username"  class="texGris09_13" >
	     				<div class="clear"> </div>
	     				<label for="apellidos"  class="texGris09_13" >Password  *</label> <input type="text" id="password" name="password"  class="texGris09_13" >
	     				<div class="clear"> </div>
	     				<label for="apellidos"  class="texGris09_13" >Folio  *</label> <input type="text" id="folioTarjeta" name="folioTarjeta"  class="texGris09_13" >
	     				<div class="clear"> </div>
	     				<input class="enviar" type="submit" value="Enviar">

					</form>
					<div class="clear"> </div>
			
			</div>
 <div id="footer">	
  	<!-- bottomMenu -->
      	
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
</body>
</html>


<style>

	body {
    background-color: #ce4676;
}

	form label.error, form input.submit {
		margin-left: 253px;
	}

	form {
  	width: 80%;
  	margin: 0 auto;
  	text-align: center; /* Este es para Internet Explorer ¬¬, que de lo contrario no lo centrará (en los navegadores antiguos) */
}


input[type="submit"] {
    background: #ca005d none repeat scroll 0 0;
    color: white;
    font-size: 16px;
    height: 25px;
    width: 90px;
}

</style>




<script>
$("#formularioCompartamos").validate({
    rules: {
      nombre: {
        required: true,
        lettersonly: true
      },
      apellidos: {
        required: true
      }
    },
    messages: {
      nombre: {
    	  required: "Por favor proporcione su usuario",
    	  lettersonly: "Por favor sólo proporcione letras"
      },

      apellidos: {
    	  required: "Por favor proporcione su password"
      }
    },
    submitHandler: function() {
    	form.submit();
    }
  });

</script>