package Chapter08;

public class Salesperson {
	private int id;
	private double salesAmount;
	
	public Salesperson(int id, double salesAmount) {
		this.id = id;
		this.salesAmount = salesAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int a) {
		id = a;
	}
	public double getSales() {
		return salesAmount;
	}
	public void setSales(double b) {
		salesAmount = b;
	}
	
	@Override
	public String toString()
	{
		return "Sales ID: " + id + ", Annual Sales: " + salesAmount;
	}

}
