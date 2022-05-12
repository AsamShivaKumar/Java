package oopsLab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{

	
	static Frame f;
	
	public static void main(String[] args) {
		
		f = new Frame();
		f.setLayout(null);
		f.setTitle("Registration");
		f.setSize(450,600); // width,height
		f.setVisible(true);
		Label l[] = new Label[8];
		TextField t[] = new TextField[6];
		l[0] = new Label("Name: ");
		l[1] = new Label("Gender: ");
		l[2] = new Label("Roll Number: ");
		l[3] = new Label("Registration Number: ");
		l[4] = new Label("Branch: ");
		l[5] = new Label("Year: ");
		l[6] = new Label("Email: ");
		l[7] = new Label("Mobile Number: ");
		
		
		int ly = 100;
		
		for(int i = 0; i < 8; i++) {
			f.add(l[i]);
			l[i].setBounds(70,ly,150,30);
			l[i].setForeground(Color.GRAY);
			ly += 50;
		}
		
		ly = 100;
		
		Choice c1 = new Choice();
		c1.add("CSE");c1.add("MECH");c1.add("ECE");c1.add("EEE");c1.add("CIVIL");
		c1.add("MME");c1.add("BIO");
		
		c1.setForeground(Color.GRAY);
		
		f.add(c1);
		
		Choice c2 = new Choice();
		c2.add("Male"); c2.add("Female"); c2.add("Trans");
		c2.setForeground(Color.GRAY);
		f.add(c2);
		
		for(int i = 0; i < 6; i++) {
			t[i] = new TextField();
			f.add(t[i]);
		    t[i].setBounds(240,ly,150,25); // (x,y,width,height)
		    ly += 50;
		    
		    if(i == 2) {
		    	c1.setBounds(240,ly,150,25);
		    	ly += 50;
		    }
		    
		    if(i == 0) {
		    	c2.setBounds(240,ly,150,25);
		    	ly += 50;
		    }
		}
		
//		l[0].setBounds(100,100,50,100);
//		t[0].setBounds(150,100,50,100);
		
		Button b1 = new Button("Register");
		Button b2 = new Button("Cancel");
		
		f.add(b1); b1.setBounds(70,ly,70,30);
		f.add(b2); b2.setBounds(320,ly,70,30);
		b1.setForeground(Color.GRAY);
		b2.setForeground(Color.GRAY);
		f.setBackground(Color.BLACK);
		
		b1.addActionListener(new Window());
		b2.addActionListener(new Window());
		
		System.out.println("Hello!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		   f.dispose();
	}

}