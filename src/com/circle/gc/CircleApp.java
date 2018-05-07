package com.circle.gc;
//Brent Coppinger
import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		System.out.println("Welcome to circle tester!");

		Scanner scan = new Scanner(System.in);
		String contin = "y";

		while (contin.equalsIgnoreCase("y")) {
			System.out.print("Please enter radius: ");
			Circle circ = new Circle(scan.nextDouble());
			System.out.println(circ);
			System.out.println("Circumference: " + circ.getFormatedCircumference());
			System.out.println("Area: " + circ.getFormatedArea());
			System.out.println("Continue? (y/n): ");
			contin = scan.next();
			System.out.println(contin);
		}
		System.out.println("Goodbye.");
		scan.close();
	}
}
