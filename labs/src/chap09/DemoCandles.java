package chap09;

import java.util.Scanner;

public class DemoCandles {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candle candle = new Candle();
		ScentedCandle scandle = new ScentedCandle();
		
		System.out.print("Color >> ");
		String cc = capitalize(input.nextLine());
		System.out.print("Height >> ");
		Double hh = input.nextDouble();
		input.nextLine();
		System.out.print("Scent >> ");
		System.out.println("Lavender, Coconut, Lime, Cucumber");
		String ss = capitalize(input.nextLine());
		
		candle.setColor(cc);
		scandle.setHeight(hh);
		scandle.setScent(ss);
		
		System.out.println("\n**** Detail ****");
		System.out.println("Color: " + candle.getColor());
		System.out.println("Height: " + scandle.getHeight() + " inch");
		System.out.println("Scent: " + scandle.getScent());
		System.out.println("Price: " + scandle.getPrice() + " CAD");
		
	}
	public static String capitalize(String inputString) {
		if(inputString == null || inputString.isEmpty()) 
			return inputString;
		
		char firstLetter = inputString.charAt(0);
		char firstCap = Character.toUpperCase(firstLetter);
		return firstCap + inputString.substring(1);
		
	}

}
