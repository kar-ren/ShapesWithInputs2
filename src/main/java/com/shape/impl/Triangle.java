package com.shape.impl;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


import com.shape.interfaces.AbsShape;

public class Triangle extends AbsShape {

	Scanner sc = new Scanner(System.in);
	
	
	public void findResult() {
		try {
			System.out.print("\nEnter the hypotenuse side: ");
			int a = sc.nextInt();
			System.out.print("\nEnter the adjacent/base: ");
			int b = sc.nextInt();
			System.out.print("\nEnter the opposite side: ");
			double c = sc.nextDouble();
			System.out.print("\nEnter the height: ");
			double h = sc.nextInt();

			DecimalFormat df = new DecimalFormat("#.##");
			System.out.print("The Perimeter of a " + shape() + " is: " + (int) findPerimeter(a, b, c));
			System.out.print("\nThe Area of a " + shape() + " is: " + df.format(findArea(b, h)));
		} catch (InputMismatchException e) {
			System.out.println("Input must be double or integer.");
		}
	}

	public double findPerimeter(int a, int b, double c) {
//		Scanner scan = new Scanner(System.in);
//		radius = scan.nextInt();
		return a + b + c;
	}

	public double findArea(int b, double h) {
		// TODO Auto-generated method stub
		return (b * h) / 2;
	}
	
	public String shape() {
		return "TRIANGLE";
	}
}
