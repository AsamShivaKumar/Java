package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Frame5 {

	private JFrame frame5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5 window = new Frame5();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		JLabel welcomeMsg = new JLabel("Welcome!");
		welcomeMsg.setFont(new Font("Candara", Font.PLAIN, 23));
		welcomeMsg.setBounds(122, 55, 247, 58);
		frame5.getContentPane().add(welcomeMsg);
		
		JButton logout = new JButton("Log-out");
		logout.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		logout.setBounds(155, 123, 140, 35);
		frame5.getContentPane().add(logout);
	}

}
