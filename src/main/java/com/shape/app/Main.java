package com.shape.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.shape.impl.Circle;
import com.shape.impl.Parallelogram;
import com.shape.impl.Rectangle;
import com.shape.impl.Sphere;
import com.shape.impl.Square;
import com.shape.impl.Triangle;

/**
 * Hello world!
 *
 */
public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main( String[] args )
    {
        int cons = 0;
        do{
        	try {
	        	System.out.println("\n1 - Circle\n2 - Sphere\n3 - Triangle\n4 - Square\n5 - Rectangle\n6 - Parallelogram\n");
	            System.out.print("\nEnter a number: ");
	        	int shapenumber = scan.nextInt();
		        switch(shapenumber) {
			        case 1: Circle c = new Circle();
			        		c.findResult();break;
			        case 2: Sphere s = new Sphere();
			        		s.findResult();break;
			        case 3: Triangle t = new Triangle();
			        		t.findResult();break;
			        case 4: Square sq = new Square();
			        		sq.findResult();break;
			        case 5: Rectangle r = new Rectangle();
			        		r.findResult(); break;
			        case 6: Parallelogram p = new Parallelogram();
			        		p.findResult(); break;
			        default: System.out.println("\n\tIncorrect number that corresponds to the Choices");break;
		        }
		        try {
		        	System.out.print("\n\nDo you want to choose another shapes?\n\t0 - NO\t\tany number - YES \t\nHere: ");
		        	cons = scan.nextInt();
		        }catch (NumberFormatException e) {
		        	System.out.println("\nIncorrect input that corresponds to the Shapes");
				}
        	}catch (InputMismatchException e) {
        		System.out.println("\nIncorrect input.\nIt must be an integer.");
        		break;
        	}
        }while (cons != 0);
        System.out.println("\n\tThank you for using the System!");
    }
}
