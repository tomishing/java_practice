package chapter03;
import java.util.Scanner;

public class exc11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many books do you want to buy?");
		String valueS = input.nextLine();
		int nBook = Integer.parseInt(valueS);
		System.out.println("Coupon");
		valueS = input.nextLine();
		int pCoup = Integer.parseInt(valueS);
		
		double a = computeBill();
		double b = computeBill(nBook);
		double c = computeBill(nBook, pCoup);
		
		System.out.println("With tax: " + a 
				+ "\nWith the number of books: " + b
				+ "\nWith coupon: " + c);
		input.close();
		
	}
	
	public static double computeBill() {
		return Math.ceil(14.99 * (1 + 0.08));
	}
	public static double computeBill(int n)
	{
		return Math.ceil(14.99 * 1.08 * n);
	}
	public static double computeBill(int n, int coup)
	{
		return Math.ceil(14.99 * 1.08 * n - coup);
	}

}
