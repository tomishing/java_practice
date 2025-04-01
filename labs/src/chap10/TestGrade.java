package chap10;

import java.util.Scanner;

public class TestGrade {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stids = { "001", "002", "003", "004", "005", "006", "007", "008" };
		char[] slists = new char[8];
		String grade;

		for (int i = 0; i < slists.length; i++) {
			System.out.print("Grade for " + stids[i]);
			char a = input.next().toUpperCase().charAt(0);
			try {
				if (!GradeException.isValidGrade(a)) {
					throw new GradeException("invalid");
				}
			} catch (GradeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
