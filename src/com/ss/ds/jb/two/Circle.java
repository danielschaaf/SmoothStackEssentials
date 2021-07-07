package com.ss.ds.jb.two;

public class Circle implements Shape{

	@Override
	public void display(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(calcualateArea(4,4));
	}

	@Override
	public double calcualateArea(double x, double y) {
		// TODO Auto-generated method stub
		return (pi*x*y);
	}

}
