import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assign1 {

	private JFrame frame;
	private JTextField textroll;
	private JTextField textname;
	private JTextField textprov;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assign1 window = new Assign1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assign1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1032, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 29, 1070, 615);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 25, 1018, 116);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel p1label1 = new JLabel("STUDENT REGISTRATION SYSTEM");
		p1label1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		p1label1.setBounds(210, 24, 616, 50);
		panel_1.add(p1label1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(27, 473, 1018, 116);
		panel.add(panel_4);
		panel_4.setLayout(null);
		

		JButton btnAddRec = new JButton("ADD RECORD");
		btnAddRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tab = (DefaultTableModel)table.getModel();
				tab.addRow(new Object [] {(Integer.parseInt(textroll.getText())),textname.getText(),textprov.getText()});
			}
		});
		btnAddRec.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddRec.setBounds(42, 31, 163, 48);
		panel_4.add(btnAddRec);
		
		JButton btnresest = new JButton("RESET");
		btnresest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textroll.setText("");
				textname.setText("");
				textprov.setText("");
			}
		});
		btnresest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnresest.setBounds(289, 31, 163, 48);
		panel_4.add(btnresest);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tab = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>0) {
					tab.removeRow(i);
				}
				else {
					JOptionPane.showConfirmDialog(btnDelete, "DELETE ERROR ");
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelete.setBounds(556, 31, 163, 48);
		panel_4.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(793, 31, 163, 48);
		panel_4.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(27, 171, 500, 260);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel p2lblRoll = new JLabel("ROLL NO");
		p2lblRoll.setHorizontalAlignment(SwingConstants.CENTER);
		p2lblRoll.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p2lblRoll.setBounds(31, 40, 160, 32);
		panel_2.add(p2lblRoll);
		
		textroll = new JTextField();
		textroll.setBounds(219, 47, 189, 26);
		panel_2.add(textroll);
		textroll.setColumns(10);
		
		textname = new JTextField();
		textname.setColumns(10);
		textname.setBounds(219, 112, 189, 26);
		panel_2.add(textname);
		
		textprov = new JTextField();
		textprov.setColumns(10);
		textprov.setBounds(219, 174, 189, 26);
		panel_2.add(textprov);
		
		JLabel p2lblName = new JLabel("NAME");
		p2lblName.setHorizontalAlignment(SwingConstants.CENTER);
		p2lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p2lblName.setBounds(31, 105, 160, 32);
		panel_2.add(p2lblName);
		
		JLabel p2lblId = new JLabel("PROVE OF ID");
		p2lblId.setHorizontalAlignment(SwingConstants.CENTER);
		p2lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p2lblId.setBounds(31, 167, 160, 32);
		panel_2.add(p2lblId);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(545, 171, 500, 260);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 60, 53, -22);
		panel_3.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 32, 309, 110);
		panel_3.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ROLL NO", "NAME", "PROVE OF ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		table.getColumnModel().getColumn(1).setPreferredWidth(113);
		table.getColumnModel().getColumn(2).setPreferredWidth(104);
		scrollPane_1.setViewportView(table);
	}
}
