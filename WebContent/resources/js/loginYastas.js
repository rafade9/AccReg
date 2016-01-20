//js para validar loginYastas
//20/01/2015
//Mara Yazmin Vazquez Cruz


$(document).ready(function(){
	
$("#formularioYastas").validate({
    rules: {
      idUsuario: {
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
      idUsuario: {
    	  required: "Por favor proporcione su ID de Operador"
      },
      folioTarjeta: {
    	  required: "Por favor proporcione el folio",
    	  number: "Por favor solo proporciona números",
    	  minlength: "El folio debe tener mínimo 15 caracteres"
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
