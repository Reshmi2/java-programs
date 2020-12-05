package day2program4;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void computeArea() {
		// this.area = Math.PI * (this.radius * this.radius);
		super.area = Math.PI * (this.radius * this.radius);
		System.out.printf("Area of Circle : %.2f", super.area);
	}

}
