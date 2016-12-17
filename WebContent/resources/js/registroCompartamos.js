//Js para el JSP registroCompartamos
//Fecha 22/01/2016
//Mara Vazquez

$(document).ready(function(){
	
	varTimer = setTimeout(logoutFtn, 300000);
	  
	function logoutFtn(){
		window.location.href = "logout/compartamos";
	}
	
	function restartTimer(){
		clearTimeout(varTimer);
		varTimer = setTimeout(logoutFtn, 300000);
	}
	
	//Mensajes de respuesta
	var mensajesCompartamos = [];
	mensajesCompartamos[0] = "<p class='greenMsgClass'>Cuenta Creada con &Eacute;xito.</p><p class='blackMsgClass'>Favor de Generar e Imprimir comprobante.</p>";
	mensajesCompartamos[1] = "<p class='blackMsgClass'>El Usuario no corresponde a la Sede</p>";
	mensajesCompartamos[2] = "<msg class='redMsgClass'>Folio Inv&aacute;lido, </msg><msg class='blackMsgClass'>ingrese uno nuevo</msg>";
	mensajesCompartamos[3] = "<msg class='redMsgClass'>Folio Inv&aacute;lido, </msg><msg class='blackMsgClass'>ingrese uno nuevo</msg>";
	mensajesCompartamos[4] = "<msg class='blackMsgClass'>Su operaci&oacute;n no se pudo completar. Intente nuevamente.</msg>";
	mensajesCompartamos[5] = "<msg class='blackMsgClass'>Su operaci&oacute;n no se pudo completar. Intente nuevamente.</msg>";
	mensajesCompartamos[6] = "<p class='redMsgClass'>Transacci&oacute;n rechazada.</p><p class='blackMsgClass'>Intente m&aacute;s tarde.</p>";
	mensajesCompartamos[7] = "<p class='redMsgClass'>Transacci&oacute;n rechazada.</p>";
	mensajesCompartamos[8] = "<p class='redMsgClass'>Transacci&oacute;n rechazada.</p><p class='blackMsgClass'>Genera e imprime Carta de Personas Bloquedas.</p>";
	mensajesCompartamos[9] = "<msg class='blackMsgClass'>Su operaci&oacute;n no se pudo completar. Intente nuevamente.</msg>";
	mensajesCompartamos[10] = "<msg class='redMsgClass'>Folio Inv&aacute;lido, </msg><msg class='blackMsgClass'>ingrese uno nuevo</msg>";
	mensajesCompartamos[99] = "<msg class='blackMsgClass'>Su operaci&oacute;n no se pudo completar. Intente nuevamente.</msg>";


//focus al campo de folio
$("input:text:visible:first").focus();
	

//establecemos el mensaje por default
$('#msnIdent').html("N&uacute;mero de identificaci&oacute;n *<br>Clave de elector");


//Catalogo de paises
	
	$(function() {
		$.getJSON("/CuentasN2/catalogos/paises", function(allData) {
			paises = $.map(allData, function(item) {
				$("#paisNacimiento").append(
						$('<option>', {
							value : item.clave,
							text : item.nombre
						}));
			
			});
		});
	});

//Opcion default de estados	
	$("#lugarNacimiento").append(
			$('<option>', {
				value : "",
				text : "--Seleccionar--"
			}));
	


//Obtenemos que tipo de nacionalidad fue seleccionada
	$(function() {
	$("#nacionalidad").change(function(){
		var valor=$("#nacionalidad").val();
			if(valor=='OTRA'){
//				document.getElementById('mensajeNac').style.display = 'block';
				$("#mensajeNac").toggle("slow");
				jQuery("#enviar").attr('disabled',true);
				$(".bloqueado").attr('disabled',true);
			}else{
				document.getElementById('mensajeNac').style.display = 'none';
				jQuery("#enviar").attr('disabled',false);
				$(".bloqueado").attr('disabled',false);
			}
		});
	});
	
	
	
	//Se cambia maxlength de numero de identificacion
	$("input[name=tipoIdentificacion]").click(function () {
		if($(this).val() == 'ZCVELE'){
			document.getElementById("numeroIdentificacion").maxLength = "18";
			$('#msnIdent').html("N&uacute;mero de identificaci&oacute;n *<br>Clave de elector");
		}else{
			document.getElementById("numeroIdentificacion").maxLength = "9";
			$('#msnIdent').html("N&uacute;mero de identificaci&oacute;n *<br>Pasaporte No.");
		}
	});

//Cerramos el mensaje de nacionalidad	
	$("#btMensaje").click( function(){
    	document.getElementById('mensajeNac').style.display = 'none';
    });	

	
//realiza la validaci?n del formulario	
	$("#formularioCompartamos").validate({
		onkeyup: false,
		rules: {
	    	folio: {
		       required: true,
		       number: true,
		       minlength: 5
		      },
	    	tipoIdentificacion: {
	        required: true
	          },
	        numeroIdentificacion: {
	          required: true,
	          identificacion: true
	        },
	        primerNombre: {
	           required: true,
	           maxlength: 40
	        },
	        segundoNombre: {
	           maxlength: 40
	        },
	        paterno: {
	            required: true,
		        maxlength: 40
	          },
	        materno: {
		        maxlength: 40
	          },
	        fechaNacimiento: {
	           required: true,
	           dateFormat: true,
	           dateRango:true
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
	         telefono: {
	             required: true,
	             number: true,
	             minlength: 10,
	             maxlength: 10
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
	             required: true,
	             maxlength: 60
	         },
	         numExterior: {
	             required: true,
	             maxlength: 10
	         },
	         numInterior: {
	             maxlength: 10
	         }
	    },
	    messages: {
	    	folio: {
		        required: "Por favor, proporciona el n&uacute;mero de folio",
		        number:"Por favor, proporciona s&oacute;lo n&uacute;meros"
		      		},	
		    tipoIdentificacion: {
		      	required: "Por favor elige el tipo de identificaci&oacute;n"
		      		},
		    numeroIdentificacion: {
		      	required: "Por favor, proporciona el n&uacute;mero de identificaci&oacute;n"
		      		},
      		primerNombre: {
		      	required: "Por favor, proporciona el primer nombre.",
		      	maxlength: "El primer nombre debe ir a 40 d&iacute;gitos"
		      		},
		    segundoNombre: {
		    	maxlength: "El segundo nombre debe ir a 40 d&iacute;gitos"
		    		},
		    paterno: {
		      		required: "Por favor, proporciona el apellido paterno.",
		      		maxlength: "El apellido paterno debe ir a 40 d&iacute;gitos"
		    		},
		    materno: {
		    		maxlength: "El apellido materno debe ir a 40 d&iacute;gitos"
		    		},
		    fechaNacimiento: {
		    		required: "Por favor, proporciona la fecha de nacimiento."
		    		},
	        nacionalidad: {
	            	required: "Por favor, elige una Nacionalidad"
	          		},
	        paisNacimiento: {
	              required: "Por favor, elige un Pa&iacute;s"
	         		},
	        lugarNacimiento: {
	              required: "Por favor, elige un lugar de nacimiento."
	         		},
	        genero: {
	        	  required: "Por favor, elige un g&eacute;nero"
	         		},
	        sms: {
	        	  required: "Por favor, elige si desean env&iacute;o de SMS."
	             },
	        telefono: {
	        	required: "Por favor, proporciona el N&uacute;mero de Tel&eacute;fono.",
	        	number: "Por favor, proporcione s&oacute;lo n&uacute;meros",
	        	minlength: "Por favor, captura el N&uacute;mero de Tel&eacute;fono a 10 d&iacute;gitos.",
	        	maxlength: "El n&uacute;mero de tel&eacute;fono debe ir a 10 d&iacute;gitos"
	             },
	        codigoPostal: {
	        	required: "Por favor, proporciona el C&oacute;digo Postal.",
	        	number: "Por favor, proporcione s&oacute;lo n&uacute;meros",
	        	minlength: "Por favor, captura el C&oacute;digo Postal a 5 d&iacute;gitos"
	        	},
	        estado: {
	        	required: "Por favor, elige un estado"
	             },
	        delegacion: {
	        	required: "Por favor, proporciona el nombre de Delegaci&oacuten/Municipio."
	             },
	        ciudad: {
	        	required: "Por favor, proporciona el nombre de la Ciudad."
	            },
	        colonia: {
	        	required: "Por favor, proporciona la colonia."
	            	},
        	calle: {
	        	required: "Por favor, proporciona el nombre de la calle.",
	        	maxlength: "El nombre de la calle debe ir a 60 d&iacute;gitos"
	            	},
	         numExterior: {
	        	 required: "Por favor, proporciona el N&uacute;mero Exterior",
	        	 number: "Por favor, proporcione s&oacutelo n&uacutemeros",
	        	 maxlength: "El n&uacutemero exterior debe ir a 10 d&iacute;gitos"
	         	},
	         numInterior: {
	        	 number: "Por favor, proporcione s&oacutelo n&uacute;meros",
	        	 maxlength: "El n&uacutemero interior debe ir a 10 d&iacute;gitos"
	         }
	    },
	    submitHandler: function() {	    	
	    	jsonObj = {};
	    	document.getElementById('bloquea').style.display = 'block';
	    	
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
            
            jsonObj.colonia = jsonObj.colonia.substring(0,40);
     	    	
            $.ajax({
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(jsonObj),
                //dataType: 'json',
                url: "./registro",
                success: function(datar){
                	//Timer
					restartTimer();
//                	 $('#localhost:8888').html(datar);
                	 document.getElementById('bloquea').style.display = 'none';
                     if(datar.codigo == '2' || datar.codigo == '3' || datar.codigo == '10'){
                     	document.getElementById('seccionCliente').style.display = 'none';//ocultamos el formulario
                     	document.getElementById('principalMensaje').style.display = 'block';//mostramos el mensaje recibido desde el servicio
                     }else if(datar.codigo == '0' || datar.codigo == '8'){
                     	document.getElementById('formCompartamos').style.display = 'none';//ocultamos el formulario
                     	document.getElementById('principalMensaje').style.display = 'block';//mostramos el mensaje recibido desde el servicio
                     	document.getElementById('botonImpr').style.display = 'block';//mostramos el boton de impresion y salir	
                     }else{
                     	document.getElementById('formCompartamos').style.display = 'none';//ocultamos el formulario
                     	document.getElementById('principalMensaje').style.display = 'block';//mostramos el mensaje recibido desde el servicio
                     	document.getElementById('botonSal').style.display = 'block';
                    }
                   
                   if(datar.codigo == '0'){
                	   if(datar.codigoServicios == '0')
                		   $('#mensajeRegistro').html(mensajesCompartamos[datar.codigo] + "<br> <p class='greenDigitalMsgClass'>" + datar.mensaje + "</p>");
                	   else if(datar.codigoServicios == '1')
                		   $('#mensajeRegistro').html(mensajesCompartamos[datar.codigo] + "<br> <p class='yellowDigitalMsgClass'>" + datar.mensaje + "</p>");
                	   else
                		   $('#mensajeRegistro').html(mensajesCompartamos[datar.codigo] + "<br> <p class='redDigitalMsgClass'>" + datar.mensaje + "</p>");
                   }else{
                	   $('#mensajeRegistro').html(mensajesCompartamos[datar.codigo]);
                   }
                   console.log(datar);
                },
                error: function(data){
                	//Timer
					restartTimer();
                	document.getElementById('bloquea').style.display = 'none';
                	document.getElementById('formCompartamos').style.display = 'none';//ocultamos el formulario
                 	document.getElementById('principalMensaje').style.display = 'block';//mostramos el mensaje recibido desde el servicio
                 	document.getElementById('botonSal').style.display = 'block';
                	$('#mensajeRegistro').html(mensajesCompartamos[99]);
                }
            });
	            return false; 
	    
	    }
	  });
	
	
//desabilita los radio buttons para saber que tipo de telefono proporcionan
	//$('input[name=tipoTelefono]').attr("disabled",true);
	
//Obtenemos si el cliente desea envi? de SMS
	$("input[name=sms]").click(function () {
		if($(this).val() == 'false'){
			$('input[name=tipoTelefono]').attr("disabled",false);
		}else{
			 $('input:radio[name="tipoTelefono"][value="celular"]').prop('checked', true);
			 $('input[name=tipoTelefono]').attr("disabled",true);
		}
    });	
  	

	//Funcion que enmascara el campo de fecha
	$(function($){
		$("#fechaNacimiento").mask("99/99/9999");
	});
	
	
	
//Autocompletar
	
	  (function( $ ) {
		    $.widget( "custom.combobox", {
		      _create: function() {
		        this.wrapper = $( "<span>" )
		          .addClass( "custom-combobox" )
		          .insertAfter( this.element );
		 
		        this.element.hide();
		        this._createAutocomplete();
		        this._createShowAllButton();
		      },
		 
		      _createAutocomplete: function() {
		        var selected = this.element.children( ":selected" ),
		          value = selected.val() ? selected.text() : "";
		        this.input = $( "<input>" )
		          .appendTo( this.wrapper )
		          .val( value )
		          .attr( "title", "" )
		          .addClass( "custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left texGris09_13 bloqueado" )
		          .autocomplete({
		            delay: 0,
		            minLength: 0,
		            source: $.proxy( this, "_source" )
		          })
		          .tooltip({
		            tooltipClass: "ui-state-highlight"
		          });
			    
		        this._on( this.input, {
		          autocompleteselect: function( event, ui ) {
		            ui.item.option.selected = true;
		            this._trigger( "select", event, {
		              item: ui.item.option
					  
		            });
		          },
		 
		          autocompletechange: "_removeIfInvalid"
		        });
		      },
		 
				 _createShowAllButton: function() {
		        var input = this.input,
		          wasOpen = false;
		        $( "<a>" )
		          .attr( "tabIndex", -1 )
		          .attr( "title", "Muestra todos los paises" )
		          .tooltip()
		          .appendTo( this.wrapper )
		          .button({
		            icons: {
		              primary: "ui-icon-triangle-1-s"
		            },
		            text: false
		          })
		          .removeClass( "ui-corner-all" )
		          .addClass( "custom-combobox-toggle ui-corner-right bloqueado" )
		          .mousedown(function() {
		            wasOpen = input.autocomplete( "widget" ).is( ":visible" );
		          })
		          .click(function() {
		            input.focus();
		 
		            // Close if already visible
		            if ( wasOpen ) {
		              return;
		            }
		 
		            // Pass empty string as value to search for, displaying all results
		            input.autocomplete( "search", "" );
		          });
		      },
		 
		 
		 
		      _source: function( request, response ) {
		        var matcher = new RegExp( $.ui.autocomplete.escapeRegex(request.term), "i" );
		        response( this.element.children( "option" ).map(function() {		
		          var text = $( this ).text();
		          if ( this.value && ( !request.term || matcher.test(text) ) )
				   
		            return {
		              label: text,
		              value: text,
		              option: this
		            };
		        }) );
		      },
		 
		      _removeIfInvalid: function( event, ui ) {
		 
		        // Selected an item, nothing to do
		        if ( ui.item ) {
		        $("#lugarNacimiento").empty();
				var valor=$("#paisNacimiento").val();
				$.getJSON("/CuentasN2/catalogos/estadosByClavePais/"+valor, function(allData) {
					//Timer
					restartTimer();
						estados = $.map(allData, function(item) {
							$("#lugarNacimiento").append(
									$('<option>', {
										value : item.clave,
										text : item.nombre
									}));
						
						});
					});
				
				
		          return;
		        }
		 
		        // Search for a match (case-insensitive)verificar
		        var value = this.input.val(),
		          valueLowerCase = value.toLowerCase(),
		          valid = false;
		        this.element.children( "option" ).each(function() {
		          if ( $( this ).text().toLowerCase() === valueLowerCase ) {
		            this.selected = valid = true;
		            $("#lugarNacimiento").empty();
		            var valor=$("#paisNacimiento").val();
		            $.getJSON("/CuentasN2/catalogos/estadosByClavePais/"+valor, function(allData) {
		            	//Timer
						restartTimer();
						estados = $.map(allData, function(item) {
							$("#lugarNacimiento").append(
									$('<option>', {
										value : item.clave,
										text : item.nombre
									}));
						
						});
					});
			        
		            return false;
		          }
		        });
		 
		        // Found a match, nothing to do
		        if ( valid ) {
		        	$("#lugarNacimiento").empty();
		        	var valor=$("#paisNacimiento").val();
		        	$.getJSON("/CuentasN2/catalogos/estadosByClavePais/"+valor, function(allData) {
		        		//Timer
						restartTimer();
						estados = $.map(allData, function(item) {
							$("#lugarNacimiento").append(
									$('<option>', {
										value : item.clave,
										text : item.nombre
									}));
						
						});
					});	
		          return;
		        }
		 
		        // Remove invalid value
		        this.input
		          .val( "" )
		          .attr( "title", value + " no coincide con ningún país" )
		          .tooltip( "open" );
		        $("#lugarNacimiento").empty();
		        this.element.val( "" );
		        estados = $.map(allData, function(item) {
				});
		        
		        this._delay(function() {
		          this.input.tooltip( "close" ).attr( "title", "" );
		        }, 2500 );
		        this.input.autocomplete( "instance" ).term = "";
		      },
		 
		      _destroy: function() {
		        this.wrapper.remove();
		        this.element.show();
		      }
		    });
		  })( jQuery );
		 
		  $(function() {
		    $( "#paisNacimiento" ).combobox();
		    $( "#toggle" ).click(function() {
		      $( "#combobox" ).toggle();
		    });
		  });	


		  
//solo numeros explorer8
	  
		  $("#folio, #telefono, #codigoPostal").keydown(function (e) {
//			  alert(e.keyCode);
				  if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110]) !== -1 ||
					  // Permite: Ctrl+A
					  (e.keyCode == 65 && e.ctrlKey === true) ||
					  // Permite: home, end, left, right
					  (e.keyCode >= 35 && e.keyCode <= 39) && e.keyCode !== 190 && e.keyCode !== 186 && e.keyCode !== 187) {
				  // solo permitir lo que no este dentro de estas condiciones es un return false
					  return;
				  }
				  // Aseguramos que son numeros
				  if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
					  e.preventDefault();
			  	}
		  });
		  
		  
