package Chapter08;

public class DemoSalesperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesperson[] salesPeople = new Salesperson[10];
		
		for(int i = 0; i < salesPeople.length; i++) 
			salesPeople[i] = getData();
		
		for(Salesperson salesperson: salesPeople)
			System.out.println(salesperson);
		
	}
	public static Salesperson getData() {
		Salesperson a = new Salesperson(9999, 0.0);
		return a;
	}
	


}
