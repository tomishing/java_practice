package chap09;

import java.util.Scanner;

public class UseGeometric2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricFigure2[] figs = new GeometricFigure2[5];
		int n;
		double h, w;
		for (int i = 0; i < figs.length; ++i) {
			System.out.print("Square (1) or Triangle (2)? >> ");
			n = input.nextInt();
			System.out.print("Height >> ");
			h = input.nextDouble();
			System.out.print("Width >> ");
			w = input.nextDouble();

			switch (n) {
			case 1:
				figs[i] = new Square2(h, w);
				break;
			case 2:
				figs[i] = new Triangle2(h, w);
				break;
			default:
				System.out.println("Enter 1 or 2");
			}
			input.nextLine();
		}

		for (GeometricFigure2 fig : figs) {
			System.out.println(fig.getFigure() + " " + fig.getHeight() + " " + fig.getWidth() + " " + fig.calcArea2());
			fig.displaySides();
		}

	}

}