//Funcion para obtener los datos dependiendo del codigo postal	
	$(function() {
		$("#codigoPostal").focusout(
			function() {
				if (this.value.length >= 5 && this.value > 1000) {
//              	$.getJSON("/FormularioProspectacion/getPostalCode.htm?cp=" + parseInt(this.value, 10), function(data) {//produccion
					$.getJSON("resources/codPostal.json", function(data) {//desarrollo
						
						//Timer
						restartTimer();
						
						$("#colonia").prop('disabled', false);
						if (data.status === "Ok") {
							var est = $('#estado option').filter(function () { return $(this).html() == data.result.state; }).val();
							$("#estado").val(est);
							$("#delegacion").val(data.result.province);
							$("#ciudad").val(data.result.city);
							$('#colonia').empty();
							$("#colonia option[value='#']").remove();
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
							$("#colonia").replaceWith('<input id="colonia" name="colonia" class="inputText  texGris09_13 mayusculas" type="text" maxlength="30"/>');
							$("#colonia option").remove();
							$("#colonia").val("");
//							$('#colonia').keyup(function(){	
//								$(this).val($(this).val().toUpperCase());
//							});		
							$('#colonia').keypress(function(e) {
								
								key = e.keyCode || e.which;
							       tecla = String.fromCharCode(key).toLowerCase();
							       letras = " abcdefghijklmnñopqrstuvwxyz";
							       especiales = ["8","13","9","32"];

							       tecla_especial = false;
							       for(var i in especiales){
							            if(key == especiales[i]){
							                tecla_especial = true;
							                break;
							            }
							        }

							        if(letras.indexOf(tecla)==-1 && !tecla_especial && (e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)){
							            return false;
							        }
							});
							
							$("#divMapa").css("display", "none");
						}
					});
			}
		});
	});
	
	
	
	$("#colonia").change(function(){
		if($('#colonia').val() == "###"){
			$("#colonia").replaceWith('<input id="colonia" name="colonia" class="inputText  texGris09_13 mayusculas" type="text" maxlength="30"/>');
			$("#colonia option").remove();
			$("#colonia").val("");
//			$('#colonia').keyup(function(){	
//				$(this).val($(this).val().toUpperCase());
//			});
			$('#colonia').keypress(function(e) {
				
				key = e.keyCode || e.which;
			       tecla = String.fromCharCode(key).toLowerCase();
			       letras = " abcdefghijklmnñopqrstuvwxyz";
			       especiales = ["8","13","9","32"];

			       tecla_especial = false;
			       for(var i in especiales){
			            if(key == especiales[i]){
			                tecla_especial = true;
			                break;
			            }
			        }

			        if(letras.indexOf(tecla)==-1 && !tecla_especial && (e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)){
			            return false;
			        }
			});
			$("#colonia").focus();		
		}
	});
	
	
	
