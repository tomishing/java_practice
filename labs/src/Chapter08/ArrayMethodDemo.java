package Chapter08;
import java.util.Scanner;
public class ArrayMethodDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[3];
		
		for (int i = 0;i<array.length;i++) {
			System.out.print("Enter your number >> ");
			array[i] = input.nextInt();
		}
		
		displayAll(array);
		System.out.print("\n");
		displayReverse(array);
		System.out.print("\n");
		displaySum(array);
		displayTwelve(array);
		displayHigherAve(array);
		input.close();
	}
	public static void displayAll(int[] a) {
		
		for (int i = 0; i< a.length; i++)
			System.out.print(a[i] + " ");
	}
	public static void displayReverse(int[] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[a.length - 1 - i] + " ");
	}
	public static void displaySum(int[] a) {
		int b = 0;
		for(int i = 0; i < a.length; i++)
			b += a[i];
		System.out.println(b);
	}
	public static void displayTwelve(int[] a) {
		int b = 0;
		for(int i = 0; i<a.length;i++) {
			
			if (a[i] < 12) {
				System.out.println(a[i] + " ");
			}else {
				b += 1;
			}
			
		}
			if (b == a.length) 
				System.out.print("None of them are less than 12");
	}
	public static void displayHigherAve(int[] a) {
		int b = 0;
		for(int i = 0; i < a.length; i++)
			b += a[i];
		for(int i = 0; i < a.length; i++)
			if(a[i] > b/a.length) System.out.println("The value is " + a[i]);
	}
			

}
