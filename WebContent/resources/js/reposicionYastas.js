//Js para el JSP registroCompartamos
//Fecha 06/05/2016
//Mara Vazquez

$(document).ready(function(){
	
	varTimer = setTimeout(logoutFtn, 300000);
	  
	function logoutFtn(){
		window.location.href = "logout/yastas";
	}
	
	function restartTimer(){
		clearTimeout(varTimer);
		varTimer = setTimeout(logoutFtn, 300000);
	}
	
	//Mensajes de respuesta
	var mensajesRepo = [];
	mensajesRepo[1] = "<p class='greenMsgClass'>Reposici&oacute;n Exitosa.</p><p class='blackMsgClass'>Ahora realiza el cobro de la comisi&oacute;n en tu TPV.</p><br>";
	mensajesRepo[2] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia inexistente,</p><p class='blackMsgClass'> indica al cliente que se debe comunicar a call center para validar su No. de Referencia</p>";
	mensajesRepo[3] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia no vigente </p><p class='blackMsgClass'>indica al cliente que su referencia esta vencida y que se comunique a call center para generar una nueva</p>";
	mensajesRepo[4] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Fecha de Nacimiento Incorrecta, </p><p class='blackMsgClass'>valida nuevamente la fecha de nacimiento</p>";
	mensajesRepo[5] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Referencia Bloqueada, </p><p class='blackMsgClass'>indica al cliente que la referencia fue bloqueada por exceder el No. de intentos, debe comunicarse a call center para generar una nueva.</p>";
	mensajesRepo[6] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Folio inv&aacute;lido. Ingrese uno nuevo</p>";
	mensajesRepo[7] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Su operaci&oacute;n no se pudo completar.</p><p class='blackMsgClass'> Intente nuevamente</p>";
	mensajesRepo[8] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Su operaci&oacute;n no se pudo completar.</p>";
	mensajesRepo[99] = "<p class='redMsgClass'>Error</p><p class='blackMsgClass'>Su operaci&oacute;n no se pudo completar. Intente nuevamente.</p>";

	
		
	jQuery.validator.setDefaults({
        errorPlacement: function(error, element) {
        error.appendTo('#errorcontainer-' + element.attr('id'));
   }
   });
	
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
	    		minlength: 18,
	    		validaReferencia:true
	          },
	        referenciaConf: {
	          required: true,
	          minlength: 18,
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
     	    	
            $.ajax({
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(Persona),
                //dataType: 'json',
                url: "./generaReposicion",
                success: function(data){
                	console.log(data);
                	if(data.codigo == 1){//caso exitoso
                		$('#seccionOk').css('display','block');
                		$('#seccionFecha').css('display','none');
                		$('#seccionFolio').css('display','none');
                		$('#seccionTitulo').css('display','none');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','none');
                		$('#seccionSalir').css('display','block');
                		
                		$('#seccionOk').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 2){//Referencia inexistente
                		$('#seccionFecha').css('display','none');
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionReferencia').css('display','block');
                		$('#seccionBotones').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 3){//Referencia no vigente
                		$('#seccionFecha').css('display','none');
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','none');
                		$('#seccionSalir').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 4){//Fecha incorrecta
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionFecha').css('display','block');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 5){//Referencia bloqueada 3 intentos
                		$('#seccionFolio').css('display','none');
                		$('#seccionError').css('display','block');
                		$('#seccionFecha').css('display','none');
                		$('#seccionReferencia').css('display','none');
                		$('#seccionBotones').css('display','none');
                		$('#seccionSalir').css('display','block');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else if(data.codigo == 6){//Folio no existe, folio ya fue asignado
                		$('#seccionFolio').css('display','block');
                		$('#seccionError').css('display','block');
                		$('#seccionFecha').css('display','none');
                		$('#seccionReferencia').css('display','none');
                		
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                	}
                	else{//mensaje generico
                		$('#seccionError').css('display','block');
                		$('#butonDetalle').css('display','block');
                		$('#seccionError').html(mensajesRepo[data.codigo]);
                		$('#detalle').append(data.mensaje);
                	}
                },
                error: function(data){
                	
                }
            });
	            return false;  
	    }
	  });
	
//solo numeros
	  
	  $("#folio, #referencia, #referenciaConf").keydown(function (e) {
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
					var referencia=$("#referencia").val();
					var validacion = referencia.substring(4,14);
 
						if(parseInt(validacion.substring(0,2)) > 0 && parseInt(validacion.substring(0,2)) < 12){
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

					return true;
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


