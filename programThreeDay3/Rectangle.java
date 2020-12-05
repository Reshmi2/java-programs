package programThreeDay3;

public class Rectangle implements Polygon {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double calcPeri() {
		return 2 * (this.length + this.breadth);
	}

	public double calcArea() {
		return this.length * this.breadth;
	}
}
