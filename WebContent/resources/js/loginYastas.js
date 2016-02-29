//js para validar loginYastas
//20/01/2015
//Mara Yazmin Vazquez Cruz


$(document).ready(function(){
	
$("#formularioYastas").validate({
    rules: {
     username: {
        required: true
      },
      folioTarjeta:{
    	required: true,
    	number: true,
    	minlength: 15
      },
      captcha:{
      	required: true
        }
    },
    messages: {
      username: {
    	  required: "Por favor proporcione su ID de Operador"
      },
      folioTarjeta: {
    	  required: "Por favor proporcione el folio",
    	  number: "Por favor solo proporciona n&uacute;meros",
    	  minlength: "El folio debe tener m&iacute;nimo 15 caracteres"
      },
      captcha:{
        	required: "Por favor proporone la secuencia"
          }
    },
    submitHandler: function() {
      form.submit();
    }
  });


//validar caracteres extraños

$("input").keydown(function (e) {
	key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
	  if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110]) !== -1 ||
			  // Permite: Ctrl+A
			  (e.keyCode == 65 && e.ctrlKey === true) ||
			  // Permite: home, end, left, right
			  (e.keyCode >= 35 && e.keyCode <= 39 && e.keyCode !== 173 && e.keyCode !== 190 )) {
		  // solo permitir lo que no este dentro de estas condiciones es un return false
		  return;
	  }
	  // Aseguramos que son numeros
	  if (letras.indexOf(tecla)==-1 && (e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
		  e.preventDefault();
	  }
});	
	


});
