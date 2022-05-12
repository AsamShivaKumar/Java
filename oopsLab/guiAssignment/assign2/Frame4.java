package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Frame4 {

	private JFrame frame4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 window = new Frame4();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel rgstSucc = new JLabel("Name registered Succesfully!");
		rgstSucc.setFont(new Font("Candara", Font.PLAIN, 24));
		rgstSucc.setBounds(77, 23, 306, 129);
		frame4.getContentPane().add(rgstSucc);
		
		JButton signInf4 = new JButton("SignIn");
		signInf4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		signInf4.setBounds(170, 118, 127, 51);
		frame4.getContentPane().add(signInf4);
	}

}
