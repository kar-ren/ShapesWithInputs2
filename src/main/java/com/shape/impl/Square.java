package com.shape.impl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.shape.interfaces.AbsShape;

public class Square extends AbsShape {

	Scanner sc = new Scanner(System.in);
	
	public void findResult() {
		try {
			System.out.print("\nEnter the sides: ");
			int sides = sc.nextInt();
		
			System.out.print("The Perimeter of " + shape() + ": " + (int) findPerimeter(sides, 4, 0));
			System.out.print("\nThe Area of " + shape() + ": " + (int) findArea(sides, 2));
		} catch (InputMismatchException e) {
			System.out.println("Input must be double or integer.");
		}

	}

	public double findPerimeter(int sides, int num, double a) {
		return num * sides;
	}

	public double findArea(int sides, double d) {
		return Math.pow(sides, d);
	}

	public String shape() {
		return "SQUARE";
	}
}
