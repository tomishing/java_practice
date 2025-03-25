package chap09;

public class Square extends GeometricFigure{
	double area;
	public Square(double height, double width) {
		super(height, width, "Square");
	}
	@Override
	public double calcArea() {
		return area = super.getHeight() * super.getWidth();
	}

}
