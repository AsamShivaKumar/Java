package oopsLab.minor1;

public class Main {

	public static void main(String[] args) {
           LapTab l = new LapTab("XYZ");
           
           System.out.println(l.getMode());
           System.out.println(l.getModel());
           
           l.switchMode();
           System.out.println(l.getMode());
           
//           //returns false
//           String a = new String("ask");
//           String b = "ask";
//           System.out.println(a == b);
           
           //returns true
           String a = "ask";
           String b = "ask";
           System.out.println(a == b);
           
           a += "as";
           
           System.out.println(a == b);
           System.out.println(a);
           System.out.println(b);
                    
	}
}


class LapTab implements Laptop,Tablet{
      
	private String mode = "Laptop";
	private String model;
	
	LapTab(String model){
		this.model = model;
	}
	
	public void rotate() {
		   System.out.println("Rotated");
	}

	public void printSpecs() {
		  System.out.println("Can be used as both Laptop and Tablet.");
	}
	
	public String getModel() {
		return model;
	}
	
	public String getMode() {
		return mode;
	}
	
	public void switchMode() {
		mode = "Tablet";
	}
	  
}

interface Laptop{
	  void printSpecs();
	  String getModel();
}

interface Tablet{
	 void rotate();
	 String getModel();
}