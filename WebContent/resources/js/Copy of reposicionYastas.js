  var onlyNumber = false;
//solo numeros
  if(onlyNumber){
	  console.log("onynumber ", onlyNumber);

  }
  
	//funcion que cambia el maxleght segun el radio eliga validacion de ife(18 digitos) o pasaportes(9 digitos)
	function radioAsignacion(){
		 $("#referencia").attr('maxlength','18');
		 $("#referencia").attr("placeholder", "Reposicion...");
		 
		 $("#referenciaConf").attr('maxlength','18');
		 $("#referenciaConf").attr("placeholder", "Reposicion...");
//		 $("#referencia").pattern = "[a-zA-Z0-9]{5,18}";
		 
		 $( "#tituloHeader" ).html( "Reposición" );
		 //add class inputText 
		 onlyNumber=true;
		  $("#referencia, #referenciaConf").keydown(function (e) {
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
	}
	//maximo length sera 9
	function radioReposicion(){
		onlyNumber=false;
		 $("#referenciaConf").attr('maxlength','10');
		 $("#referenciaConf").attr("placeholder", "Referencia No...");
//		 $("#referenciaConf").pattern = "[a-zA-Z0-9]{8,10}";
		 $( "#tituloHeader" ).html( "Asignación" );
		 
		 $("#referencia").attr('maxlength','10');
		 $("#referencia").attr("placeholder", "Referencia No...");
//		 $("#referencia").pattern = "[a-zA-Z0-9]{8,10}";
		 
		 $("#referencia, #referenciaConf").off("keydown", null);
	}

	
	$(document).ready(function(){
//funcion de validacion para radio asignacion y reposicion
			var mensajeIdentificacion = "Por favor, proporciona el numero de Referencia correcto.";
	        $.validator.addMethod("validaReferencia",
	                   function(value, element) {
	        	var patron = "";
	                                   if($("#reposicion")[0].checked){
//	                                	   $("#referencia").pattern = "[a-zA-Z0-9]{8,10}";
//	                                	   $("#referenciaConf").pattern = "[a-zA-Z0-9]{8,10}";
//	                                	   	patron = "[a-zA-Z0-9]{8,10}";
//	                                	   mensajeIdentificacion = "Por favor, proporciona el numero de Asignacion correcto.";
//	                                	   if(value.match(patron,'')){return true;}else{return false;}
	                                   }else{
	                                	   $("#referenciaConf").attr('maxlength','18');
//	                                	   $("#referencia").pattern = "[a-zA-Z0-9]{5,18}";
	                                	   var referencia=$("#referencia").val();
		                   					var validacion = referencia.substring(4,14);
		                    
		                   						if(parseInt(validacion.substring(0,2)) > 0 && parseInt(validacion.substring(0,2)) <= 12){
		                   							if(parseInt(validacion.substring(0,2)) == 4 || parseInt(validacion.substring(0,2)) == 6 || parseInt(validacion.substring(0,2)) == 9 || parseInt(validacion.substring(0,2)) == 11){
		                   								if(parseInt(validacion.substring(2,4)) <= 30){
		                   									if(parseInt(validacion.substring(4,6)) <= 23 ){
		                   										if(parseInt(validacion.substring(6,8)) > 59 ){
		                   											$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   											return false;
		                   										}
		                   									}else{
		                   										$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   										return false;
		                   									}
		                   								}else{
		                   									$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   									return false;
		                   								}
		                   							}else if(parseInt(validacion.substring(0,2)) == 2){//febrero
		                   								if(parseInt(validacion.substring(2,4)) <= 28){//dia
		                   									if(parseInt(validacion.substring(4,6)) <=23 ){//hora
		                   										if(parseInt(validacion.substring(6,8)) > 59 ){//minutos
		                   											$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   											return false;
		                   										}
		                   									}else{
		                   										$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   										return false;
		                   									}
		                   								}else{
		                   									$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   									return false;
		                   								}
		                   									
		                   							}else{
		                   								if(parseInt(validacion.substring(2,4)) <= 31){//dia
		                   									if(parseInt(validacion.substring(4,6)) <=23 ){//hora
		                   										if(parseInt(validacion.substring(6,8)) > 59 ){//minutos
		                   											$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   											return false;
		                   										}
		                   									}else{
		                   										$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   										return false;
		                   									}
		                   								}else{
		                   									$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   									return false;
		                   								}
		                   							}
		                   							
		                   						}else{
		                   							$.validator.messages.validaReferencia = "La referencia es incorrecta.";
		                   							return false;
		                   						}

		                   					
	                                	   
	                                	   
	                                   }
	                     
	               },
	        mensajeIdentificacion);
	        
//Js para el JSP registroCompartamos
//Fecha 06/05/2016
//Mara Vazquez


	
	varTimer = setTimeout(logoutFtn, 300000);
	  
	function logoutFtn(){
		window.location.href = "logout/yastas";
	}
	
	function restartTimer(){
		clearTimeout(varTimer);
		varTimer = setTimeout(logoutFtn, 300000);
	}
	
	//Mensajes de respuesta
	//Ahora realiza el cobro de apertura.
	var mensajesRepo = [];
	mensajesRepo[0] = "<p class='greenMsgClass'>Reposici&oacute;n Exitosa.</p><p class='blackMsgClass'>Ahora realiza el cobro de la comisi&oacute;n en tu TPV.</p><br>";
	mensajesRepo[100] = "<p class='greenMsgClass'>Asignaci&oacute;n Exitosa.</p><p class='blackMsgClass'> </p><br>";
	mensajesRepo[102] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia inexistente,</p><p class='blackMsgClass'> indica al cliente que se debe comunicar a call center para validar su No. de Referencia y/o Fecha de Nacimiento</p>";
	mensajesRepo[103] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia no vigente </p><p class='blackMsgClass'>indica al cliente que su referencia esta vencida y/o Fecha de Nacimiento. Y que se comunique a call center para generar una nueva</p>";
	mensajesRepo[120] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia no vigente </p><p class='blackMsgClass'>indica al cliente que su referencia esta vencida y que se comunique a call center para generar una nueva</p>";
	mensajesRepo[104] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Fecha de Nacimiento Incorrecta, </p><p class='blackMsgClass'>valida nuevamente la fecha de nacimiento</p>";
	mensajesRepo[105] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia Bloqueada, </p><p class='blackMsgClass'>indica al cliente que la referencia fue bloqueada por exceder el No. de intentos, debe comunicarse a call center para generar una nueva.</p>";
	mensajesRepo[3] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Folio inv&aacute;lido. Ingrese uno nuevo</p>";
	mensajesRepo[10] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Folio inv&aacute;lido. Ingrese uno nuevo</p>";
	mensajesRepo[1] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Su operaci&oacute;n no se pudo completar.</p>";
	mensajesRepo[99] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Su operaci&oacute;n no se pudo completar. Intente nuevamente.</p>";

	
		
	jQuery.validator.setDefaults({
        errorPlacement: function(error, element) {
        error.appendTo('#errorcontainer-' + element.attr('id'));
   }
   });
	
	var checks = 1;
	
	$("#formulario").validate({
		onkeyup: false,
		rules: {
	    	folio: {
		       required: true,
		       number: true,
		       minlength: 5
		      },
	    	referencia: {
	    		required: true,
	    		validaReferencia:true
	          },
	        referenciaConf: {
	          required: true,
	          confirmaReferencia: true
	        },
	        fechaNacimiento: {
	           required: true,
	           dateFormat: true,
	           dateRango:true
	         }
	    },
	    messages: {
	    	folio: {
		        required: "Proporcione el n&uacute;mero de folio",
		        number:"Proporciona s&oacute;lo n&uacute;meros"
		      		},	
		    referencia: {
		      	required: "Proporcione la referencia ."
		      		},
		    referenciaConf: {
		      	required: "Confirme la referencia ."
		      		},
		    fechaNacimiento: {
		    		required: "Proporcione la fecha de nacimiento."
		     }
	    },
	    submitHandler: function() {
	    	
	    	Persona = {};
	    	Persona['folio'] =  $("#folio").val();
	    	Persona['referencia'] =  $("#referencia").val();
	    	Persona['fechaNacimiento'] =  $("#fechaNacimiento").val();
	    	Persona['tipoReferencia'] = $('input:radio[name=tipoReferencia]:checked').val();
	    	if(checks==3){
	    		Persona['sms'] =  true;	
	    		checks++;
	    	}else{
	    		Persona['sms'] =  false;
	    		checks++;
	    	}
	    	
	    	
	    	
     	    	
            $.ajax({
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(Persona),
                //dataType: 'json',
                url: "./generaReposicion",
                success: function(data){
                	console.log("Error", data.codigo);
                	restartTimer();
                	if(data.codigo == 0){//caso exitoso
                		$('#seccionOk').css('display','block');
                		$('#seccionFecha').css('display','none');
                		$('#seccionFolio').css('display','none');
                		$('#seccionTitulo').css('display','none');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','none');
                		$('#seccionSalir').css('display','block');
                		$('#seccionError').css('display','none');
                		
                		if($('#reposicion').is(':checked')){//si el radio de asignacion esta activado, y es exitoso, se envia el mensaje 100, si no el 0
                			$('#seccionOk').html(mensajesRepo[100]);
                		}else{
                			$('#seccionOk').html(mensajesRepo[data.codigo]);
                		}
                		
                	}
                	else if(data.codigo == 102){//Referencia inexistente
                		console.log("Entra aqui");
                		$('#seccionFecha').css('display','block');
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionReferencia').css('display','block');
                		$('#seccionBotones').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 103 || data.codigo == 120){//Referencia no vigente
                		$('#seccionFecha').css('display','block');
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','none');
                		$('#seccionSalir').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 104){//Fecha incorrecta
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionFecha').css('display','block');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 105){//Referencia bloqueada 3 intentos
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionFecha').css('display','none');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','none');
                		$('#seccionSalir').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 3 || data.codigo == 10){//Folio no existe, folio ya fue asignado
                		$('#seccionFolio').css('display','block');
                		$('#seccionError').css('display','block');
                		$('#seccionFecha').css('display','none');
                		$('#seccionReferencia').css('display','none');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else{//mensaje generico
                		$('#seccionError').css('display','block');
                		$('#butonDetalle').css('display','block');
                		$('#seccionError').html(mensajesRepo[99]);
                		$('#detalle').append(data.mensaje);
                	}
                },
                error: function(data){
                	restartTimer();
                }
            });
	            return false;  
	    }
	  });
	
//solo numeros
	  
	  $("#folio").keydown(function (e) {
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
	
	  
	
	  

	//Funcion que enmascara el campo de fecha
		$(function($){
			$("#fechaNacimiento").mask("99/99/9999");
		});
		
		

//Valida el formato correcto de la fecha
		
		$.validator.addMethod("dateFormat",
			    function(value, element) {
			        return value.match(/^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/);
			    },
			    "Capture una fecha v&aacute;lida.");


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
						$.validator.messages.dateRango = "Capture una fecha v&aacute;lida.";
						return false;
					}else{
					    if((fechaActual.getFullYear()-anioNac)>99){
							$.validator.messages.dateRango = "El solicitante debe ser menor a 99 años.";
							return false;
						}else if((fechaActual.getFullYear()-anioNac)==99){
							if((fechaActual.getMonth()-mesNac>0)){
								$.validator.messages.dateRango = "El solicitante debe ser menor a 99 años.";
								return false;
							}
							if((fechaActual.getMonth()-mesNac==0 && fechaActual.getDate()-diaNac >=0)){
								$.validator.messages.dateRango = "El solicitante debe ser menor a 99 años.";
								return false;
							}
						}else if((fechaActual.getFullYear()-anioNac)<18){
							$.validator.messages.dateRango = "El solicitante debe ser mayor a 18 años.";
							return false;		
						}else if((fechaActual.getFullYear()-anioNac)==18){
								if(fechaActual.getMonth()-mesNac <0){
									$.validator.messages.dateRango = "El solicitante debe ser mayor a 18 años.";
									return false;							
								}else 
									if(fechaActual.getMonth()-mesNac ==0 && fechaActual.getDate()-diaNac <0){
									$.validator.messages.dateRango = "El solicitante debe ser mayor a 18 años.";
								return false;
							}
						}
						
					} 
					return true;
			    });


		
//validacion de referencia
		
		$.validator.addMethod("confirmaReferencia",
				function(value, element) {
				var referencia=$("#referencia").val();
				var referenciaConf=$("#referenciaConf").val();
				
					if(referencia != referenciaConf && referencia != ""){
						$.validator.messages.confirmaReferencia = "Las referencias no coinciden.";
						return false;
					}
				return true;
		});
		
//validacion estructura de referencia
		
		$.validator.addMethod("validaReferencia",
				function(value, element) {
				});
		
});


//botones Salir

$(function() {
	$("#salir").click(
		function() {
			var origenReg = $('#origen').val();	
			window.location.href = "logout/"+origenReg;
			
	});
});


$(function() {
	$("#cancelar").click(
		function() {
			var origenReg = $('#origen').val();	
			window.location.href = "logout/"+origenReg;
			
	});
});


//Muestra detalle

$(function() {
	$("#btnDetalle").click(
		function() {
			if (detalle.style.display == "none") {
					$('#detalle').css('display','block');
			}else{
				$('#detalle').css('display','none');
			}
	});
});


