package lab11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class RentalRoom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextArea textArea = new JTextArea();
	private final ButtonGroup btnLoc = new ButtonGroup();
	private final ButtonGroup btnBed = new ButtonGroup();
	private JButton btnExit;
	private JButton btnCalc;
	private JRadioButton rbtOne;
	private JRadioButton rbtTwo;
	private JRadioButton rbtThree;
	private JRadioButton rbtPark;
	private JRadioButton rbtPool;
	private JRadioButton rbtLake;
	private JCheckBox chckbxMeal;

	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentalRoom frame = new RentalRoom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// constructor
	public RentalRoom() {
		setTitle("Lambert's Vacation Rentals");
		layoutComp();
		dataHandling();
	}

	// methods
	private void dataHandling() {

		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("result.txt", true);
					PrintWriter pw = new PrintWriter(fw);
					
					int room = 0;
					int bed = 0;
					int meal = 0;
					String roomN = null;
					String bedN = null;
					String mealN = null;
					
					if (rbtPark.isSelected()) {
						room = 600;
						roomN = "Parkside";
					}
					if (rbtPool.isSelected()) {
						room = 750;
						roomN = "Poolside";
					}
					if (rbtLake.isSelected()) {
						room = 825;
						roomN = "Lakeside";
					}
					if (rbtOne.isSelected()) {
						bed = 0;
						bedN = "One";
					}
					if (rbtTwo.isSelected()) {
						bed = 75;
						bedN = "Two";
					}
					if (rbtThree.isSelected()) {
						bed = 75 * 2;
						bedN = "Three";
					}
					if (chckbxMeal.isSelected()) {
						mealN = "Yes";
						meal = 200;
					}
				
					calcRent total = new calcRent(room, bed, meal);
					JOptionPane.showMessageDialog(null, total.display());
					pw.println("Room type: " + roomN + ", Bed = " + bedN + ", meal: " + meal + " " +  total.display());
					pw.close();

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, ex);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});

		// You have to add actions for clicking the exit button
		btnExit.addActionListener(e -> System.exit(0));

	}

	private void layoutComp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		rbtOne = new JRadioButton("One");
		btnBed.add(rbtOne);

		rbtTwo = new JRadioButton("Two beds");
		btnBed.add(rbtTwo);

		rbtThree = new JRadioButton("Three beds");
		btnBed.add(rbtThree);

		chckbxMeal = new JCheckBox("Meal");

		btnCalc = new JButton("Calc");
		btnExit = new JButton("Exit");

		rbtPark = new JRadioButton("Parkside");
		btnLoc.add(rbtPark);

		rbtPool = new JRadioButton("Poolside");
		btnLoc.add(rbtPool);

		rbtLake = new JRadioButton("Lakeside");
		btnLoc.add(rbtLake);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(140).addComponent(btnCalc))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(rbtPool)
										.addComponent(rbtLake).addComponent(rbtPark).addComponent(chckbxMeal))))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(44)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(rbtThree)
										.addComponent(rbtTwo).addComponent(rbtOne)))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(46).addComponent(btnExit)))
				.addGap(97)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(21)
						.addGroup(
								gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(
												gl_contentPane
														.createSequentialGroup()
														.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 0,
																GroupLayout.PREFERRED_SIZE)
														.addGap(72))
										.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
												.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup().addComponent(rbtOne)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(rbtTwo)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(rbtThree))
												.addGroup(gl_contentPane.createSequentialGroup().addComponent(rbtPark)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(rbtPool)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(rbtLake)))
												.addGap(18)))
						.addGap(31)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnCalc)
								.addComponent(btnExit))
						.addContainerGap(134, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(106, Short.MAX_VALUE).addComponent(chckbxMeal).addGap(177)));
		contentPane.setLayout(gl_contentPane);

	}
}
