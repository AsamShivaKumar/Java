
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracAwt extends Frame{
	
	PracAwt(String title){
		super(title);
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		Button btn = new Button("Close");
		add(btn);
		btn.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
//				     System.exit(0);
				     setVisible(false);
			  }
		});
		
		Label l1 = new Label("Enter your name:");
		add(l1);
		btn.setBounds(150, 150, 100, 40);
		l1.setBounds(150,50,100,40);
		TextField t1 = new TextField();
		add(t1);
		t1.setBounds(150,100,100,20);
		setResizable(false);
		TextArea ta1 = new TextArea();
		add(ta1);
		ta1.setBounds(150,200,100,50);
		setBackground(Color.gray);
//		setForeground(Color.white);
		l1.setForeground(Color.white);
		l1.setBackground(Color.black);
		// checkboxgroup --> only single checkbox can be checked when they are grouped using checkboxgroup
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("Yes",cg,true);
		Checkbox ch2 = new Checkbox("No",cg,false);
		add(ch1);add(ch2);
		ch1.setBounds(100,250,100,50);ch2.setBounds(220,250,100,50);
		//choice -- used to create drop-down menu
		Choice ch = new Choice();
		add(ch);
		ch.setBounds(150,300,100,20);
		ch.add("A");
		ch.add("B");
		ch.add("C");
		ch.add("D");
		ch.add("E");
		ch.add("F");
		ch.add("G");
		ch.add("H");
		ch.add("I");
		System.out.println(ch.getSelectedItem());
		
		List li = new List();
		add(li);
		li.setBounds(150,350,100,20);
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");
		li.add("F");
		li.add("G");
		li.add("H");
		li.add("I");
		li.setMultipleMode(true);
		System.out.println(li.getSelectedItem());
		
		MenuBar mb = new MenuBar();
	    Menu menu = new Menu("Menu");
	    MenuItem mi1 = new MenuItem("Open");
	    MenuItem mi2 = new MenuItem("Two");
	    MenuItem mi3 = new MenuItem("Three");
	    MenuItem mi4 = new MenuItem("Four");
	    menu.add(mi1);menu.add(mi2);
	    Menu subm = new Menu("More...");
	    subm.add(mi3); subm.add(mi4);
	    menu.add(subm);
	    mb.add(menu);
		setMenuBar(mb);
	}
	public static void main(String[] args) {
		PracAwt pw = new PracAwt("Frame");
		System.out.println("Done!");
	}

}
