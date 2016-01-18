<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Compartamos Banco</title>

  <script type="text/javascript" src="jquery.js"></script>
  <script src="resources/js/jquery-1.11.0.js"></script>
  <script src="resources/js/jquery.validate.js"></script>
  <script src="resources/js/additional-methods.js"></script>
  <script src="resources/js/messages_es.js"></script>
  <script src="resources/js/jquery.maskedinput.min.js" type="text/javascript"></script>
  
<link href="resources/css/YastasGen.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" title="" href="resources/css/cssYastasContenido.css" type="text/css">


<script type="text/javascript">


$(document).ready(function(){
	
	var codPost = "";
	$.getJSON("https://www.compartamos.com.mx/FormularioProspectacion/getPostalCode.htm?cp=54710", function(allData) {
		codPost = $.map(allData, function(item) {
			console('Entre');
		});
	});
	
	
	
	var htmlPaises = "";
	
	$.getJSON("http://localhost:8888/CuentasN2/catalogos/paises", function(allData) {
			paises = $.map(allData, function(item) {
				htmlPaises += "<option value=" + item.clave + ">" + item.nombre + "</option>";
			});
	})
	.done(function() {
		document.getElementById("paisNacimiento").innerHTML = htmlPaises;
  	});
	
	
	
	var htmlEstados = "";
	
	$.getJSON("http://localhost:8888/CuentasN2/catalogos/estados", function(allData) {
			estados = $.map(allData, function(item) {
				htmlEstados += "<option value=" + item.clave + ">" + item.nombre + "</option>";
			});
	})
	.done(function() {
		document.getElementById("lugarNacimiento").innerHTML = htmlEstados;
  	});
	
	

	$('#txNumIdent').keyup(function (){
            this.value = (this.value + '').replace(/[^0-9]/g, '');
 	});
	
	
	$("#selNacionalidad").change(function(){
		var valor=$("#selNacionalidad").val();
			if(valor=='Otro'){
				alert(valor);
				document.getElementById('mensajeNac').style.display = 'block';
				}        
	});
  	
});

	$(function($){
		$("#fecha").mask("99/99/9999");
	});
	
	$.fn.serializeObject = function() {
	    var o = {};
	    var a = this.serializeArray();
	    $.each(a, function() {
	        if (o[this.name]) {
	            if (!o[this.name].push) {
	                o[this.name] = [o[this.name]];
	            }
	            o[this.name].push(this.value || '');
	        } else {
	            o[this.name] = this.value || '';
	        }
	    });
	    return o;
	};
	
</script>

<style>
 .select
  {
  border: 2px solid #DBE1EB;
  border-radius: 4px;
  width:270px;
}
 .select:hover
  {
  border-color: #CE4676;
  }
.text:hover{
   border-color: #FF6347;	
}

