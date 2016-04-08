package com.gentera.cuentasn.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Random;
import java.util.TimeZone;

import com.gentera.cuentasn.entities.Persona;

public class Util {
	
	public static String convertToString(Date value){
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setTime(value);
		if (!calendar.isSet(Calendar.ZONE_OFFSET)){
            calendar.setTimeZone(TimeZone.getDefault());
        }
        StringBuffer dateString = new StringBuffer(16);
        appendDate(dateString, calendar);
//        appendTimeZone(calendar, dateString);
        return dateString.toString();
	}
	
	public static String convertToString(Calendar value){
		if (value.get(Calendar.ZONE_OFFSET) == -1){
            value.setTimeZone(TimeZone.getDefault());
        }
        StringBuffer dateString = new StringBuffer(28);
        appendDate(dateString, value);
        dateString.append("T");
        //adding hours
        appendTime(value, dateString);
//        appendTimeZone(value, dateString);
        dateString.append("0000Z");
        return dateString.toString();
	}
	
	public static void appendDate(StringBuffer dateString, Calendar calendar) {

        int year = calendar.get(Calendar.YEAR);

        if (year < 1000){
            dateString.append("0");
        }
        if (year < 100){
            dateString.append("0");
        }
        if (year < 10) {
            dateString.append("0");
        }
        dateString.append(year).append("-");

        // xml date month is started from 1 and calendar month is
        // started from 0. so have to add one
        int month = calendar.get(Calendar.MONTH) + 1;
        if (month < 10){
            dateString.append("0");
        }
        dateString.append(month).append("-");
        if (calendar.get(Calendar.DAY_OF_MONTH) < 10){
            dateString.append("0");
        }
        dateString.append(calendar.get(Calendar.DAY_OF_MONTH));
    }
	
