package lab11;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BookGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFiction;
	private JTextField txtNonfiction;
	private JButton btnDisplay;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookGUI frame = new BookGUI();
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
	public BookGUI() {
		displayHandling();
		dataHandling();
	}

	private void dataHandling() {
		Fiction[] lists = new Fiction[4];
		NonFiction[] nlists = new NonFiction[4];
		final int[] index = { 0 };
		final int i = 0; // this does not work, because lambda only accept final, but final cannot be changed like i++.
		// only the solution is use array. Somehow, it is mutable.

		btnDisplay.addActionListener(e -> {
			try {

				if (index[0] < lists.length) {
					String fic = txtFiction.getText().trim();
					String nfic = txtNonfiction.getText().trim();

					lists[index[0]] = new Fiction(fic);
					nlists[index[0]] = new NonFiction(nfic);
					
					txtFiction.setText("");
					txtNonfiction.setText("");
					System.out.println(index[0]);

					index[0]++;

				} else {
					JOptionPane.showMessageDialog(null, "Book limit reached.");
				}

			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, ex);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
		});

		btnExit.addActionListener(e -> {
			// Print all book data when exiting

			// System.out.println("Fiction Books:");
			for (Fiction book : lists) {
				if (book != null) {
					// System.out.println(book.getbTitle() + " - $" + book.getbPrice());
					dbBook database = new dbBook(book.getbTitle(), book.getbPrice(), "Fiction");
					database.insertTable();
				}
			}

			// System.out.println("Non-Fiction Books:");
			for (NonFiction book : nlists) {
				if (book != null) {
					dbBook database = new dbBook(book.getbTitle(), book.getbPrice(), "NonFiction");
					database.insertTable();
					// System.out.println(book.getbTitle() + " - $" + book.getbPrice());
				}
			}
			dbBook dbdis = new dbBook();
			dbdis.displayTable();
			
			System.exit(0);
		});

	}

	private void displayHandling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFiction = new JTextField();
		txtFiction.setBounds(30, 0, 315, 67);
		contentPane.add(txtFiction);
		txtFiction.setColumns(10);

		txtNonfiction = new JTextField();
		txtNonfiction.setBounds(30, 79, 317, 71);
		contentPane.add(txtNonfiction);
		txtNonfiction.setColumns(10);

		JTextArea txtrNonfiction = new JTextArea();
		txtrNonfiction.setText("NonFiction");
		txtrNonfiction.setBounds(409, 28, 0, 19);
		contentPane.add(txtrNonfiction);

		btnDisplay = new JButton("Display");
		btnDisplay.setBounds(30, 162, 154, 42);
		contentPane.add(btnDisplay);

		btnExit = new JButton("Exit");
		btnExit.setBounds(196, 162, 149, 42);
		contentPane.add(btnExit);
	}

}
