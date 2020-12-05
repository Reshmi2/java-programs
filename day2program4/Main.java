package day2program4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Shape :");
		System.out.println("1. Circle\n" + "2. Rectangle\n" + "3. Traingle");
		byte choice = in.nextByte();
		if (choice == 1) {
			System.out.println("Enter the radius :");
			double radius = in.nextDouble();
			Shape circle = new Circle(radius);
			circle.computeArea();
		} else if (choice == 2) {
			System.out.println("Enter length and breadth :");
			double length = in.nextDouble();
			double breadth = in.nextDouble();
			Shape rectangle = new Rectangle(length, breadth);
			rectangle.computeArea();
		} else if (choice == 3) {
			System.out.println("Enter base and height");
			double base = in.nextDouble();
			double height = in.nextDouble();
			Shape triangle = new Triangle(base, height);
			triangle.computeArea();
		} else {
			System.out.println("Invaild Choice");
		}
	}
}
