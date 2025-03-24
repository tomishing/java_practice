package chap09;

import java.util.Scanner;

public class DemoTurner {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1-3 >> ");
		int a = input.nextInt();
		Leaf le = new Leaf();
		Page pa = new Page();
		Pancake pk = new Pancake();

		switch (a) {
		case 1 -> le.turn();
		case 2 -> pa.turn();
		case 3 -> pk.turn();
		default -> System.out.println("Wrong number");
		}

	}

}
