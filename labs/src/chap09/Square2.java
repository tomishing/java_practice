package chap09;

public class Square2 extends GeometricFigure2{
	double area;
	public Square2(double height, double width) {
		super(height, width, "Square");
	}
	@Override
	public double calcArea2() {
		return area = super.getHeight() * super.getWidth();
	}
	@Override
	public void displaySides() {
		System.out.println("The number of sides: 4");
	}
}
