package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class Frame6 {

	private JFrame frame6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6 window = new Frame6();
					window.frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame6 = new JFrame();
		frame6.setBounds(100, 100, 450, 300);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		
		JButton tryAgainBtn = new JButton("Try Again!");
		tryAgainBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tryAgainBtn.setBounds(145, 152, 157, 46);
		frame6.getContentPane().add(tryAgainBtn);
		
		JLabel lblNewLabel = new JLabel("Wrong username/password!");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 23));
		lblNewLabel.setBounds(63, 90, 324, 52);
		frame6.getContentPane().add(lblNewLabel);
	}

}
