package chapter04;
import java.util.Scanner;
/**
*
* The method prints a simple message on the Console.
*
*/
public class Testlease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lease Lease1;
		Lease Lease2;
		Lease Lease3;
		Lease Lease4 = new Lease();
		Lease1 = getData();
		Lease2 = getData();
		Lease3 = getData();
		
		showValues(Lease1);
	}
	public static Lease getData()
	{
		Lease tempLe = new Lease();
		String name;
		int aptNum;
		int rent;
		int term;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name >> ");
		name = input.nextLine();
		tempLe.setName(name);
		
		System.out.print("Enter apartment number >> ");
		aptNum = input.nextInt();
		tempLe.setAptNum(aptNum);
		
		System.out.print("Enter rent fee >> ");
		rent = input.nextInt();
		tempLe.setRent(rent);
		
		System.out.print("Enter Number of terms >> ");
		term = input.nextInt();
		tempLe.setTerm(term);

		return tempLe; // return the instance
	}
	public static void showValues(Lease anLe)
	{
		System.out.println("\nName " + anLe.getName() +
				"\nAprtment #:  " + anLe.getAptNum() +
				"\nRent fee is " + anLe.getRent() +
				"\nTerm is " + anLe.getTerm());
		anLe.addPetFee();
	}

}
