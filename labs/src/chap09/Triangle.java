package chap09;

public class Triangle extends GeometricFigure{

	double area;
	public Triangle(double height, double width) {
		super(height, width, "Triangle");
	}
	@Override
	public double calcArea() {
		return area = 0.5 * super.getHeight() * super.getWidth();
	}

}
