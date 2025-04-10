package assignment01;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryAccount extends LibraryMember {
	private int libAcId;

	// constructors
	public LibraryAccount(String fname, String haddress, int memid, LocalDate regDate, int libAcId) {
		super(fname, haddress, memid, regDate);
		this.libAcId = libAcId;
	}

	public LibraryAccount() {
		super("default", "default", 0, LocalDate.of(2000, 1, 1));
		this.libAcId = 0;
	}

	// gettter and settter
	public int getLibAcId() {
		return libAcId;
	}

	public void setLibAcId(int libAcId) {
		this.libAcId = libAcId;
	}

	// methods
	public String borrowBook(String bookName) {
		return bookName;
	}

	public String returnBook(String bookName) {
		return null;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Library Account: " + libAcId);
	}

}
