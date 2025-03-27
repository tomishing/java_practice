package chap10;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String userInput = scanner.nextLine();
        int number;
        
        try {
            number = Integer.parseInt(userInput);
            if (number < 0) {
                throw new ArithmeticException("Cannot calculate the square root of a negative number.");
            }
            System.out.println("Square root: " + Math.sqrt(number));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer. Setting number to 0.");
            number = 0;
            System.out.println("Square root: " + Math.sqrt(number));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
