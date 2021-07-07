package com.ss.ds.jb.two;

public class Rectangle implements Shape{

	@Override
	public void display(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(calcualateArea(x,y));
	}

	@Override
	public double calcualateArea(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
