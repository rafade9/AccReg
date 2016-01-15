/* cuentasN2.js */

$(document).ready(function(){

$('#txNumOper').keyup(function (){
            this.value = (this.value + '').replace(/[^0-9]/g, '');
 });
 
 $('#txFolio').keyup(function (){
            this.value = (this.value + '').replace(/[^0-9]/g, '');
 });
 
});