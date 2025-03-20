package chap09;

public class ScentedCandle extends Candle {
	private String scent;

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height); // Correctly calling the parent method
		this.price = 3 * height; // Scented candles cost more
	}

}
