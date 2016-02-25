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


//validar caracteres extraños

	$('#username').bind('input', function() {
	  var c = this.selectionStart,
	      r = /[^a-z0-9]/gi,
	      v = $(this).val();
	  if(r.test(v)) {
	    $(this).val(v.replace(r, ''));
	    c--;
	  }
	  this.setSelectionRange(c, c);
	});


});
