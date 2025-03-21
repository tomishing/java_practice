package chap09;

import java.util.Scanner;

public class DemoPoem {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int a;
			String t;
			int n;
			
			System.out.print("Number (1 - 4) >> ");
			a = input.nextInt();
			input.nextLine();
			
			switch (a) {
			case 1:
				System.out.print("Title >> ");
				t = input.nextLine();
				System.out.print("Number of lines >> ");
				n = input.nextInt();
				Poem p = new Poem(t, n);
				System.out.println("Name: " + p.getpName() + ", The number of lines: " + p.getnLine());
				return;
			case 2:
				System.out.print("Title >> ");
				t = input.nextLine();
				Couplet c = new Couplet(t);
				System.out.println("Name: " + c.getpName() + ", The number of lines: " + c.getnLine());
				return;
			case 3:
				System.out.print("Title >> ");
				t = input.nextLine();
				Limerick rim = new Limerick(t);
				System.out.println("Name: " + rim.getpName() + ", The number of lines: " + rim.getnLine());
				return;
			case 4:
				System.out.print("Title >> ");
				t = input.nextLine();
				Haiku hai= new Haiku(t);
				System.out.println("Name: " + hai.getpName() + ", The number of lines: " + hai.getnLine());
				return;
			default:
				System.out.println("Enter appropriate number from 1 to 4");
				break;
			}
			
		}

		

	}

}
