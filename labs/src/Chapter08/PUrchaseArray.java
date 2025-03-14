package Chapter08;
import java.util.Scanner;

public class PUrchaseArray {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purchase[] purchases = new Purchase[5];
		int num = 0;
		int sale = 0;
		int i = 0;
		
		do{
			System.out.print("ID? ");
			num = input.nextInt();
			if (num >=1000 && num<=8000) break;
			
			System.out.print("Sale? ");
			sale = input.nextInt();
			if(sale<0) break;
			
			if (i >= purchases.length) break;
			
			Purchase a = new Purchase();
			a.setInv(num);
			a.setSale(sale);
			purchases[i] = a;
			i++;
			
		}while(true);
		
		for(int p = 0;p<purchases.length;p++) {
			if(purchases[p] !=null) { //point
				purchases[p].display();
				}else {
					System.out.println("No data");
				}
		
	}

}
}