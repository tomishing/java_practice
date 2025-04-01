package chap09;

public class CandleN {
	private String color;
	protected double height;
	protected double price;
	public String getColor() {
		return color;
	}
	public double getHeight() {
		return height;
	}
	public double getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double calcPrice() {
		return price = height * 2;
	}
}
