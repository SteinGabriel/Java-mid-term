package com.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

	public class MyDate {
		
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");	
		public MyDate() {
		
		calendar.setLenient(false);  
		  
		try {
			calendar.getTime();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERORR: " + calendar.getTime() +" is a invalid date!");
			System.exit(0);
		}
		
		
		dateFormat.setTimeZone(calendar.getTimeZone());
	
		
	}
		
		
	public String getDate() { 
		return dateFormat.format(calendar.getTime());
	}
}
