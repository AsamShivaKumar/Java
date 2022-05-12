package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Frame7 {

	private JFrame frame7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame7 window = new Frame7();
					window.frame7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame7 = new JFrame();
		frame7.setBounds(100, 100, 450, 300);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(null);
		
		JLabel alreadyExists = new JLabel("This username is already taken!");
		alreadyExists.setFont(new Font("Candara", Font.PLAIN, 24));
		alreadyExists.setBounds(65, 62, 321, 62);
		frame7.getContentPane().add(alreadyExists);
		
		JButton tryAgainBtnf7 = new JButton("Try Again");
		tryAgainBtnf7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tryAgainBtnf7.setBounds(145, 113, 148, 45);
		frame7.getContentPane().add(tryAgainBtnf7);
	}

}