tr.spaceUnder > td
{
  padding-bottom: 1em;
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
</style>

<div id="main">
  <div id="top">
    <div id="logo"><a href="http://www.yastas.com/"><img src="resources/img/logo_banco.png"></a></div>
  </div>
   <div class="cf"></div>
  <div id="portalContent"> 
	<p class="tituloMango">Datos Personales<br></p>
	<br><br><br><br>
	
	<div id="formulario">
	<center>
	<form id="formularioCompartamos" action="/CuentasN2/registroCompa" method="get" novalidate modelAttribute="Persona" >
		<label class="texGris09_13">Tipo de identificación * </label><label class="texGris09_13">
		<input type="radio" name="tipoIdentificacion" id="tipoIdentificacion" value="ine" checked>IFE/INE</label>
		<label class="texGris09_13"><input type="radio" name="tIdentificacion" id="rdIdent" value="pasaporte">Pasaporte</label><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Número de identificación * </label><input type="text" id="numeroIdentificacion" name="numeroIdentificacion"><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Primer nombre * </label><input type="text" id="primerNombre" name="primerNombre"><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Segundo nombre </label><input type="text" id="segundoNombre" name="segundoNombre"><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Apellido Paterno * </label><input type="text" id="paterno" name="paterno"><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Apellido Materno </label><input type="text" id="materno" name="materno"><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Fecha de nacimiento * </label><input type="text" name="fecha" id="fecha" size="11" class="texGris09_13" id="fechaNacimiento" name="fechaNacimiento"><br>
		<div class="clear"> </div>
		<label class="texGris09_13">Nacionalidad * </label>
		<select class="select" id="selNacionalidad" name="selNacionalidad" id="nacionalidad" name="nacionalidad">
				<option value="">--Nacionalidad--</option>
				<option value="Mexicano">Mexicano</option>
				<option value="Otro">Otro</option>
		</select><br><br>
		<label class="texGris09_13">Pais Nacimiento * </label>
		<select class="select" name="paisNacimiento" id="paisNacimiento">
		</select><br><br>
		<label class="texGris09_13">Lugar de Nacimiento * </label>
		<select class="select" name="lugarNacimiento" id="lugarNacimiento">
		</select><br><br>

		<label class="texGris09_13">Género * </label><label class="texGris09_13"><input type="radio" name="genero" value="ine" checked id ="genero" name="genero">Masculino</label><label class="texGris09_13"><input type="radio" id="genero" name="genero" value="pasaporte">Femenino</label><br>
		<label class="texGris09_13">¿Desea notificaciones SMS? * </label><label class="texGris09_13"><input type="radio" name="sms" id="sms" value="ine" checked>Si</label><label class="texGris09_13"><input type="radio" name="sms" value="pasaporte">No</label><br>
		<label class="texGris09_13">Teléfono de contacto * </label><input type="text" id="tipoTelefono" name"tipoTelefono">
		<p class="tituloMango">Dirección</p><br><br>
	
		<label class="texGris09_13">Código Postal * </label><input type="text" id="codigoPostal" name="codigoPostal" class="inputText"><br>
		<label class="texGris09_13">Estado * </label>
		<select class="select" id="estado" name="estado">
				<option value="">--Estado--</option>
				<option value="1">Aguscalientes</option>
		</select><br><br>
		<label class="texGris09_13">Delegación/Municipio * </label> 
		<select class="select" id="delegacion" name="delegacion">
				<option value="">--Delegación/Municipio--</label></option>
				<option value="1">Tlalpan</label></option>
		</select><br><br>
		<label class="texGris09_13">Ciudad * </label>
		<select class="select" id="ciudad" name="ciudad">
				<option value="">--Ciudad--</option>
				<option value="1">Aguscalientes</label></option>
		</select><br><br>
		<label class="texGris09_13">Colonia * </label></td><td> 
		<select class="select" id="colonia" name="colonia">
				<option value="">--Colonia--</option>
				<option value="1">Polanco</label></option>
		</select><br><br>
		<label class="texGris09_13">Calle * </label> <input type="text" id="calle" name="calle"><br>
		<label class="texGris09_13">Número Exterior * </label> <input type="text" id="numExterior" name="numExterior"><br>
		<label class="texGris09_13">Número Interior * </label><input type="text" id="numInterior" name="numInterior"><br><br>
		<input type="submit" name="enviar" value="Enviar">
	</form>
	</center>	
	</div>
	
	<div id="mensajeNac" style='display:none;'>
		<p>Lo sentimos pero este tipo de cuentas sólo se encuentran disponibles para personas de Nacionalidad Mexicana</p>
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

<style>
		form label.error, form input.submit {
		margin-left: 253px;
		}
	
	label.error {
    color: #d60404;
}
</style>

<script>
$("#formularioCompartamos").validate({
    rules: {
    	tipoIdentificacion: {
        required: true,
      },
      numeroIdentificacion: {
          required: true,
        },
        primerNombre: {
        required: true
      },
       paterno: {
            required: true
          },
        fecha: {
           required: true
         },
         nacionalidad: {
             required: true
           },
           paisNacimiento: {
             required: true
         },
         lugarNacimiento: {
             required: true
         },
         genero: {
             required: true
         },
         sms: {
             required: true
         },
         tipoTelefono: {
             required: true
         },
         codigoPostal: {
             required: true
         },
         estado: {
             required: true
         },
         delegacion: {
             required: true
         },
         ciudad: {
             required: true
         },
         colonia: {
             required: true
         },
         calle: {
             required: true
         },
         numExterior: {
             required: true
         }
      
    },
    messages: {
    	tipoIdentificacion: {
    	  required: "Por favor elige el tipo de identificación",
      },
      numeroIdentificacion: {
          required: "Por favor proporcione el numero de identificación"
        },
      primerNombre: {
    	  required: "Por favor proporcione el Nombre"
      },
      paterno: {
    	  required: "Por favor proporcione el Apellido"
      },
      fecha: {
          required: "Por favor porporcione la fecha"
      },
        nacionalidad: {
            required: "Por favor elige una Nacionalidad"
          },
        paisNacimiento: {
              required: "Por favor elige un Pais"
         },
        lugarNacimiento: {
            required: "Por favor elige un Lugar"
           },
           genero: {
           required: "Por favor elige un genero"
                },
                sms: {
                    required: "Elige si desean envio SMS"
                  },
                  tipoTelefono: {
                      required: "Por favor proporcione el número de telefono"
                    },
                    codigoPostal: {
                        required: "Por favor proporcione el código Postal"
                    },
                    estado: {
                        required: "Por favor elige un estado"
                    },
                    delegacion: {
                        required: "Por favor proporciona la delegación"
                    },
                    ciudad: {
                        required: "Por favor proporciona la ciudad"
                    },
                    colonia: {
                        required: "Por favor proporciona la colonia"
                    },
                    calle: {
                        required: "Por favor proporciona la calle"
                    },
                    numExterior: {
                        required: "Por favor proporciona el numero Exterior"
                    }
    },
    submitHandler: function() {
      	alert('Ya entre');
      	
            var var_persona=$(this).serializeObject();
            $.ajax({
                type: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(var_persona),
                //dataType: 'json',
                url: "./CuentasN2/registro",
                success: function(datar){
                    $("#localhost:8888").html(datar);
                }
            });
            return false; //Esto anula el evento Submit()
    
    }
  });

</script>
</body>
</html>