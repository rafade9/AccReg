package com.gentera.cuentasn.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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

}