//convierte en mayusculas
	
	
//	$('#numeroIdentificacion, #primerNombre, #segundoNombre, #paterno, #materno, #calle, #numExterior, #numInterior,#delegacion, #ciudad, #colonia').keypress(function(){	
//		$(this).val($(this).val().toUpperCase());
//	});
	
	
	//Solo letras
	$('#primerNombre,#segundoNombre, #paterno, #materno,#delegacion').keypress(function(e) {
		key = e.keyCode || e.which;
	       tecla = String.fromCharCode(key).toLowerCase();
	       letras = " abcdefghijklmnñopqrstuvwxyz";
	       especiales = ["8","13","32"];
	       
	       
	       tecla_especial = false;
	       for(var i in especiales){
	            if(key == especiales[i]){
	                tecla_especial = true;
	                break;
	            }
	        }
	       if(letras.indexOf(tecla)==-1 && !tecla_especial){
	            return false;
	        }
	});
	
	
	
	
	
//Numeros y letras
	
	$('#numeroIdentificacion, #calle, #numExterior,#colonia, #numInterior,#ciudad').keypress(function(e) {
		
		key = e.keyCode || e.which;
	       tecla = String.fromCharCode(key).toLowerCase();
	       letras = " abcdefghijklmnñopqrstuvwxyz";
	       especiales = ["8","13","9","32"];

	       tecla_especial = false;
	       for(var i in especiales){
	            if(key == especiales[i]){
	                tecla_especial = true;
	                break;
	            }
	        }

	        if(letras.indexOf(tecla)==-1 && !tecla_especial && (e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)){
	            return false;
	        }
	});

	
});


