package com.shape;

import java.util.Calendar;

import com.time.MyDate;
import com.time.MyTime;

public abstract class Shape {
	
	private String name; 
	MyDate md;
	MyTime mt;
	double area = 0; 
	double volume = 0;
	
	public Shape () { 
		Calendar calendar = Calendar.getInstance();
		calendar.getTime();
		md = new MyDate();
		mt = new MyTime();
		
		
	}
	
	public String getCreationTime() { 
		return mt.getMyTime();
	}
	
	public String getCreationDate() { 
		return md.getDate();
	}
	
	public void setArea(int r, int h) { 
		if(h == 0) { 
			this.area = Math.PI*(r*r);
		} else { 
			this.area = 2*Math.PI*r*h + 2*Math.PI*(r*r); 
		}
	}
	
	public void setVolume(int r, int h) { 
		this.volume = Math.PI * (r*r) * h;
	}
	
	public double getVolume() { 
		return this.volume;
	}
	
	
	
	public double getArea() { 
		return this.area;
	}
	
	public void setName(String n) { 
		this.name = n;
	}
	
	public String getName() { 
		return this.name;
	}

}
