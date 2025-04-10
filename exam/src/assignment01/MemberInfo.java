package assignment01;

public class MemberInfo {
	private String fname;
	private String haddress;
	public MemberInfo(String fname, String haddress) {
		super();
		this.fname = fname;
		this.haddress = haddress;
	}
	public String getFname() {
		return fname;
	}
	public String getHaddress() {
		return haddress;
	}

	public void display() {
		System.out.println("MemberInfo [fname = " + fname + 
				", haddress = " + haddress + "]");
	}
	

}
