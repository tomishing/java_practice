package chap09;

public class Triangle2 extends GeometricFigure2 {
	double area;

	public Triangle2(double height, double width) {
		super(height, width, "Triangle");
	}

	@Override
	public double calcArea2() {
		return area = 0.5 * super.getHeight() * super.getWidth();
	}

	@Override
	public void displaySides() {
		System.out.println("The number of sides: 3");
	}
}
