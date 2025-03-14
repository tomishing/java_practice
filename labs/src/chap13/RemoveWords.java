package chap13;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveWords {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList();
		
		while(true) {
			System.out.print("Enter value>> ");
			String a = input.nextLine();
			if (a.toUpperCase().equals("STOP")) {
				for(String pam:alist)
					System.out.print(pam + " ");
				System.out.println();
				break;
			}
			alist.add(a);
		}
		
		input.nextLine();
		int i = alist.size();
		
		while(true) {
			System.out.println("The size of array: " + i);
			System.out.print("Remove the value? YES or NO ");
			String a = input.nextLine();
			if (a.toUpperCase().equals("YES")) {
				alist.remove(i-1);
				--i;
				if (i==0) {
					System.out.print("There is no more data");
					break;
				};
			}
			if (a.toUpperCase().equals("NO")) {
				for(String pam:alist)
					System.out.print(pam + " ");
				break;
			}		
			
		}	

	}

}
