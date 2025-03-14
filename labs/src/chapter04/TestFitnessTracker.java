package chapter04;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestFitnessTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitnessTracker user1 = new FitnessTracker();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Activity >> ");
		String act = input.nextLine();
		System.out.println("the number of minutes >> ");
		int tMin = input.nextInt();
		// System.out.println("date >> ");
		//LocalDate dDate = input.nextDate();
		  input.nextLine();
		// Get date
        System.out.println("Date (yyyy-MM-dd) >> ");
        String dateInput = input.nextLine();
        LocalDate dDate = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		FitnessTracker user2 = new FitnessTracker(act, tMin, dDate);
		
		System.out.println("User1:\n " + 
				"Activity: " + user1.getName() + 
				" Time: " + user1.getMin() + 
				" Date: " + user1.getDate());
		System.out.println("User2:\n " + 
				"Activity: " + user2.getName() + 
				" Time: " + user2.getMin() + 
				" Date: " + user2.getDate());
	}
	

}
