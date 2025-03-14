package Chapter08;
import java.util.Arrays;

public class sortTest {
	enum Month{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {4,5,2,10,50,3,4,7};
		
		System.out.println(Arrays.toString(test));
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.binarySearch(test,10));
		
		Month mon = Month.APR;
		System.out.println(mon.toString());
		System.out.println(mon.ordinal());
		String mon01 = "APR";
		
		if (mon.name().equals(mon01)) 
			System.out.println("TRUE");
		else {
			System.out.println(mon.toString());
			System.out.println("FALSE");
		}
		
		String mon02 = "MAR";
		
		if (mon.name().compareTo(mon02) < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
		
		System.out.println(mon.valueOf(mon02));
		System.out.println(mon.values());
		
	}

}
