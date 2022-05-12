package oopsLab.guiAssignment.assign1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField rollField;
	private JTextField nameField;
	private JTextField idField;
	private JTable table;
	private JScrollPane sp;
	private JTable table_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Registration() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 686, 36);
		panel1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel1);
		
		JLabel title = new JLabel("Student Registration Form");
		title.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(Color.LIGHT_GRAY);
		panel1.add(title);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel2);
		panel2.setBounds(66,100,310,377);
		panel2.setLayout(null);
		
		JLabel rollNo = new JLabel("Roll Number:");
		rollNo.setBounds(20, 66, 89, 19);
		rollNo.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		panel2.add(rollNo);
		
		rollField = new JTextField();
		rollField.setBounds(119, 60, 136, 25);
		rollField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(rollField);
		rollField.setColumns(10);
		
		JLabel name = new JLabel("Name\r\n:");
		name.setBounds(67, 108, 42, 19);
		name.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		panel2.add(name);
		
		nameField = new JTextField();
		nameField.setBounds(119, 102, 136, 25);
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(nameField);
		nameField.setColumns(10);
		
		JLabel id = new JLabel("IDProof:");
		id.setBounds(55, 148, 69, 19);
		id.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		panel2.add(id);
		
		idField = new JTextField();
		idField.setBounds(119, 142, 136, 25);
		idField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(idField);
		idField.setColumns(10);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 532, 686, 31);
		frame.getContentPane().add(panel4);
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton addRecord = new JButton("Add Record");
		addRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel f=(DefaultTableModel) table_1.getModel();
				
				f.addRow(new Object[] {rollField.getText(),nameField.getText(),idField.getText()});
				rollField.setText("");
				nameField.setText("");
				idField.setText("");
			}
		});
		panel4.add(addRecord);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
					rollField.setText("");
					nameField.setText("");
					idField.setText("");
			  }
		});
		panel4.add(reset);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel f=(DefaultTableModel) table_1.getModel();
				int exists=0,row=0;
				for(int i=0 ;i<f.getRowCount();i++)
				{
					if(f.getValueAt(0, i).equals(rollField.getText()))
					{
						exists=1;
						row=i;
						break;
					}
				}
				rollField.setText("");
				nameField.setText("");
				idField.setText("");
				
				if(exists==0)
				{
					JOptionPane.showMessageDialog(null, "RollNo doesn't exits!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Entry deleted!");
					f.removeRow(row);
				}
			}
		});
		panel4.add(delete);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel4.add(exit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(423, 113, 237, 364);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 237, 364);
		panel_1.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"RollNo", "Name", "IDProof"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class
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
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		scrollPane.setViewportView(table_1);
		

	}
}
