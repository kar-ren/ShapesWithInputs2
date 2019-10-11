package com.shape.impl;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.shape.interfaces.AbsShape;

public class Sphere extends AbsShape {
	Scanner sc = new Scanner(System.in);
	
	public void findResult() {

		try {
			System.out.println("Enter the raduis: ");
			int radius = sc.nextInt();
			
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.print("The Circumfirence of a " + shape() + " is: " + df.format(findPerimeter(2, radius, Math.PI)));
			System.out.print("\nThe Surface Area of a " + shape() + " is: " + df.format(findArea(radius, Math.PI)));
		} catch (InputMismatchException e) {
			System.out.println("The raduis must be double or integer.");
		}
	}

	public double findPerimeter(int num, int radius, double pi) {
		return num * radius * pi;
	}

	public double findArea(int radius, double pi) {
		return 4 * pi * Math.pow(radius, 2);
	}

	public String shape() {
		return "SPHERE";
	}
}
