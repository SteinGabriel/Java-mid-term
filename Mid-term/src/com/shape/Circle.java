package com.shape;

public class Circle extends Point {

	int radius;
	
	public Circle(int r) {
		this.radius = r;
		setArea(r, 0);
	}
	
	
	public int getRadius() { 
		return this.radius;
	}
}
