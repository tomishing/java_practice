package assignment01;

import java.time.LocalDate;

public class LibraryMember extends MemberInfo {
	private int memid;
	private LocalDate regDate;

	public LibraryMember(String fname, String haddress, int memid, LocalDate regDate) {
		super(fname, haddress);
		this.memid = memid;
		this.regDate = regDate;
		try {
			if (!memExp.isValidid(memid)) {
				throw new memExp();
			}
		} catch (memExp e) {
			System.out.println(e.getMessage());
		}
	}

	public int getMemid() {
		return memid;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	@Override
	public void display() {
		super.display();
		System.out.print("LibraryMember [memid = " + memid + 
				", regDate = " + regDate + "]");
	}

}
