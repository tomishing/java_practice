package chap11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentStanding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "students.txt";
		File file = new File(filename);
		ArrayList<String> list = new ArrayList<>();
		try {	
			Scanner inputfile = new Scanner(file);
			
			while(inputfile.hasNext()) {
				String str = inputfile.nextLine();
				list.add(str);
				System.out.println(str);
			}
			inputfile.close();
			
			System.out.println(list.size());
			Collections.sort(list);
			
			for(String a: list) {
				System.out.println(a);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
