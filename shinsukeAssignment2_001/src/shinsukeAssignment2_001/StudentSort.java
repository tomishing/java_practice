package shinsukeAssignment2_001;
import java.util.Scanner;

public class StudentSort {
private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 2;
		Student[] students = new Student[cap];
		String fName;
		String lName;
		String address;
		String studentId;
		String mail;
		double gpa = 0.0;
		
		for(int i = 0;i<students.length;i++) {
			
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
			
			while(!students[i].emailValidate()) {
				System.out.print("Re-enter Email >> ");
				mail = input.nextLine();
				students[i].seteMail(mail);
			};

		}
		// Display and sort	
		System.out.print("Which GPA and Student ID do you want to sort? (GPA: 1, Student ID: 2) >> ");
		int a = input.nextInt();
		input.nextLine();
		
		bubbleSort(students, a);
		display(students);
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
	public static void display(Student[] students) {
			for (Student st: students) {
				System.out.print(
						"\n" + 
						st.getStudentId() + ", " +
						st.getPerInf() + ", " +
						st.getDegree() + ", " +
						st.geteMail() + ", " + 
						st.getGpa()
						);
			}
	}


}
