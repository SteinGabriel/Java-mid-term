package com.time;

import java.util.Calendar;

public class MyTime {
	
	
	Calendar calendar = Calendar.getInstance();
	
	public MyTime() {
		
		calendar.setLenient(false);  
		
		
		try {
			calendar.getTime();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERORR: " + calendar.getTime() + " is a invalid time!");
			System.exit(0);
		}
		
	}
	
	public String getMyTime() { 
		return getHour() + ":" + getMinutes() + ":" + getSeconds();
	}
	
	public String getHour() { 
		return Integer.toString(calendar.HOUR_OF_DAY);
	}
	
	public void setHour(int h) { 
		calendar.set(calendar.HOUR_OF_DAY,h);
	}
	
	public String getMinutes() { 
		return Integer.toString(calendar.MINUTE);
	}
	public void setMinutes(int m) { 
		calendar.set(calendar.MINUTE,m);
	}
	
	public String getSeconds() { 
		return Integer.toString(calendar.SECOND);
	}
	
	public void setSeconds(int s) { 
		calendar.set(calendar.SECOND,s);
	}
}
