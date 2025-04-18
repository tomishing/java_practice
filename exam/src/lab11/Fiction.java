package lab11;

public class Fiction extends Book {

	public Fiction(String bTitle) {
		super(bTitle);
		setPrice();
	}
	@Override
	public void setPrice() {
		this.bPrice = 24.99;
	}

}
