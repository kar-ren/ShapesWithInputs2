package com.shape.impl;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//import java.util.Scanner;

import com.shape.interfaces.AbsShape;

public class Circle extends AbsShape {

	int radius;
	final double pi = Math.PI;
	
	
	Scanner sc = new Scanner(System.in);

	public void findResult() {
		try {
			System.out.println("Enter the raduis: ");
			radius = sc.nextInt();

			DecimalFormat df = new DecimalFormat("#.##");

			System.out.print("The Perimeter of a " + shape() + " is: " + df.format(findPerimeter(2, radius, Math.PI)));
			System.out.print("\nThe Area of a " + shape() + " is: " + df.format(findArea(radius, Math.PI)));
		} catch (InputMismatchException e) {
			System.out.println("The raduis must be double or integer.");
		}
	}

	public double findPerimeter(int num, int radius, double pi) {
		return num * pi * radius;

	}

	public double findArea(int radius, double pi) {
//		Scanner scan = new Scanner(System.in);
//		radius = scan.nextInt();
		return pi * Math.pow(radius, 2);
	}

	public String shape() {
		return "CIRCLE";
	}
}
