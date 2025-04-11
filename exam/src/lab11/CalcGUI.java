package lab11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalcGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField txtSecond;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI frame = new CalcGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcGUI() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JTextField automatically generated.
		txtFirst = new JTextField();
		txtFirst.setBounds(99, 12, 114, 19);
		contentPane.add(txtFirst);
		txtFirst.setColumns(10);

		txtSecond = new JTextField();
		txtSecond.setBounds(99, 43, 114, 19);
		contentPane.add(txtSecond);
		txtSecond.setColumns(10);

		// JButton automatically generated.
		JButton bntCalc = new JButton("Add");
		bntCalc.setBounds(62, 104, 117, 25);
		contentPane.add(bntCalc);

		// You have to write the code below. Click the button and actions.
		bntCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String a = txtFirst.getText();
					int a1 = Integer.parseInt(a);
					String b = txtSecond.getText();
					int b1 = Integer.parseInt(b);
					int sum = a1 + b1;
					// JOptionPane.showMessageDialog(null, sum);
					
					Addition addClass = new Addition(a1, b1);
					JOptionPane.showMessageDialog(null, addClass.resultCalc());

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});

		// JButton automatically generated.
		JButton btnClose = new JButton("Exit");
		btnClose.setBounds(206, 104, 117, 25);
		contentPane.add(btnClose);

		// You have to add actions for clicking the exit button
		btnClose.addActionListener(e -> System.exit(0));

	}
}
