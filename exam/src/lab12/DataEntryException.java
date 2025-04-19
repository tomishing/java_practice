package lab12;

public class DataEntryException extends Exception {
	DataEntryException(){
		super("Invalid");
	}
	
	public static boolean isRange(int id) {
		if (id >= 0 && id <=999) return true; 
		else return false;
	}
	
}
