package chapter03;
import java.util.Scanner;
import javax.swing.JOptionPane;
//Here’s a version of your code rewritten without using return. 
//		Instead of returning values from the methods, the results are stored 
//		in instance variables, and the methods update these variables.
public class exc06 {
	
	static double feetresult;
	static double yardresult;
	
	public static void main(String[] args) {
		double inch = 12;
		double foot = 3;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Inches?");
		String valueS = userInput.nextLine();
		inch = Double.parseDouble(valueS);
		System.out.println("foot?");
		valueS = userInput.nextLine();
		foot = Double.valueOf(valueS);
		
		inchTofeet(inch);
		feetToyard(foot);
		
		
		System.out.println("Feet: " + feetresult);
		System.out.println("Yard: " + yardresult);
		// TODO Auto-generated method stub
		

	}
	public static void inchTofeet(double inch) {
		feetresult = inch/12;
	}
	public static void feetToyard(double foot) {
		yardresult = foot/3;
	}

}
