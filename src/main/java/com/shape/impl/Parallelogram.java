package com.shape.impl;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.shape.interfaces.AbsShape;

public class Parallelogram extends AbsShape {

	Scanner sc = new Scanner(System.in);

	public void findResult() {
		try {
			System.out.print("\nEnter the length: ");
			int len = sc.nextInt();

			System.out.print("\nEnter the width: ");
			int wid = sc.nextInt();

			System.out.print("\nEnter the height: ");
			double height = sc.nextDouble();

			DecimalFormat df = new DecimalFormat("#.##");
			System.out.print("The Perimeter of " + shape() + ": " + (int) findPerimeter(len, wid, 2));
			System.out.print("\nThe Area of " + shape() + ": " + df.format(findArea(len, height)));

		} catch (InputMismatchException e) {
			System.out.println("Input must be double or integer.");
		}
	}

	public double findPerimeter(int len, int wid, double a) {
		return a * (len + wid);
	}

	public double findArea(int len, double height) {
		return len * height;
	}

	public String shape() {
		return "PARALLELOGRAM";
	}
}
