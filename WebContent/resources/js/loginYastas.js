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
    	  number: "Por favor solo proporciona n�meros",
    	  minlength: "El folio debe tener m�nimo 15 caracteres"
      },
      captcha:{
        	required: "Por favor proporone la secuencia"
          }
    },
    submitHandler: function() {
      form.submit();
    }
  });

});
