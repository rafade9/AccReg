//Js para el JSP registroCompartamos
//Fecha 18/01/2016
//Mara Vazquez

$(document).ready(function(){
	
//Catalogo de paises	
	var htmlPaises = "";
	$.getJSON("/CuentasN2/catalogos/paises", function(allData) {
			paises = $.map(allData, function(item) {
				htmlPaises += "<option value=" + item.clave + ">" + item.nombre + "</option>";
			});
	})
	.done(function() {
		document.getElementById("paisNacimiento").innerHTML = htmlPaises;
  	});
	
	
//Catalogo de lugar Lugar de nacimiento	
	var htmlEstados = "";
	$.getJSON("/CuentasN2/catalogos/estados", function(allData) {
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
	
//Obtenemos que tipo de nacionalidad fue seleccionada	
	$("#selNacionalidad").change(function(){
		var valor=$("#selNacionalidad").val();
			if(valor=='Otro'){
				document.getElementById('mensajeNac').style.display = 'block';
				jQuery("#paisNacimiento").attr('disabled',true);
				jQuery("#lugarNacimiento").attr('disabled',true);
				$('input[name=genero]').attr("disabled",true);
			}else{
				document.getElementById('mensajeNac').style.display = 'none';
				jQuery("#paisNacimiento").attr('disabled',false);
				jQuery("#lugarNacimiento").attr('disabled',false);
				$('input[name=genero]').attr("disabled",false);
				
			}
	});

//Cerramos el mensaje de nacionalidad	
	$("#btMensaje").click( function(){
    	document.getElementById('mensajeNac').style.display = 'none';
    });	

	
//realiza la validación del formulario	
	$("#formularioCompartamos").validate({
	    rules: {
	    	tipoIdentificacion: {
	        required: true,
	      },
	      numeroIdentificacion: {
	          required: true,
	          number: true
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
	             required: true,
	             minlength: 5,
				 maxlength: 5,
				 number: true
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
	         },
	         numInterior: {
	             number: true
	         }
	    },
	    messages: {
	    	tipoIdentificacion: {
	    	  required: "Por favor elige el tipo de identificación"
	      },
	      numeroIdentificacion: {
	          required: "Por favor proporcione el numero de identificación",
	          number: "Por favor proporciona sólo números"
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
	           required: "Por favor proporcione el código Postal",
	           number: "Por favor proporcione sólo números"
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
	         },
	         numInterior: {
	             number: "Por favor proporcione sólo números"
	         }
	    },
	    submitHandler: function() {
	    	alert('Voy a enviar el formulario');
	    	
	    	jsonObj = {}; 
	        
            $(".inputText").each(function(){
                   var keyInput = $(this).attr("name");
                   var valueInput = $(this).val();
                   jsonObj[keyInput] = valueInput;
            });
            
            $(".inputRadio").each(function(){
                   var keyInput = $(this).attr("name");
                   if(document.getElementById($(this).attr("id")).checked){
                      jsonObj[keyInput] = $(this).val();
                          }
            });
     	    	
	    	console.log(jsonObj);
            $.ajax({
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(jsonObj),
                //dataType: 'json',
                url: "./registro",
                success: function(datar){
                    $("#localhost:8888").html(datar);
                    console.log("Bien");
                }
            });
	            return false; 
	    
	    }
	  });
	
	
//desabilita los radio buttons para saber que tipo de telefono proporcionan
	$('input[name=tipoTel]').attr("disabled",true);
	
//Obtenemos si el cliente desea envió de SMS
	$("input[name=sms]").click(function () {
		if($(this).val() == 'no'){
			$('input[name=tipoTel]').attr("disabled",false);
		}else{
			$('input[name=tipoTel]').attr("disabled",true);
		}
    });	
  	
});


//Funcion que enmascara el campo de fecha
	$(function($){
		$("#fecha").mask("99/99/9999");
	});
	
	
//Funcion para obtener los datos dependiendo del codigo postal	
	$(function() {
		$("#codigoPostal").focusout(
			function() {
				if (this.value.length >= 4) {
//              	$.getJSON("getPostalCode.htm?cp=" + parseInt(this.value, 10), function(data) {//produccion
					$.getJSON("resources/codPostal.json", function(data) {//desarrollo	
						$("#colonia").prop('disabled', false);
						if (data.status === "Ok") {
							$("#estado").val(data.result.state);
							$("#delegacion").val(data.result.province);
							$("#ciudad").val(data.result.city);
							$("#colonia option[value='#']").remove();
							$("#colonia").append($('<option>', {
								value : "##",
								text : "--- Selecciona ---"
							}));
							$.each(data.result.location, function(
									i, item) {
								$("#colonia").append(
										$('<option>', {
											value : item,
											text : item
										}));
							});
							$("#colonia").append($('<option>', {
								value : "###",
								text : "--- Otra ---"
							}));
							$("#colonia").focus();									
						} else {
							$("#estado").val("");
							$("#delegacion").val("");
							$("#ciudad").val("");
							
							$("#colonia").replaceWith('<input id="colonia" name="colonia" class="inputText requerido alfanumerico alfanumericoBloquear" type="text" maxlength="30"/>');
							$("#colonia option").remove();
							$("#colonia").val("");
							
							$("#divMapa").css("display", "none");
						}
					});
			}
		});
	});
	
	
	