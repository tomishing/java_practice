package chap09;

public abstract class GeometricFigure2 implements SideObject{
	private double height;
	private double width;
	private String figure;
	
	public GeometricFigure2(double height, double width, String figure) {
		this.height = height;
		this.width = width;
		this.figure = figure;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getFigure() {
		return figure;
	}

	public abstract double calcArea2();


}
