//19/01/2015
//js para validar loginCompartamos
//Mara Yazmin Vazquez Cruz

$(document).ready(function(){
	
$("#formularioCompartamos").validate({
	onkeyup: false,
    rules: {
      username: {
        required: true
      },
      password: {
        required: true,
        minlength: 5
      }
    },
    messages: {
      username: {
    	  required: "Por favor proporcione su usuario"
      },

      password: {
    	  required: "Por favor proporcione su password",
    	  minlength: "El password debe tener m&iacutenimo 5 caracteres"
      }
    },
    submitHandler: function() {
      form.submit();
    }
  });


	//validacion explorer	 
	  
$("#username").keydown(function (e) {
	key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
	  if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110]) !== -1 ||
			  // Permite: Ctrl+A
			  (e.keyCode == 65  && e.ctrlKey === true) ||
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
