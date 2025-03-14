package Chapter08;
import java.util.Scanner;
public class InputGrades {
	private static Scanner input = new Scanner(System.in);
	private static Student[] students = new Student[3];
	
	public static void main(String[] args) {

		
		for (int i = 0; i < students.length;i++) {
			students[i] = new Student(); //initialize 
			
			System.out.print("Enter Student ID >> ");
		 	students[i].setStudentId(input.nextLine());
		 	
		 	CollegeCourse course = new CollegeCourse(); //create course for each student
		 	
		 	for (int l = 0; l < 3; l++) {
		 		System.out.print("Enter Course ID >>" );
		 		course.setCourseId(input.nextLine()); 	

		 		String g;
		 		Boolean isValid;
		 		while(true) {
		 		
		 			System.out.print("Grade >> ");
		 			g = input.nextLine();
		 			isValid = (g.equals("A")||g.equals("B")||
		 				g.equals("C")||g.equals("D")||g.equals("F"));
		 				if(!isValid) {
		 					System.out.println("please enter valid grade!");
		 				}else {
		 					break;
		 				}
		 		}
	
		 		course.setLetterGrade(g); 	
		 		students[i].setCourse(course, l); 
		 		
		 		
		 	}
		 	
		 	System.out.print("Do you want to continue? Yes(1) or No(2): ");
		 	int n = input.nextInt();
		 	input.nextLine();
		 	if (n == 2) break;
		 	
		}
		input.close();
	
		for (int l = 0; l<3;l++) {
			 if (students[l] != null) {
	                display1(l);
	            }
		}
	}
	
	public static void display(int l) {
		System.out.print(students[l].getStudentId() + " " + 
				students[l].getCourses(0).getCourseId() + " " + 
				students[l].getCourses(0).getLetterGrade() + " " + 
				students[l].getCourses(1).getLetterGrade() + " " +
				students[l].getCourses(3).getLetterGrade());
	}
	public static void display1(int index) {
        // Assuming each student has an array of 3 courses, display each course info
        System.out.print("Student ID: " + students[index].getStudentId() + "\n");
        for (int j = 0; j < 3; j++) {
            CollegeCourse course = students[index].getCourses(j);
            if (course != null) {
                System.out.println("Course " + (j+1) + ": " + 
                                   course.getCourseId() + " Grade: " + 
                                   course.getLetterGrade());
            }
        }
        System.out.println();  // extra line for readability
    }

}
