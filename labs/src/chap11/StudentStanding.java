package chap11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentStanding {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String filename = "students.txt";
		File file = new File(filename);
		try {
			FileWriter fw = new FileWriter(filename, false);
			PrintWriter pw = new PrintWriter(fw);
			
			while(true) {
				System.out.print("ID> ");
				System.out.print("First > ");
				System.out.print("Last > ");
				System.out.print("Would you like to continue? 1 or 2");
				
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
