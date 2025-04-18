package lab11;

public abstract class Book {
	private String bTitle;
	protected double bPrice;

	public Book(String bTitle) {
		super();
		this.bTitle = bTitle;
	}

	public String getbTitle() {
		return bTitle;
	}

	public double getbPrice() {
		return bPrice;
	}
	
	abstract void setPrice();
}
