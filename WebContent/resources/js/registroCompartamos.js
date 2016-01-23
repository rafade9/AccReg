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
	

	
//Obtenemos que tipo de nacionalidad fue seleccionada	
	$("#nacionalidad").change(function(){
		var valor=$("#nacionalidad").val();
			if(valor=='Otro'){
//				document.getElementById('mensajeNac').style.display = 'block';
				$("#mensajeNac").toggle("slow");
				jQuery("#enviar").attr('disabled',true);
			}else{
				document.getElementById('mensajeNac').style.display = 'none';
				jQuery("#enviar").attr('disabled',false);
				
			}
	});

//Cerramos el mensaje de nacionalidad	
	$("#btMensaje").click( function(){
    	document.getElementById('mensajeNac').style.display = 'none';
    });	

	
//realiza la validación del formulario	
	$("#formularioCompartamos").validate({
	    rules: {
	    	folio: {
		       required: true,
		       number: true,
		       minlength: 15
		      },
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
	          fechaNacimiento: {
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
	         telefono: {
	             required: true,
	             number: true,
	             minlength: 10
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
	             required: true,
	             number: true
	         },
	         numInterior: {
	             number: true
	         }
	    },
	    messages: {
	    	folio: {
		        required: "Por favor proporcione el número de folio",
		        number:"Por favor proporciona sólo números",
		        minlength: "El folio debe ir a 15 digitos"
		        	
		      		},	
		    tipoIdentificacion: {
		      	required: "Por favor elige el tipo de identificación"
		      		},
		    numeroIdentificacion: {
		      	required: "Por favor proporcione el número de identificación",
		      	number: "Por favor proporciona sólo números"
		      		},
		    primerNombre: {
		      	required: "Por favor proporcione el Nombre"
		      		},
		    paterno: {
		      		required: "Por favor proporcione el Apellido"
		    		},
		    fechaNacimiento: {
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
	        telefono: {
	        	required: "Por favor proporcione el número de telefono",
	        	number: "Por favor proporcione sólo números",
	        	minlength: "El número de telefono debe ir a 10 digitos"
	          
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
	        	 required: "Por favor proporciona el numero Exterior",
	        	 number: "Por favor proporcione sólo números"
	         	},
	         numInterior: {
	        	 number: "Por favor proporcione sólo números"
	         }
	    },
	    submitHandler: function() {	    	
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
                    if(datar.codigo == '1' || datar.codigo == '2'){
                    	document.getElementById('seccionCliente').style.display = 'none';//ocultamos el formulario
                    	document.getElementById('principalMensaje').style.display = 'block';//mostramos el mensaje recibido desde el servicio
                    	$('#mensajeRegistro').html(datar.mensaje);
                    	console.log("Bien");
                    }else{
                    	document.getElementById('formCompartamos').style.display = 'none';//ocultamos el formulario
                    	document.getElementById('principalMensaje').style.display = 'block';//mostramos el mensaje recibido desde el servicio
                    	$('#mensajeRegistro').html(datar.mensaje);
                    	
                    }
                }
            });
	            return false; 
	    
	    }
	  });
	
	
//desabilita los radio buttons para saber que tipo de telefono proporcionan
	$('input[name=tipoTelefono]').attr("disabled",true);
	
//Obtenemos si el cliente desea envió de SMS
	$("input[name=sms]").click(function () {
		if($(this).val() == 'false'){
			$('input[name=tipoTelefono]').attr("disabled",false);
		}else{
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
		          .addClass( "custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left" )
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
		          .addClass( "custom-combobox-toggle ui-corner-right" )
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
				var valor=$("#paisNacimiento").val();
				var htmlEstados = "";
				$.getJSON("/CuentasN2/catalogos/estadosByClavePais/"+valor, function(allData) {
						estados = $.map(allData, function(item) {
							htmlEstados += "<option value=" + item.clave + ">" + item.nombre + "</option>";
						});
				})
				.done(function() {
					document.getElementById("lugarNacimiento").innerHTML = htmlEstados;
			  	});
				
				
		          return;
		        }
		 
		        // Search for a match (case-insensitive)
		        var value = this.input.val(),
		          valueLowerCase = value.toLowerCase(),
		          valid = false;
		        this.element.children( "option" ).each(function() {
		          if ( $( this ).text().toLowerCase() === valueLowerCase ) {
		            this.selected = valid = true;
		            var valor=$("#paisNacimiento").val();
		            alert("case sentive"+valor);
			        var htmlEstados = "";
					$.getJSON("/CuentasN2/catalogos/estadosByClavePais/"+valor, function(allData) {
							estados = $.map(allData, function(item) {
								htmlEstados += "<option value=" + item.clave + ">" + item.nombre + "</option>";
							});
					});
			        
		            return false;
		          }
		        });
		 
		        // Found a match, nothing to do
		        if ( valid ) {
		        	var valor=$("#paisNacimiento").val();
		            alert(valor);	
		          return;
		        }
		 
		        // Remove invalid value
		        this.input
		          .val( "" )
		          .attr( "title", value + " no coincide con ningún pais" )
		          .tooltip( "open" );
		        this.element.val( "" );
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
	

//Funcion para el logOut
	
		$(function() {
		$("#btSalir").click(
			function() {
				var origenReg = $('#origen').val();	
				window.location.href = "logout/"+origenReg;
				
		});
	});
	

