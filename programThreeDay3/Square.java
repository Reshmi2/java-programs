package programThreeDay3;

public class Square implements Polygon {
	public double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double calcPeri() {
		return 4 * this.side;
	}

	public double calcArea() {
		return this.side * this.side;
	}

}
