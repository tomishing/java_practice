package chapter04;
import java.util.Scanner;

public class TestSandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich sand = new Sandwich();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingredient?");
		String gr = input.nextLine();
		sand.setIng(gr);
		
		System.out.println("bread?");
		String br = input.nextLine();
		sand.setBread(br);
		
		System.out.println("Price?");
		double pr = input.nextDouble();
		sand.setPrice(pr);
		
		System.out.println("Price is " + sand.getPrice());
	}

}
