package assignment01;
import java.time.LocalDate;

public class LibraryMember {
	
	//fields
	private int membershipID;
	private MemberInfo member;
	private LocalDate regDate;
	
	//constructor
	public LibraryMember(int membershipID, MemberInfo member, LocalDate regDate)
	{
		this.membershipID = membershipID;
		this.member = member;
		this.regDate = regDate;
	}
	
	// getter
	public int getMemberID()
	{
		return membershipID;
	}
	public MemberInfo getMember()
	{
		return member;
	}
	public LocalDate getDate() {
		return regDate;
	}
	
	// display method
	public void display() {
		System.out.println("Membership ID: " + membershipID);
		member.display();
		System.out.println("Registration Date: " + regDate);
		
	}

}
