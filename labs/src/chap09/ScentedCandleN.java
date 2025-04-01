package chap09;

public class ScentedCandleN extends CandleN{
	private String scent;

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}
	
	@Override
	public double calcPrice() {
		return this.price = super.height * 3;
		
	}

}
