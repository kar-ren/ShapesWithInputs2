package com.shape.interfaces;

public abstract class AbsShape implements Shape {
//	public abstract double findPerimeter();
//	public abstract double findArea();
	public String shape(Shape name) {
		return name.shape();
	}
}
