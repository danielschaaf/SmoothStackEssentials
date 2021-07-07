package com.ss.ds.jb.two;

public class ShapeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		System.out.println("the area of the triangle is "+ t.calcualateArea(4, 6));
		System.out.println("the area of the circle is "+ c.calcualateArea(4, 4));
		System.out.println("the area of the Rectangle is "+ r.calcualateArea(6,8 ));
	}

}
