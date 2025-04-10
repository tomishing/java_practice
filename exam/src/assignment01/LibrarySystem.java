package assignment01;

import java.util.Scanner;

public class LibrarySystem {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Valid ID
		String[] memIds = { "1000", "2000", "3000" };

		boolean check = false;
		while (!check) {
			System.out.println("Enter the membership id >> ");
			String memid = input.nextLine();
			for (String mem : memIds) {
				if (mem.equals(memid)) {
					check = true;
					break;
				}
			}
			if (!check) {
				System.out.println("Invalid id");
			}
		}

		// when to get membership details?
		System.out.println("1. View Borrowed Books");
		System.out.println("2. Borrow a Book");
		System.out.println("3. Return a Book");
		System.out.println("4. View Membership Details");
		System.out.println("5. Exit");
		System.out.println("Choose a number >> ");
		String num = input.nextLine();
		switch (num) {

		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			
			break;
		default:

		}

		System.out.println("Thank you for using the library system. Happy reading!");
	}

}
