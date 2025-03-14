package chapter02;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class exc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int NUMBER_OF_QUARTS = 4;
//		int quartsNeeded = 18;
		String NUMBER_OF_QUARTS, quartsNeeded; 
		NUMBER_OF_QUARTS = JOptionPane.showInputDialog(null, "The number of Quarts?");
		quartsNeeded = JOptionPane.showInputDialog(null, "How much quarts are needed?");
		JOptionPane.showMessageDialog(null, "A job that needs " 
				+ quartsNeeded + " quarts requires " 
				+ NUMBER_OF_QUARTS + " plus 2 quarts.");
		
	}

}
