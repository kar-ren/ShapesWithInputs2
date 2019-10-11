package com.shape.interfaces;

public interface Shape {
	String circlename = "CIRCLE";
	String spherename = "SPHERE";
	String rectanglename = "RECTANGLE";
	String squarename = "SQUARE";
	String parallelogramname = "PARALLELOGRAM";
	String trianglename = "TRIANGLE";
	String shape();
	public void findResult();
	public double findPerimeter(int num, int rad, double pi);
	public double findArea(int a, double b);
}
