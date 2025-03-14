package shinsukeAssignment2_001;

import java.io.*;
import java.util.Scanner;

public class StudentDatabase {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// io
		String filename = new String("StudentRecords.txt");
		File file = new File(filename);

		if (!file.exists())
			file.createNewFile();

		FileWriter fw = new FileWriter(filename, true);
		PrintWriter pw = new PrintWriter(fw);

		// class
		int cap = 2;
		Student[] students = new Student[cap];

		// Prompts
		System.out.println("\nWhich option do you want?");
		System.out.println("""
				1. Add a New Student\n
				2. Modify an Existing Record (Change GPA)\n
				3. Search by Email Address\n
				4. Search by Degree Program\n
				Press 1, 2, 3 or 4.
				""");
		int a = input.nextInt();
		input.nextLine();
		switch (a) {
		case 1: {
			newStu(students);
			bubbleSort(students, 2);
			addData(students, pw);
			display(students);
			break;
		}
		case 2: {
		}
		case 3: {
		}
		case 4: {
		}
		default: {
			System.out.println("Invalid.");
			display(students);
			break;
		}
		}
		
		
		pw.close();

	}

	public static Student[] newStu(Student[] students) {

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
			if (i > 0) {
				int p = 0;
				while (true) {
					if (studentId.equals(students[p].getStudentId())) {
						System.out.println("There is the same ID in the database. Try again. >> ");
						studentId = input.nextLine();
						p = 0;
					}else {
						p++;
					}
					if (p == students.length) break;
				}
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

	public static Student[] bubbleSort(Student[] students, int a) {

		if (a == 1) {
			for (int i = 0; i < students.length - 1; ++i) {
				Double b = students[i].getGpa();
				Double c = students[i + 1].getGpa();
				Student d = students[i];
				if (b.compareTo(c) > 0) {
					students[i] = students[i + 1];
					students[i + 1] = d;
				}

			}
		} else {
			for (int i = 0; i < students.length - 1; ++i) {
				String b = students[i].getStudentId();
				String c = students[i + 1].getStudentId();
				Student d = students[i];
				if (b.compareTo(c) > 0) {
					students[i] = students[i + 1];
					students[i + 1] = d;
				}

			}
		}
		return students;
	}

	public static void addData(Student[] students, PrintWriter pw) {
		for (Student st : students) {
			pw.println("\n" + st.getStudentId() + ", " + st.getPerInf() + ", " + st.getDegree() + ", " + st.geteMail()
					+ ", " + st.getGpa());
		}
	}

	public static void display(Student[] students) {
		for (Student st : students) {
			System.out.print("\n" + st.getStudentId() + ", " + st.getPerInf() + ", " + st.getDegree() + ", "
					+ st.geteMail() + ", " + st.getGpa());
		}
	}
}
