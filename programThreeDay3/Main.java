package programThreeDay3;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Breadth & Length Of Rectangle :");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		Polygon rectangle = new Rectangle(length, breadth);
		System.out.println("Enter Side Value : ");
		double side = sc.nextDouble();
		Polygon square = new Square(side);
		System.out.println("Perimeter of Rectangle : " + rectangle.calcPeri());
		System.out.println("Area of Rectangle : " + rectangle.calcArea());
		System.out.println("Perimeter of Square : " + square.calcPeri());
		System.out.println("Area of Square : " + square.calcArea());
	}


}
