package chap11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentStanding {
	static Scanner input = new Scanner(System.in);

	static class MyExp extends Exception {
		public MyExp() {
			super("Wrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "students.txt";
		String id, fname, lname;
		int con;
		double grade;
		try {
			FileWriter fw = new FileWriter(filename, true);
			PrintWriter pw = new PrintWriter(fw);

			while (true) {
				System.out.print("ID> ");
				id = input.nextLine();
				System.out.print("First > ");
				fname = input.nextLine();
				System.out.print("Last > ");
				lname = input.nextLine();
				System.out.print("Grade > ");
				grade = input.nextDouble();
				input.nextLine();
				
				if (grade >= 2.0) {
					pw.println(id + "," + fname + "," + lname + "," + grade);
				}
				
				System.out.print("Would you like to continue? Put 1 to stop.");
				con = input.nextInt();
				input.nextLine();
				if (con != 1 && con != 2) {
					throw new MyExp();
				}
				if (con == 1) break;
			}

			pw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (MyExp e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		input.close();
	}
}
