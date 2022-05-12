package oopsLab.guiAssignment.assign2;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	public static ArrayList<User> users = new ArrayList<>();
	static class User{
		   String name,uname,pass;
		   
		   User(String name,String uname,String pass){
			   this.name = name;
			   this.uname = uname;
			   this.pass = pass;
		   }
	}
	
	public static boolean addUser(String name, String uname, String pass) {
		   
		for(User u: users) if(u.uname.equals(uname)) return false;
		
		User u = new User(name,uname,pass);
		users.add(u);		
		return true;
	}
	
	public static String checkUser(String uname,String pass) {
		   
		   for(User u: users) if(u.uname.equals(uname) && u.pass.equals(pass)) return u.name;
		   return "-1";
	}
	
	private JFrame frame;
	private JFrame frame2;
	private JTextField nameField;
	private JTextField unameField;
	private JPasswordField passwordField;
	private JFrame frame3;
	private JTextField unameFieldf3;
	private JPasswordField passwordFieldf3;
	private JButton backf2;
	private JFrame frame4;
	private JButton signInf4;
	private JFrame frame5;
	private JLabel welcomeMsg;
	private JFrame frame6;
	private JButton tryAgainBtn;
	private JFrame frame7;
	private JButton tryAgainBtnf7;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Frame1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton signUpButton = new JButton("SignUp");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signUpButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signUpButton.setBounds(73, 114, 127, 45);
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame2.setVisible(true);
			}
		});
		frame.getContentPane().add(signUpButton);
		
		JButton signInBtn = new JButton("SignIn");
		signInBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signInBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   frame.setVisible(false);
				   frame3.setVisible(true);
			}
		});
		signInBtn.setBounds(268, 114, 110, 45);
		frame.getContentPane().add(signInBtn);
		
		
		// frame2
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
		
		JButton signUpf2 = new JButton("SignUp");
		signUpf2.addActionListener(new ActionListener() {
			     public void actionPerformed(ActionEvent e) {
		    	    	frame2.setVisible(false);
			    	    if(addUser(nameField.getText(), unameField.getText(),passwordField.getText())) {
			    	    	frame4.setVisible(true);
			    	    	System.out.println("Successfully created an account");
			    	    }else {
			    	    	frame7.setVisible(true);
			    	    }
		    	    	nameField.setText("");
		    	    	unameField.setText("");
		    	    	passwordField.setText("");
			     }
		});
		signUpf2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		signUpf2.setBounds(284, 228, 125, 35);
		frame2.getContentPane().add(signUpf2);
		
		
		backf2 = new JButton("Back");
		backf2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		backf2.setBounds(201, 228, 85, 35);
		backf2.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   frame.setVisible(true);
				   frame2.setVisible(false);
			   }
		});
		frame2.getContentPane().add(backf2);
		
		
		// frame 3
		
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
		
		passwordFieldf3 = new JPasswordField();
		passwordFieldf3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordFieldf3.setBounds(197, 112, 157, 25);
		frame3.getContentPane().add(passwordFieldf3);
		
		JButton signInf3 = new JButton("SignIn");
		signInf3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signInf3.setBounds(232, 165, 122, 33);
		frame3.getContentPane().add(signInf3);
		
		signInf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = checkUser(unameFieldf3.getText(),passwordFieldf3.getText());
				frame3.setVisible(false);
				if(!name.equals("-1")) {
					System.out.println("Successfully signed-in!");
					welcomeMsg.setText("Welcome " + name + "!");
					frame5.setVisible(true);				
				}else {
				   passwordFieldf3.setText("");
				   frame6.setVisible(true);
				}
				unameFieldf3.setText("");
				passwordFieldf3.setText("");
			}
		});
		
		// frame4
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel rgstSucc = new JLabel("Name registered Succesfully!");
		rgstSucc.setFont(new Font("Candara", Font.PLAIN, 24));
		rgstSucc.setBounds(77, 23, 306, 129);
		frame4.getContentPane().add(rgstSucc);
		
		signInf4 = new JButton("SignIn");
		signInf4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		signInf4.setBounds(170, 118, 127, 51);
		frame4.getContentPane().add(signInf4);
		
		signInf4.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				      frame4.setVisible(false);
				      frame3.setVisible(true);
			   }
		});
		
		//frame5
		frame5 = new JFrame();
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		welcomeMsg = new JLabel("Welcome!");
		welcomeMsg.setFont(new Font("Candara", Font.PLAIN, 23));
		welcomeMsg.setBounds(145, 77, 247, 58);
		frame5.getContentPane().add(welcomeMsg);
		
		JButton logout = new JButton("Log-out");
		logout.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		logout.setBounds(155, 123, 140, 35);
		frame5.getContentPane().add(logout);
		
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   frame5.setVisible(false);
				   frame.setVisible(true);
			}
		});
		
		//frame6
		frame6 = new JFrame();
		frame6.setBounds(100, 100, 450, 300);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		
		tryAgainBtn = new JButton("Try Again!");
		tryAgainBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tryAgainBtn.setBounds(145, 152, 157, 46);
		frame6.getContentPane().add(tryAgainBtn);
		
		tryAgainBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6.setVisible(false);
				frame3.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Wrong username/password!");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 23));
		lblNewLabel.setBounds(63, 90, 324, 52);
		frame6.getContentPane().add(lblNewLabel);
		
		//frame7
		frame7 = new JFrame();
		frame7.setBounds(100, 100, 450, 300);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(null);
		
		JLabel alreadyExists = new JLabel("This username is already taken!");
		alreadyExists.setFont(new Font("Candara", Font.PLAIN, 24));
		alreadyExists.setBounds(65, 62, 321, 62);
		frame7.getContentPane().add(alreadyExists);
		
		tryAgainBtnf7 = new JButton("Try Again");
		tryAgainBtnf7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tryAgainBtnf7.setBounds(145, 113, 148, 45);
		frame7.getContentPane().add(tryAgainBtnf7);
		
		tryAgainBtnf7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7.setVisible(false);
				frame2.setVisible(true);
			}
		});
	}
	
}
