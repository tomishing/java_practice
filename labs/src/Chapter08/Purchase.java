package Chapter08;

public class Purchase {
	private int inv_num;
	private int sale;
	private double tax = 0.05;
	
	public void setInv(int inv_num) {
		this.inv_num=inv_num;
	}
	public void setSale(int sale) {
		this.sale=sale;
	}

	
	public double Calc() {
		double total = sale + tax * sale;
		return total;
	}
	public void display() {
		System.out.println("invoice: " + inv_num +
				" Amount: " + sale +
				" Total: " + Calc());
	}
	

}
