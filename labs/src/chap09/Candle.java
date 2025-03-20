package chap09;
// 2, 4, 5, 7, 8, 12, 13
public class Candle {
	private String color;
	private double height;
	protected double price;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		this.price = 2 * height;
	}
	public double getPrice() {
		return price;
	}
	

}
