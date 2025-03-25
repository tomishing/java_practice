package chap09;

public class Fiction extends Book{

	public Fiction(String title) {
		super(title);
		setPrice();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setPrice() {
		this.price = 24.99;
	};

}
