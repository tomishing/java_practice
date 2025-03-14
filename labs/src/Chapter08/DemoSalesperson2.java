package Chapter08;

public class DemoSalesperson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salesperson[] salesPeople = new Salesperson[10];
		int a = 111;
		double b = 25000;
		
		for(int i = 0; i < salesPeople.length; i++) {
			salesPeople[i] = getData01(a, b);
			a += 1;
			b += 5000;
		}

		for(Salesperson salesperson: salesPeople)
			System.out.println(salesperson);
	}		

	public static Salesperson getData01(int b, double c) {
		Salesperson a = new Salesperson(b, c);
		return a;
	}

}
