package chapter04;

public class Sandwich {
	
	private String ingredient;
	private String bread;
	private double price = 4.99;
	
	public String getIng()
	{
		return ingredient;
	}
	public void setIng(String ing)
	{
		ingredient = ing;
	}
	
	public String getBread()
	{
		return bread;
	}
	public void setBread(String bd)
	{
		bread = bd;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double pr)
	{
		price = pr;
	}
}
