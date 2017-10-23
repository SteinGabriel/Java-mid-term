package com.shape;

public class Cylinder extends Circle {
	
	private int height;
	
	public Cylinder(int r, int h) {
		super(r);
		// TODO Auto-generated constructor stub
		
		this.radius = r; 
		this.height = h; 
		
		setArea(r, h);
		setVolume(r, h);
	}

	
	
	public void setHeight(int h) { 
		this.height = h;
	}
	
	public int getHeight() { 
		return this.height;
	}
}
