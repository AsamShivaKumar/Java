package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Frame3 {

	private JFrame frame3;
	private JTextField unameFieldf3;
	private JPasswordField passwordFieldf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel unamef3 = new JLabel("User-name:");
		unamef3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		unamef3.setBounds(76, 47, 111, 44);
		frame3.getContentPane().add(unamef3);
		
		JLabel passf3 = new JLabel("Password:");
		passf3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		passf3.setBounds(76, 101, 111, 44);
		frame3.getContentPane().add(passf3);
		
		unameFieldf3 = new JTextField();
		unameFieldf3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		unameFieldf3.setBounds(197, 61, 157, 25);
		frame3.getContentPane().add(unameFieldf3);
		unameFieldf3.setColumns(10);
		
		JButton signInf3 = new JButton("SignIn");
		signInf3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signInf3.setBounds(232, 165, 122, 33);
		frame3.getContentPane().add(signInf3);
		
		passwordFieldf3 = new JPasswordField();
		passwordFieldf3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordFieldf3.setBounds(197, 112, 157, 25);
		frame3.getContentPane().add(passwordFieldf3);
	}

}
