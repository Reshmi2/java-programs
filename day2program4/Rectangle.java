package day2program4;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void computeArea() {
		this.area = this.length * this.breadth;
		System.out.printf("Area of Rectangle : %.2f", super.area);
	}

}
