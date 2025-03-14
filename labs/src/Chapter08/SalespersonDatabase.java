package Chapter08;
//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.Comparator;
import java.util.*;

public class SalespersonDatabase {
	// fields
    private static final int MAX_SIZE = 20;
    private static Salesperson[] salesPeople = new Salesperson[MAX_SIZE];
    private static int count = 0;
    private static Scanner scanner = new Scanner(System.in);

    // main
    public static void main(String[] args) {
        while (true) { // Point 1
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    deleteRecord();
                    break;
                case 3:
                    changeRecord();
                    break;
                case 4:
                    scanner.close();
                    System.out.println("See you.");
                    return;  // exit
                default:
                    System.out.println("Invalid choice.");
            }
            sortDatabase();
            displayDatabase();
        }
    }

//Menu
    private static void displayMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1 - Add a record");
        System.out.println("2 - Delete a record");
        System.out.println("3 - Change a record");
        System.out.println("4 - Exit");
    }
// Add
    private static void addRecord() {
        if (count >= MAX_SIZE) {
            System.out.println("Database is full.");
            return;
        }
        System.out.print("Enter ID number: ");
        int id = scanner.nextInt();
        scanner.nextLine(); //point

        if (findSalespersonById(id) != -1) {
            System.out.println("Error: ID already exists.");
            return;
        }
        System.out.print("Enter annual sales: ");
        double sales = scanner.nextDouble();
        scanner.nextLine();

        salesPeople[count++] = new Salesperson(id, sales);
    }
//Delete 
    private static void deleteRecord() {
        if (count == 0) {
            System.out.println("Database is empty.");
            return;
        }
        System.out.print("Enter ID number to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        int index = findSalespersonById(id);
        if (index == -1) {
            System.out.println("Error: ID not found.");
            return;
        }
        salesPeople[index] = salesPeople[count - 1]; // Replace with last record
        salesPeople[count - 1] = null;
        count--;
    }
// Update
    private static void changeRecord() {
        if (count == 0) {
            System.out.println("Database is empty.");
            return;
        }
        System.out.print("Enter ID number to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        int index = findSalespersonById(id);
        if (index == -1) {
            System.out.println("Error: ID not found.");
            return;
        }
        System.out.print("Enter new annual sales: ");
        double newSales = scanner.nextDouble();
        scanner.nextLine();
        salesPeople[index].setSales(newSales);
    }
// search id
    private static int findSalespersonById(int id) {
        for (int i = 0; i < count; i++) {
            if (salesPeople[i].getId() == id) {
                return i;
            }
        }
        return -1; // for Error message
    }

 // Sort
    private static void sortDatabase() {
        //Arrays.sort(salesPeople, 0, count, (a, b) -> Integer.compare(a.getId(), b.getId()));
    	// Lambda Expression:
    	// (a, b) -> Integer.compare(a.getIdNumber(), b.getIdNumber())
        Arrays.sort(salesPeople, 0, count, Comparator.comparingInt(Salesperson::getId));
    }

 // Display
    private static void displayDatabase() {
        System.out.println("\nUpdated Salesperson Database:");
        for (int i = 0; i < count; i++) {
            System.out.println(salesPeople[i]);
        }
    }
}
