package com.main;

import java.util.ArrayList;

import com.shape.Circle;
import com.shape.Cylinder;
import com.shape.Point;
import com.shape.Shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point();
		p.setName("Point");
		p.setX(5);
		p.setY(15);
		
		
		Circle l = new Circle(5);
		l.setName("Circle");
		
		Cylinder c = new Cylinder(12,7); 
		c.setName("Cylinder");
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		list.add(p);
		list.add(l);
		list.add(c);
		
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("========= Name: " + list.get(i).getName());
			System.out.println("Creation date: " + list.get(i).getCreationDate());
			System.out.println("Creation time: " + list.get(i).getCreationTime());
			System.out.println("Area: " + list.get(i).getArea());
			System.out.println("Volume: " + list.get(i).getVolume());
		}
		
		
	}

}
