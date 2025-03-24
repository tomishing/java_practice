package chap09;

public abstract class Book {
	private String title;
	private double price;
	
	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
	public abstract void setPrice();

}
