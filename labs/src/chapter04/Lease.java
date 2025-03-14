package chapter04;

public class Lease {
	//fields
	private String name;
	private int aptNum;
	private int rent;
	private int termOfLease;
	
	//constructor
	public Lease()
	{
		name = "XXX";
		aptNum = 0;
		rent = 1000;
		termOfLease = 12;
	}
	
	
	// methods: get set
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAptNum()
	{
		return aptNum;
	}
	public void setAptNum(int num)
	{
		aptNum = num;
	}
	
	public int getRent()
	{
		return rent;
	}
	public void setRent(int re)
	{
		rent = re;
	}
	
	public int getTerm()
	{
		return termOfLease;
	}
	public void setTerm(int te)
	{
		termOfLease = te;
	}
	
	public void addPetFee()
	{
		rent = rent + 10;
		explainPetPolicy(rent);
	}
	
	//method
	public static void explainPetPolicy(int re)
	{
		System.out.println("The pet fee is " + re);
	}
	
	
}
