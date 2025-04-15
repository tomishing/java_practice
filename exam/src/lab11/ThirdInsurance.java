package lab11;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ThirdInsurance extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtOption;
	private JRadioButton rdHmo;
	private JRadioButton rdPpo;
	private JCheckBox chDental;
	private JCheckBox chVision;
	private JButton btnCalc;
	private JButton btnExit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdInsurance frame = new ThirdInsurance();
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
	public ThirdInsurance() {
		setTitle("Insurance");
		layoutPanel();
		handlingData();
	}

	private void handlingData() {
		btnCalc.addActionListener(e -> {
			try {
				String ins = null;
				int cost = 0;
				int cost1 = 0, cost2 = 0;
				boolean op = false;
				boolean op1 = false;
				if(rdHmo.isSelected()) {
					ins = "HMO";
					cost = 200;
				}
				if(rdPpo.isSelected()) {
					ins = "Ppo";
					cost = 600;
				}
				if(chDental.isSelected()) {
					op = true;
					cost1 = 75;
				}else {
					op = false;
					cost1 = 0;
				}
				if(chVision.isSelected()) {
					op1 = true;
					cost2 = 20;
				}
				else {
					op1 = false;
					cost2 = 0;
				}
				
				calcTotalCost result = new calcTotalCost(ins, cost, op, op1);
				JOptionPane.showMessageDialog(null, result.display());
				
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		});
		btnExit.addActionListener(e -> System.exit(0));
	}

	private void layoutPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		rdHmo = new JRadioButton("HMO");
		buttonGroup.add(rdHmo);
		rdHmo.setBounds(136, 8, 149, 23);
		contentPane.add(rdHmo);

		rdPpo = new JRadioButton("PPO");
		buttonGroup.add(rdPpo);
		rdPpo.setBounds(136, 35, 149, 23);
		contentPane.add(rdPpo);

		chDental = new JCheckBox("Dental");
		chDental.setBounds(140, 97, 129, 23);
		contentPane.add(chDental);

		chVision = new JCheckBox("Vision");
		chVision.setBounds(140, 113, 129, 23);
		contentPane.add(chVision);

		txtOption = new JTextField();
		txtOption.setBackground(new Color(246, 245, 244));
		txtOption.setText("Option");
		txtOption.setBounds(146, 66, 114, 19);
		contentPane.add(txtOption);
		txtOption.setColumns(10);

		btnCalc = new JButton("Calc");
		btnCalc.setBounds(82, 144, 117, 25);
		contentPane.add(btnCalc);

		btnExit = new JButton("Exit");
		btnExit.setBounds(225, 144, 117, 25);
		contentPane.add(btnExit);
	}
}
