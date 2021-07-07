package com.ss.ds.jb.two;

public class Triangle implements Shape {

	@Override
	public void display(double base, double height) {
		// TODO Auto-generated method stub
		System.out.println(calcualateArea(base,height));
	}

	@Override
	public double calcualateArea(double base, double height) {
		// TODO Auto-generated method stub
		return (.5*base)*height;
	}
	


	
}
