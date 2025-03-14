package Chapter08;
import java.util.Scanner;

public class InputGrades01 {
	private static Scanner input = new Scanner(System.in);
	private static Student[] students = new Student[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
			System.out.println("Student ID: ");
			students[i].setStudentId(input.nextLine());		
			
			for(int l = 0; l < 3;l++) {
				CollegeCourse course = new CollegeCourse();
				System.out.println("Course ID: ");
				course.setCourseId(input.nextLine());
				
				while(true) {
					System.out.println("Grade: ");
					String g = input.nextLine();
					boolean isValid = (g.equals("A") || g.equals("B")||g.equals("C")||g.equals("D")||g.equals("E"));
					if(isValid) {
						course.setLetterGrade(g);
						break;
					}else {
						System.out.println("Re-enter the grade ");
					}
				}
				students[i].setCourse(course, l);
			}
		}
		for(int i = 0;i<3;i++)
			display(i);
	}
	
	private static void display(int i) {
		System.out.println("\nStudent ID: " + students[i].getStudentId());
		
		for(int l = 0; l<3;l++) {
			System.out.println("Course ID: " + students[i].getCourses(l).getCourseId() +
					", Grade: " + students[i].getCourses(l).getLetterGrade());		
		}

	}

}
