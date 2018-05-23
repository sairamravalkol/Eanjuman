package com.newbie.eanjuman.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Timestamp setDateAndTime(String  date) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date parsedDate = dateFormat.parse(date);
		Timestamp time = new Timestamp(parsedDate.getTime());
		return time;
		
	}
	public static Timestamp getCurrentDate() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp;
		
	}

}
