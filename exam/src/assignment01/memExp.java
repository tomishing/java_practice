package assignment01;

public class memExp extends Exception {
	memExp() {
		super("invalid range");
	}

	public static boolean isValidid(int id) {
		if (id > 999 && id < 10000)
			return true;
		else
			return false;
	}
}
