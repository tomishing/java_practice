package chapter01;
import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + input + "!");
	}

}
