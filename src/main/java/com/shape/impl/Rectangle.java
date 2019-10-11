package com.shape.impl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.shape.interfaces.AbsShape;

public class Rectangle extends AbsShape {

	Scanner sc = new Scanner(System.in);

	public void findResult() {
		try {
			System.out.print("\nEnter the length: ");
			int len = sc.nextInt();
			
			System.out.print("\nEnter the width: ");
			double wid = sc.nextDouble();
			
			System.out.print("The Perimeter of " + shape() + ": " + (int) findPerimeter(2, len, wid));
			System.out.print("\nThe Area of " + shape() + ": " + (int) findArea(len, wid));
		} catch (InputMismatchException e) {
			System.out.println("Input must be double or integer.");
		}
	}

	public double findPerimeter(int num, int len, double wid) {
		return num * (len + wid);
	}

	public double findArea(int len, double wid) {
		return len * wid;
	}
	
	public String shape() {
		return "RECTANGLE";
	}
}
