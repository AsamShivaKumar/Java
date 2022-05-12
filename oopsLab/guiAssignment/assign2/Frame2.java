package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Frame2 {

	private JFrame frame2;
	private JTextField nameField;
	private JTextField unameField;
	private JPasswordField passwordField;
	private JButton backf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 500, 400);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		name.setBounds(145, 85, 114, 47);
		frame2.getContentPane().add(name);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		nameField.setBounds(259, 99, 150, 19);
		frame2.getContentPane().add(nameField);
		nameField.setColumns(20);
		
		unameField = new JTextField();
		unameField.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		unameField.setColumns(20);
		unameField.setBounds(259, 148, 150, 19);
		frame2.getContentPane().add(unameField);
		
		JLabel userName = new JLabel("User-name:");
		userName.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		userName.setBounds(145, 134, 114, 47);
		frame2.getContentPane().add(userName);
		
		JLabel pass = new JLabel("Password:");
		pass.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		pass.setBounds(145, 175, 114, 47);
		frame2.getContentPane().add(pass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(259, 189, 150, 19);
		frame2.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnNewButton.setBounds(284, 228, 125, 35);
		frame2.getContentPane().add(btnNewButton);
		
		backf2 = new JButton("Back");
		backf2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		backf2.setBounds(201, 228, 85, 35);
		frame2.getContentPane().add(backf2);
	}
}
