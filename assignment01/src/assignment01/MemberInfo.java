package assignment01;

public class MemberInfo {
	
	// fields
	private String fullN;
	private String homeA;
	
	// constructor
	
	public MemberInfo(String fullN, String homeA) {
		this.fullN = fullN;
		this.homeA = homeA;
	}
	
	//getter methods
	
	public String getFullN()
	{
		return fullN;
	}
	public String getHomeA()
	{
		return homeA;
	}
	
	// display method
	
	public void display()
	{
		System.out.println("Member's Name: " + fullN);
		System.out.println("Home Address: " + homeA);
	}

}
