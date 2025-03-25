package chap09;

import java.util.Scanner;

public class UseBook {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b;
		System.out.print("Enter a book title for fiction >> ");
		a = input.nextLine();
		System.out.print("Enter a book title for nonfiction >> ");
		b = input.nextLine();

		Book fic = new Fiction(a);
		Book nfic = new NonFiction(b);
		
		System.out.println("Fiction Title: " + fic.getTitle() + " price " + fic.getPrice());
		System.out.print("Non Fiction Title: " + nfic.getTitle() + " price " + nfic.getPrice());

	}

}
