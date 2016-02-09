//19/01/2015
//js para validar loginCompartamos
//Mara Yazmin Vazquez Cruz

$(document).ready(function(){
	
$("#formularioCompartamos").validate({
	onkeyup: false,
    rules: {
      username: {
        required: true,
        lettersonly: true
      },
      password: {
        required: true,
        minlength: 5
      }
    },
    messages: {
      username: {
    	  required: "Por favor proporcione su usuario",
    	  lettersonly: "Por favor s�lo proporcione letras"
      },

      password: {
    	  required: "Por favor proporcione su password",
    	  minlength: "El password debe tener m�nimo 5 caracteres"
      }
    },
    submitHandler: function() {
      form.submit();
    }
  });

});
