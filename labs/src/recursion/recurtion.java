package recursion;

public class recurtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 6;
		System.out.println("The answer is " + Power(a,b));
		System.out.println("The addition is " + Addition(a,b));
		System.out.println("The string is " + displayRowOfCharacters('*', 10));

	}
	public static int Power(int a, int b) {
		if (b == 0) return 1;
		return a * Power(a, b-1);
	}
	public static int Addition(int a, int b) {
		if (b == 0) return 0;
		return a + Addition(a, b-1);
	}
	public static String displayRowOfCharacters(char c, int d) {
		if (d == 1) return Character.toString(c);  //
		return c + displayRowOfCharacters(c, d -1);
	}

}
