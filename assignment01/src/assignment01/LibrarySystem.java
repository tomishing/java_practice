/**
 * @author Shinsuke Tomita
 * Student ID: 300405927
 */

package assignment01;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Random;

public class LibrarySystem {

	public static void main(String[] args) {
		
		int i;
		LibraryAccount[] reg = new LibraryAccount[3];
		int[] memberID = new int[3];
		for(i=0;i<3;i++)memberID[i]=0;
		int userInput;
		
		for (i = 0; i < 3; i++) {
			reg[i] = getReg(i, memberID);
			memberID[i] = reg[i].getMemIdLibMem();
		}
		
		System.out.println("\nRegistered membership IDs are: "
				+ memberID[0] + ", " + memberID[1] + ", "
				+ memberID[2]);
		
		userInput = SearchID(memberID);
		
		for(i = 0; i < 3; i++) {
			if (userInput == memberID[i]) {
				Menu(reg[i]);
				break;
			}
		}
		
	}
	
	public static LibraryAccount getReg(int num, int[] mem1) {
		
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		int memberID;
		MemberInfo mem;
		LibraryMember lib;
		LibraryAccount reg;
		String name, address;
		
		do {
			memberID = ran.nextInt(9000) + 1000;
		}while (memberID == mem1[0] || memberID == mem1[1]);
	
		LocalDate regDate = LocalDate.now();
		int accountID = num;
		
		System.out.println("\nRegistration: Account#" + num);
		System.out.print("Enter Your Name > ");
		name = input.nextLine();
		System.out.print("Enter Your Home Address > ");
		address = input.nextLine();
		
		mem = new MemberInfo(name, address);
		lib = new LibraryMember(memberID, mem, regDate);
		reg = new LibraryAccount(accountID, lib, null) ;
	
		return reg;
		
	}
		
	public static int SearchID(int[] memid) {
		Scanner input = new Scanner(System.in);
		int num;
		boolean isValid;
	
		do {
			System.out.print("Enter your membership ID > ");
			num = input.nextInt();
			isValid = (num == memid[0] || num == memid[1] || num == memid[2]);
			if(!isValid) {
				System.out.println("Your ID is invalid. Please try again.");
			}
		}while(!isValid);

		return num;
		
	}

	
	public static void Menu(LibraryAccount userInfo) {
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println(
					"""
					\n
					Library Menu
					
					1. View Borrowed Books
					2. Borrow a Book
					3. Return a Book
					4. View Membership Details
					5. Exit
					\nEnter your choice: 
					"""
			);
			int num = input.nextInt();
			input.nextLine();
			
			switch(num) {
			case 1 ->  {
				System.out.println(userInfo.getBorrowedbook());}
			case 2 ->  {
				System.out.print("Enter the book name> ");
				String bookName = input.nextLine();
				userInfo.borrowBook(bookName);
			}
			case 3 ->  {
				System.out.print("Enter the book name> ");
				String bookName = input.nextLine();
				userInfo.returnBook(bookName);
			}
			case 4 ->  {userInfo.display();}
			case 5 -> {
				System.out.println(""
				+ "Thank you for using the library system. Happy reading!");
				return;
			}
			default -> System.out.println("Invalid choise");
			}	

		}
		
	}

}

	
