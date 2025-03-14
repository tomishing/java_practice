package Chapter08;

public class DrugTests3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] employees = new int[30];
		int testedEmployee = 0;
		int lastEmp = 0;
		
		for(int i = 1; i <= 52;i++) {
			
			while(true) {
				testedEmployee = 1 + (int)(Math.random() * 30);
				if (testedEmployee == lastEmp) {
					System.out.println("Consective. A new number is selected.");
				}else {
					break;
				}
			}
				
			for (int l = 0;l < employees.length;l++) {
				if (l == testedEmployee) {
					employees[l] += 1;
				}
			}
			lastEmp = testedEmployee;
		
		}
		
		System.out.println("\n" + "Selected Employees\n");
		for (int i = 0; i < employees.length; i++) {

			if (employees[i] > 0) {
				System.out.println(i + ": " + employees[i]);
			}
		}
		
		System.out.println("\n" + "Never been Selected Employees\n");
		for (int i = 0; i < 30; i++) {

			if (employees[i] == 0) {
				System.out.println(i + ": " + employees[i]);
			}
		}
		
	}

}
