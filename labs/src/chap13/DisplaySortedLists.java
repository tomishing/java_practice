package chap13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class DisplaySortedLists {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> slist = new ArrayList();
		ArrayList<Integer> ilist = new ArrayList();
		String a = new String();
		int b;
		
		while(true) {
			System.out.print("Enter any word>> ");
			a = input.nextLine();
			slist.add(a);
			Collections.sort(slist);
			if (a.toUpperCase().equals("STOP")) {
				if (slist.size() != 0) slist.clear();
				break;
			}
			display(slist, ilist);
		}
		while(true) {
			System.out.print("Enter any number>> ");
			b = input.nextInt();
			ilist.add(b);
			Collections.sort(ilist);
			if (b == 100) {
				if(ilist.size()!=0) ilist.clear();
				break;
			}
			display(slist,ilist);
		}
		

	}
	public static void display(ArrayList<String> a, ArrayList<Integer> b) {
		if (a.size() != 0)
			System.out.println(a + " " + "size is " + a.size());
		if (b.size() != 0)
			System.out.println(b + " " + "size is " + b.size());
	}

}
