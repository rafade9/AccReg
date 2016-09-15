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
	
	
	$("#originacion").click(function () {
		window.location.href = "registroYastas";
	});
	
	$("#reposicion").click(function () {
		window.location.href = "reposicionYastas";
	});
	
			
});


//Funcion para el logOut

$(function() {
	$("#salir").click(
		function() {
			var origenReg = $('#origen').val();	
			window.location.href = "logout/"+origenReg;
			
	});
});