	public static void appendTime(Calendar value, StringBuffer dateString) {
        if (value.get(Calendar.HOUR_OF_DAY) < 10) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.HOUR_OF_DAY)).append(":");
        if (value.get(Calendar.MINUTE) < 10) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.MINUTE)).append(":");
        if (value.get(Calendar.SECOND) < 10) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.SECOND)).append(".");
        if (value.get(Calendar.MILLISECOND) < 10) {
            dateString.append("0");
        }
        if (value.get(Calendar.MILLISECOND) < 100) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.MILLISECOND));
    }
	
	public static void appendTimeZone(Calendar calendar, StringBuffer dateString) {
        int timezoneOffSet = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);
        int timezoneOffSetInMinits = timezoneOffSet / 60000;
        if (timezoneOffSetInMinits < 0){
            dateString.append("-");
            timezoneOffSetInMinits = timezoneOffSetInMinits * -1;
        } else {
            dateString.append("+");
        }
        int hours = timezoneOffSetInMinits / 60;
        int minits = timezoneOffSetInMinits % 60;

        if (hours < 10) {
            dateString.append("0");
        }
        dateString.append(hours).append(":");

        if (minits < 10){
            dateString.append("0");
        }

        dateString.append(minits);
    }


	/**
	 * Metodo para obtener el nombre proporcionado por el cliente para el pdf de listas bloqueadas
	 * @param persona
	 * @return
	 */
	public static String obtenerNombreC(Persona persona){
		String nombreCompleto = "";
		
		nombreCompleto = persona.getPrimerNombre();
		
		if(persona.getSegundoNombre()!=null)
			nombreCompleto += " " +persona.getSegundoNombre();
		nombreCompleto += " " +persona.getPaterno();
		if(persona.getMaterno()!=null)
			nombreCompleto += " " +persona.getMaterno();
		
		return nombreCompleto.toUpperCase();
	}
	
	
	
	/**
	 * Método para obtener a fecha del comprobante de apertura de cuentaN2
	 * @return
	 */
	public static String getDateTime() {

	    String time = "";
	    String hora = "";
	    String minutos = "";
	    String segundos = "";
	    String diaC = "";
	    String mesC = "";
	    
	    Calendar cal = Calendar.getInstance();
	    
	    Integer dia = cal.get(Calendar.DAY_OF_MONTH);
	    Integer mes = cal.get(Calendar.MONTH)+1;
	    Integer anio = cal.get(Calendar.YEAR);
	    
	    if(dia<=9)
			diaC = "0"+ dia.toString();
		else
			diaC = dia.toString();
		if(mes<=9)
			mesC = "0"+ mes.toString();
		else
			 mesC = mes.toString();
		
	    if(cal.get(Calendar.HOUR)<=9 && cal.get(Calendar.HOUR)>0)
	    	hora = "0"+cal.get(Calendar.HOUR);
	    
	    else if(cal.get(Calendar.HOUR)==0)
	    	hora = "12";
	    else
	    	hora = String.valueOf(cal.get(Calendar.HOUR));
	    if(cal.get(Calendar.MINUTE)<=9)
	    	minutos = "0"+ cal.get(Calendar.MINUTE);
	    else
	    	minutos = String.valueOf(cal.get(Calendar.MINUTE));
	    if(cal.get(Calendar.SECOND)<=9)
	    	segundos = "0" + cal.get(Calendar.SECOND);
	    else
	    	segundos = String.valueOf(cal.get(Calendar.SECOND));
	    time = diaC + "/" + mesC +"/" +anio.toString() + " Hora: "+ hora  + ":" + minutos + ":" +segundos;

	    if(cal.get(Calendar.AM_PM)==0)
	        time=time+" AM";
	    else
	        time=time+" PM";

	    return time;

	}
	
	/**
	 * Metodo para obtener la fecha en el formato del PDF listas bloqueadas
	 * @return
	 */
	public static String generaFecha(){

		Calendar calendario = new GregorianCalendar();
		HashMap<Integer,String> meses = new HashMap<Integer,String>();

		Integer dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH);
		int anio = calendario.get(Calendar.YEAR);

		String diaC = "";

		if(dia<=9)
			diaC = "0"+ dia.toString();
		else
			diaC = dia.toString();

		meses.put(1, "Enero");
		meses.put(2, "Febrero");
		meses.put(3, "Marzo");
		meses.put(4, "Abril");
		meses.put(5, "Mayo");
		meses.put(6, "Junio");
		meses.put(7, "Julio");
		meses.put(8, "Agosto");
		meses.put(9, "Septiembre");
		meses.put(10, "Octubre");
		meses.put(11, "Noviembre");
		meses.put(12, "Diciembre");

		String fecha = diaC+ " de "  +meses.get(mes+1)+ " de " +anio;
		return fecha;

	}
	
/**
 * Metodo para enmascarar	
 * @param numTarjeta
 * @return
 */
	public static String enmascaraTarj(String numTarjeta){
		String tarjeta = "";
		if(numTarjeta.length()>5){
			for(int i=0; i<numTarjeta.length()-4;i++){
				tarjeta = tarjeta + "*";
			}
			tarjeta = tarjeta + numTarjeta.substring(numTarjeta.length()-4, numTarjeta.length());
		}
		return tarjeta;
	}

/**
 * Metodo que valida si una cadena contiene solo numeros
 * @param cadena
 * @return
 */
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public static String formatNumEmpleado(String numEmpleado){
		StringBuffer numEmpleadoFormateado = new StringBuffer();
		numEmpleadoFormateado.append("E");
		
		int totalLenght = 9;
		int longNumEmpleado = numEmpleado.length();
		int zeros = totalLenght-longNumEmpleado;
		
		for(int i = 0; i < zeros; i++){
			numEmpleadoFormateado.append("0");
		}
		
		numEmpleadoFormateado.append(numEmpleado);
		
		return numEmpleadoFormateado.toString();
	}
	
	public static String generaClaveError(){
		StringBuffer clave = new StringBuffer();
		clave.append("Err-");
		
		Date hoy = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyMMddmmss");
		clave.append(ft.format(hoy));
		
		Random r = new Random();
		
		clave.append(r.nextInt(9));
		
		return clave.toString();
	}
	
}
