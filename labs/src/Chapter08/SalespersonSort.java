package Chapter08;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class SalespersonSort {

// class, toString, sort
//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Salesperson[] pal = new Salesperson[7];
		
		for (int i = 0;i<pal.length;i++)
			pal[i] = getData03(input);
		
		Salesperson[] sortedPal = forComparison(pal, input);
		for (Salesperson salesperson: sortedPal)
			System.out.println(salesperson);
		
		input.close();
	}
	
	public static Salesperson getData03(Scanner input) {
		
		
		System.out.print("Enter ID>> ");
		int n = input.nextInt();
		System.out.print("Enter Sales Value >> ");
		double bn = input.nextDouble();
		
		return new Salesperson(n, bn);
		
	}
	
	public static Salesperson[] forComparison(Salesperson[] b, Scanner input) {
		
		System.out.println("Choose an option");
		System.out.print("1 - by ID number");
		System.out.print("2 - by Sales amount");
		int n = input.nextInt();
		
		switch(n) {
			case 1 -> Arrays.sort(b, 0, b.length, Comparator.comparingInt(Salesperson::getId));
			case 2 -> Arrays.sort(b, Comparator.comparingDouble(Salesperson::getSales).reversed());
			default -> System.out.print("Invalid number");
		}
		
		return b;
	}

}
