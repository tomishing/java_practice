package assignment01;

import java.time.LocalDate;

public class LibraryAccount {
	
	//fields
	private int accountID;
	private LibraryMember libMem;
	private String borrowedBook;
	
	//constructor
	public LibraryAccount() {
		accountID = 0;
		libMem = new LibraryMember(1000, new MemberInfo(null, null), null);
		borrowedBook = null;
	}
	
	//constructor
	public LibraryAccount(int accountID, LibraryMember libMem, String borrowedBook)
	{
		this.accountID = accountID;
		this.libMem = libMem;
		this.borrowedBook = borrowedBook;
	}
	
	// getter and setter
	public int getAccID() {
		return accountID;
	}
	public void setAccID(int acc) {
		accountID = acc;
	}
	public LibraryMember getLibMem() {
		return libMem;
	}
	public void setLibMem(LibraryMember mem) {
		libMem = mem;
	}
	
	//access to membership id
	public int getMemIdLibMem()
	{
		return libMem.getMemberID();
	}
	
	
	public String getBorrowedbook() {
		return borrowedBook;
	}
	
	//borrowBook and returnBook methods
	public String borrowBook(String bookName) {
			return borrowedBook = bookName;
	}
	public String returnBook(String bookName) {
		return borrowedBook = null;
	}
	
	//display method
	public void display()
	{
		System.out.println("AccountID: " + accountID);
		libMem.display();
		System.out.println("Borrowed book: " + borrowedBook);
	}

}
