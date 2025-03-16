package shinsukeAssignment2_001;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentDatabase {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// io
		String filename = "StudentRecords.txt";
		File file = new File(filename);
		file.createNewFile();

		FileWriter fw = new FileWriter(filename, true);

		// ArrayList
		ArrayList<String[]> slist = new ArrayList<>();

		// Student class
		int cap = 1;
		Student[] students = new Student[cap];

		// Prompts
		while (true) {
			PrintWriter pw = new PrintWriter(fw);
			System.out.println("\nWhich option do you want?");
			System.out.println("""
					1. Add a New Student
					2. Modify an Existing Record (Change GPA)
					3. Search by Email Address
					4. Search by Degree Program
					5. Exit
					Press 1, 2, 3, 4 or 5.
					""");
			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				arrayRecord(file, slist);
				if (slist.size() == 0) {
					System.out.println("File is empty");
				} else {
					System.out.print("Existing ID: ");
					for (String[] list : slist) {
						System.out.print(list[0] + " ");
					}
					System.out.println();
					System.out.println("Please select unique ID");

				}
				newStu(students, slist); // Create a Student instance
				addData(students, pw); // Student instance -> file
				// pw.flush(); // Write to the file
				arrayRecord(file, slist); //
				sortArray(slist);
				displayArray(slist);
				break;

			case 2:
				if (file.length() == 0) {
					System.out.println("No Data found");
				} else {
					arrayRecord(file, slist); // file -> Array
					modifyRecord(slist); // modify a value in the array
					sortArray(slist); // Sort the array by Student ID
					displayArray(slist); // display sorted array
					saveTxt(slist, pw);
				}
				break;

			case 3: {
				arrayRecord(file, slist);
				System.out.print("Enter an email address >> ");
				String email = input.nextLine().trim();
				for (String[] list : slist) {
					if (email.equals(list[4])) {
						System.out.println(Arrays.toString(list));
					}
				}
				break;
			}
			case 4:
				arrayRecord(file, slist);
				for (DegreeProgram dp : DegreeProgram.values()) {
					System.out.print(dp + ", ");
				}
				System.out.print("\nEnter a Degree Program >> ");
				String program = input.nextLine().toUpperCase();

				int p = 0;
				for (String[] list : slist) {
					if (program.equals(list[3])) {
						System.out.println(Arrays.toString(list));
						p++;
					}
				}
				if (p == 0)
					System.out.print("\nNo such students");
				break;

			case 5:
				System.out.println("Exited.");
				pw.close();
				return;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}

		}

	}

	public static Student[] newStu(Student[] students, ArrayList<String[]> records) {

		String fName;
		String lName;
		String address;
		String studentId;
		String mail;
		double gpa = 0.0;

		// Data input to Student and Person classes
		for (int i = 0; i < students.length; i++) {

			System.out.println("\nAvailable Degree Programs");
			for (DegreeProgram dp : DegreeProgram.values()) {
				System.out.println(dp);
			}
			System.out.print("\nDegree Program >> ");

			String program = input.nextLine().toUpperCase();

			DegreeProgram degreeProgram = switch (program) {
			case "COMPUTER SCIENCE" -> DegreeProgram.COMPUTER_SCIENCE;
			case "BUSINESS" -> DegreeProgram.BUSINESS;
			case "ENGINEERING" -> DegreeProgram.ENGINEERING;
			case "ARTS" -> DegreeProgram.ARTS;
			default -> {
				System.out.println("Invalid program entered. Defaulting to ARTS.");
				yield DegreeProgram.ARTS;
			}
			};

			System.out.print("Student ID >> ");
			studentId = input.nextLine();
			// Student ID uniqueness
			while (true) {
				int k = 0;
				for (String[] record : records) {
					if (studentId.equals(record[0])) {
						System.out.println("There is the same ID in the database. Try again. >> ");
						studentId = input.nextLine();
						k++;
						break;
					}
				}
				if (k == 0)
					break;
			}

			System.out.print("First name >> ");
			fName = input.nextLine();
			System.out.print("Last name >> ");
			lName = input.nextLine();
			System.out.print("Address >> ");
			address = input.nextLine();

			Person person = new Person(fName, lName, address);

			System.out.print("GPA >> ");
			gpa = input.nextDouble();
			input.nextLine();
			System.out.print("Email >> ");
			mail = input.nextLine();

			students[i] = new Student(studentId, mail, person, degreeProgram, gpa);

			while (!students[i].emailValidate()) {
				System.out.print("Re-enter Email >> ");
				mail = input.nextLine();
				students[i].seteMail(mail);
			}

		}
		return students;

	}

	public static void addData(Student[] students, PrintWriter pw) {

		for (Student st : students) {
			if (st == null)
				System.out.println("\nno data");
			pw.println(st.getStudentId() + "," + st.getPerInf() + "," + st.getDegree() + "," + st.geteMail() + ","
					+ st.getGpa());
		}
		pw.flush();
		System.out.println("\nStudent data saved successfully.");
	}

	public static void arrayRecord(File file, ArrayList<String[]> records) throws IOException {
		// check if file is not empty
		// file -> array
		// remove extra space in array and skip a blank line
		if (file.length() == 0) {
			System.out.println("The file is empty.");
			return;
		}
		Scanner scanner = new Scanner(file);
		records.clear();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine().trim(); // read a line, remove extra space
			if (line.isEmpty()) continue; // skip a blank line
			String[] fields = line.split(","); // split a line with comma, and store them in an array fields.
			records.add(fields); // fields array adds to records arraylist.
		}
		scanner.close();

	}

	public static void modifyRecord(ArrayList<String[]> records) throws IOException {
		System.out.println("Student ID >> ");
		String a = input.nextLine();
		boolean found = false;

		for (String[] record : records) {
			if (record[0].equals(a)) {
				System.out.println("New GPA >> ");
				record[5] = input.nextLine();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Wrong Student ID");
		}

	}

	public static void sortArray(ArrayList<String[]> records) {
		records.removeIf(r -> r.length == 0 || r[0].trim().isEmpty()); // Remove empty entries
		 // Sorting based on the first element (Student ID in this case)
        records.sort(Comparator.comparingInt(r -> Integer.parseInt(r[0].trim())));
	}

	public static void displayArray(ArrayList<String[]> records) {
		for (String[] record : records) {
			System.out.println(Arrays.toString(record)); // print data at the memory locations
		}
	}

	public static void saveTxt(ArrayList<String[]> records, PrintWriter writer) throws IOException {

		writer.close();
		PrintWriter newWriter = new PrintWriter(new FileWriter("StudentRecords.txt", false)); // Overwrite mode
		for (String[] record : records) {
			if (record.length == 0 || record[0].trim().isEmpty()) continue; // Skip empty records
			writer.println(String.join(",", record)); // Convert array to CSV line
		}

		newWriter.close();
	}
}
