package com.circle.gc;
//Brent Coppinger
public class Circle {
	double radius = 0;

	public Circle(double radius) {
		this.radius = radius;
	}

	double getCircumference() {
		return Math.PI * radius * 2;
	}

	String getFormatedCircumference() {
		return String.format("%.2f", Math.PI * radius * 2);
	}

	double getArea() {
		return Math.PI * (radius * radius);
	}

	String getFormatedArea() {
		return String.format("%.2f", (Math.PI * (radius * radius)));
	}

	String formatRadius() {
		return String.format("%.2f", radius);
	}
}
