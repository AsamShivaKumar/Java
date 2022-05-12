package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;

public class swingApplication {

	private JFrame frame;
	private JTextField nameField;
	private JLabel message;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingApplication window = new swingApplication();
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
	public swingApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 450, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Registration Form");
		JLabel nameLabel = new JLabel("Name:\r\n");
		nameLabel.setForeground(new Color(95, 158, 160));
		nameLabel.setBackground(new Color(255, 192, 203));
		nameLabel.setBounds(73, 77, 67, 49);
		nameLabel.setFont(new Font("Magneto", Font.PLAIN, 18));
		frame.getContentPane().add(nameLabel);
		
		nameField = new JTextField();
		nameField.setForeground(new Color(0, 139, 139));
		nameField.setFont(new Font("Georgia", Font.PLAIN, 20));
		nameField.setBackground(new Color(135, 206, 235));
		nameField.setBounds(164, 85, 185, 26);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JButton okay = new JButton("Submit");
		okay.setBackground(new Color(0, 139, 139));
		okay.setFont(new Font("Magneto", Font.PLAIN, 22));
		okay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   String name = nameField.getText();
				   message.setText("Registration completed!");
				   frame.getContentPane().removeAll();
				   frame.getContentPane().add(message);
				   frame.repaint();
			}
		});
		okay.setBounds(169, 341, 130, 38);
		frame.getContentPane().add(okay);
		
		JLabel title = new JLabel("Registration Form");
		title.setFont(new Font("Book Antiqua", Font.PLAIN, 24));
		title.setBounds(111, 24, 224, 49);
		frame.getContentPane().add(title);
		
		address = new JTextField();
		address.setForeground(new Color(0, 139, 139));
		address.setFont(new Font("Georgia", Font.PLAIN, 20));
		address.setColumns(10);
		address.setBackground(new Color(135, 206, 235));
		address.setBounds(164, 135, 185, 26);
		frame.getContentPane().add(address);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setForeground(new Color(95, 158, 160));
		addressLabel.setFont(new Font("Magneto", Font.PLAIN, 18));
		addressLabel.setBackground(new Color(255, 192, 203));
		addressLabel.setBounds(42, 127, 112, 49);
		frame.getContentPane().add(addressLabel);
		
		JLabel sexLabel = new JLabel("Sex:");
		sexLabel.setForeground(new Color(95, 158, 160));
		sexLabel.setFont(new Font("Magneto", Font.PLAIN, 18));
		sexLabel.setBackground(new Color(255, 192, 203));
		sexLabel.setBounds(87, 165, 67, 49);
		frame.getContentPane().add(sexLabel);
		
		JRadioButton maleBtn = new JRadioButton("Male");
		maleBtn.setBounds(164, 179, 55, 21);
		frame.getContentPane().add(maleBtn);
		
		JRadioButton femaleBtn = new JRadioButton("Female");
		femaleBtn.setBounds(221, 179, 67, 21);
		frame.getContentPane().add(femaleBtn);
		
		JRadioButton transBtn = new JRadioButton("Trans");
		transBtn.setBounds(290, 179, 59, 21);
		frame.getContentPane().add(transBtn);
		
		JLabel courseLabel = new JLabel("Course:");
		courseLabel.setForeground(new Color(95, 158, 160));
		courseLabel.setFont(new Font("Magneto", Font.PLAIN, 18));
		courseLabel.setBackground(new Color(255, 192, 203));
		courseLabel.setBounds(58, 202, 96, 49);
		frame.getContentPane().add(courseLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "EEE", "MECH", "CIVIL", "BIO", "CHEM"}));
		comboBox.setBounds(164, 216, 64, 21);
		frame.getContentPane().add(comboBox);
		
//		JLabel resultLabel = new JLabel("Message:\r\n");
//		resultLabel.setForeground(new Color(95, 158, 160));
//		resultLabel.setFont(new Font("Magneto", Font.PLAIN, 20));
//		resultLabel.setBounds(64, 230, 136, 54);
//		frame.getContentPane().add(resultLabel);
		
		message = new JLabel("");
		message.setBackground(new Color(150, 255, 255));
		message.setBounds(100, 245, 1000, 26);
		message.setFont(new Font("Magneto", Font.PLAIN, 20));
	}
}
