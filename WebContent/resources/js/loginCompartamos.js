//js para validar loginCompartamos

$(document).ready(function(){
	
$("#formularioCompartamos").validate({
    rules: {
      username: {
        required: true,
        lettersonly: true
      },
      password: {
        required: true,
        minlength: 5
      },
      folioTarjeta:{
    	required: true,
    	minlength: 15
      }
    },
    messages: {
      username: {
    	  required: "Por favor proporcione su usuario",
    	  lettersonly: "Por favor sólo proporcione letras"
      },

      password: {
    	  required: "Por favor proporcione su password",
    	  minlength: "El password debe tener mínimo 5 caracteres"
      },
      folioTarjeta: {
    	  required: "Por favor proporcione el folio",
    	  minlength: "El folio debe tener mínimo 15 caracteres"
      }
    },
    submitHandler: function() {
      form.submit();
    }
  });

});
