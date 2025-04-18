package lab11;

public class NonFiction extends Book{

	public NonFiction(String bTitle) {
		super(bTitle);
		setPrice();
	}
	@Override
	public void setPrice() {
		this.bPrice = 37.99;
	}

}
