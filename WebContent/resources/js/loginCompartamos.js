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
        minlength: 8
      }
    },
    messages: {
      username: {
    	  required: "Por favor proporcione su usuario"
      },

      password: {
    	  required: "Por favor proporcione su password",
    	  minlength: "El password debe tener m&iacute;nimo 8 caracteres"
      }
    },
    submitHandler: function() {
      form.submit();
    }
  });


//Numeros y letras

$('#username').keypress(function(e) {
	
	key = e.keyCode || e.which;
       tecla = String.fromCharCode(key).toLowerCase();
       letras = " abcdefghijklmnñopqrstuvwxyz";
       especiales = "8-9-37-39-46";

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

	

$('#username').keypress(function (){
    this.value = this.value.replace(/[^A-Za-z0-9]/g, '');
  });

});

