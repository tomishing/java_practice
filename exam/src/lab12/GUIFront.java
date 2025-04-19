package lab12;

import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUIFront extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblName;
	private JCheckBox chBreakfast;
	private JRadioButton rdLakeSide;
	private JRadioButton rdMountain;
	private JComboBox cmbEthnic;
	private JList listProvince;
	private JButton btnEn;
	private JButton btnExit;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFront frame = new GUIFront();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUIFront() {
		dataFrame();
		dataHandling();
	}

	private void dataHandling() {
		Khmu[] khs = new Khmu[4];
		Yang[] yas = new Yang[4];
		final int[] index = { 0 };
		btnEn.addActionListener(e -> {
			try {
				if (index[0] < khs.length) {
					boolean breakF = false;
					String room = null;

					String id = txtID.getText().trim();
					int idi = Integer.parseInt(id);
					try {
						if (!DataEntryException.isRange(idi))
							throw new DataEntryException();
					} catch (DataEntryException ed) {
						JOptionPane.showMessageDialog(null, "Out of the Range: " + ed.getMessage());
					}
					if (chBreakfast.isSelected()) breakF = true;	
					if (rdLakeSide.isSelected()) room = "Lake";
					if (rdMountain.isSelected()) room = "Mountain";
					String ethnic = cmbEthnic.getSelectedItem().toString();
					String prov = listProvince.getSelectedValue().toString();
					if (ethnic.equals("Khmu")) {
						khs[index[0]] = new Khmu(idi, room, breakF, prov);
					} else {
						yas[index[0]] = new Yang(idi, room, breakF, prov);
					}

					txtID.setText("");
					index[0]++;
				} else {
					JOptionPane.showMessageDialog(null, "Booking limit reached.");
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}

		});
		btnExit.addActionListener(e -> {
			for (Yang ya: yas) {
				if (ya != null) {
					dbLaos database = new dbLaos(ya.getMember(),ya.getRoom(),ya.isBreakfast(),ya.getKhao(),ya.getProvince());
					database.insertTable();
				}
			}
			for (Khmu kh: khs) {
				if (kh != null) {
					dbLaos database = new dbLaos(kh.getMember(),kh.getRoom(),kh.isBreakfast(),kh.getKhao(),kh.getProvince());
					database.insertTable();
				}
			}
			System.exit(0);
		});

	}

	private void dataFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtID = new JTextField();
		txtID.setBounds(144, 62, 114, 19);
		contentPane.add(txtID);
		txtID.setColumns(10);

		lblName = new JLabel("ID");
		lblName.setBounds(88, 64, 70, 15);
		contentPane.add(lblName);

		chBreakfast = new JCheckBox("Breakfast");
		chBreakfast.setBounds(144, 91, 129, 23);
		contentPane.add(chBreakfast);

		rdLakeSide = new JRadioButton("LakeSide");
		buttonGroup.add(rdLakeSide);
		rdLakeSide.setBounds(147, 132, 149, 23);
		contentPane.add(rdLakeSide);

		rdMountain = new JRadioButton("MountainView");
		buttonGroup.add(rdMountain);
		rdMountain.setBounds(147, 159, 149, 23);
		contentPane.add(rdMountain);

		cmbEthnic = new JComboBox();
		cmbEthnic.setModel(new DefaultComboBoxModel(new String[] { "Khmu", "Yang" }));
		cmbEthnic.setBounds(144, 209, 152, 37);
		contentPane.add(cmbEthnic);

		listProvince = new JList();
		listProvince.setModel(new AbstractListModel() {
			String[] values = new String[] { "Oudomxay", "Luang Nam Tha", "Luang Prabang", "Phongsaly" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listProvince.setBounds(342, 209, 207, 73);
		contentPane.add(listProvince);

		btnEn = new JButton("Enter");
		btnEn.setBounds(141, 328, 117, 25);
		contentPane.add(btnEn);

		btnExit = new JButton("Exit");
		btnExit.setBounds(288, 328, 117, 25);
		contentPane.add(btnExit);

	}
}
