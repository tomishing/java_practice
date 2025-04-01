package chap09;

import java.util.Scanner;

public class DemoCandleN {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		ScentedCandleN scent = new ScentedCandleN();
		CandleN candle = new CandleN();
		
		System.out.print("Color >> ");
		String col = input.nextLine();
		
		System.out.print("Height >> ");
		double h = input.nextDouble();
		input.nextLine();
		System.out.print("Scent >> ");
		String sc = input.nextLine();
		
		scent.setColor(col);
		scent.setHeight(h);
		scent.setScent(sc);
		
		System.out.println("Color: " + scent.getColor());
		System.out.println("Height: " + scent.getHeight());
		System.out.println("Color: " + scent.getScent());
		System.out.println("Price: " + scent.getPrice());
		System.out.println("Price (Scent): " + scent.calcPrice());
		System.out.println("Price (origi): " + candle.calcPrice());
	}

}
