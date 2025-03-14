package chapter03;
import java.util.Scanner;

public class exc07 {
	static final int oneGal = 350;
	static double length;
	static double width;
	static double height;
	static double wareaL;
	static double wareaW;
	static double wareaA;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("length?");
		String valueS = input.nextLine();
		length = Double.parseDouble(valueS);
		System.out.println("width?");
		valueS = input.nextLine();
		width = Double.parseDouble(valueS);
		System.out.println("height?");
		valueS = input.nextLine();
		height = Double.parseDouble(valueS);
		
		wallArea(length, width, height);
		double gal = gallonArea(wareaA);
		double tCost = totalCost(gal);
		System.out.printf("Area is %.2f.\n", wareaA);
		System.out.printf("The number of gallons needed is %.2f.\n", gal);
		System.out.printf("The final price is %.2f.\n", tCost);
		
		input.close();
	}
	public static void wallArea(double l, double w, double h)
	{
		wareaW = h * w;
		wareaL = h * l;
		wareaA = wareaW * 2 + wareaL * 2;
		
	}
	public static double gallonArea(double a)
	{
		double reqGal = a / oneGal;
		return reqGal;
	}
	public static double totalCost(double b)
	{
		double price = b * 32;
		return price;
	}

}