//Funcion para el logOut
	
		$(function() {
		$("#btSalir").click(
			function() {
				var origenReg = $('#origen').val();	
				window.location.href = "logout/"+origenReg;
				
		});
	});
		
		$(function() {
			$("#btCancelar").click(
				function() {
					var origenReg = $('#origen').val();	
					window.location.href = "logout/"+origenReg;
					
			});
		});
		
		
		$(function() {
			$("#btSalida").click(
				function() {
					var origenReg = $('#origen').val();	
					window.location.href = "logout/"+origenReg;
					
			});
		});
		

//Valida el formato correcto de la fecha
		
		$.validator.addMethod("dateFormat",
			    function(value, element) {
			        return value.match(/^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/);
			    },
			    "Por favor, capture una fecha v&aacute;lida.");


//Valida que la fecha de nacimiento sea menor que la actual
		
		
		$.validator.addMethod("dateRango",
			    function(value, element) {
					var fechaActual = new Date();
					var fecha=$("#fechaNacimiento").val();
					valuesStart = fecha.split("/");
					var anioNac = valuesStart[2];
					var mesNac = valuesStart[1]-1;
					var diaNac = valuesStart[0];
					var dateStart=new Date(valuesStart[2],(valuesStart[1]-1),valuesStart[0]);
					if(fechaActual<dateStart){
						$.validator.messages.dateRango = "Por favor, capture una fecha v&aacute;lida.";
						return false;
					}else{
					    if((fechaActual.getFullYear()-anioNac)>99){
							$.validator.messages.dateRango = "Por favor, el solicitante debe ser menor a 99 años.";
							return false;
						}else if((fechaActual.getFullYear()-anioNac)==99){
							if((fechaActual.getMonth()-mesNac>0)){
								$.validator.messages.dateRango = "Por favor, el solicitante debe ser menor a 99 años.";
								return false;
							}
							if((fechaActual.getMonth()-mesNac==0 && fechaActual.getDate()-diaNac >=0)){
								$.validator.messages.dateRango = "Por favor, el solicitante debe ser menor a 99 años.";
								return false;
							}
						}else if((fechaActual.getFullYear()-anioNac)<18){
							$.validator.messages.dateRango = "Por favor, el solicitante debe ser mayor a 18 años.";
							return false;		
						}else if((fechaActual.getFullYear()-anioNac)==18){
								if(fechaActual.getMonth()-mesNac <0){
									$.validator.messages.dateRango = "Por favor, el solicitante debe ser mayor a 18 años.";
									return false;							
								}else 
									if(fechaActual.getMonth()-mesNac ==0 && fechaActual.getDate()-diaNac <0){
									$.validator.messages.dateRango = "Por favor, el solicitante debe ser mayor a 18 años.";
								return false;
							}
						}
						
					} 
					return true;
			    });

		
		
		
//Valida el campo de numero de identificacion
		var patron;
        $.validator.addMethod("identificacion",
                   function(value, element) {
                                   if($('input:radio[name=tipoIdentificacion]:checked').val() == 'FS0002'){
                                          patron = /^[a-zA-Z0-9]{9}$/;
                                   }else{
                                	   patron = /^[a-zA-Z0-9]{6}[0-9]{2}[0-1]{1}[0-9]{1}[0-3]{1}[0-9]{1}(([0-3]{1}[0-9]{1})|87|88)[h-m|H-M]{1}[0-9]{3}$/;
                                   }
                                   
                      return value.match(patron,'');
               },
        "Por favor, proporciona el n&uacute;mero de identificaci&oacute;n correcto.");   
        
     
        
//Nos manda al PDF
		
		$(function() {
			$("#btImprimir").click(
				function() {
					window.open('comprobantepdf.htm?output=pdf','_blank');
					
				}
			);
		});
               