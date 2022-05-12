package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		  Singer s = new Singer("Shiva");
//		   s.name = "Shiva";
//		   s.walk();
//		   s.eat();
//		   s.sing();
//		   System.out.println(s.name);
//		   Teacher t = new Teacher();
//		   t.name = "Kumar";
////		   t.walk();
//		   t.eat();
//		   t.teach();
//		   System.out.println(t.name);
		  
//		  UP-CASTING:
//		  Person p = s;
//		  DOWN-CASTING:
	
//          Singer s1 = (Singer)p;
//          System.out.println(p instanceof Singer);
//          System.out.println(p instanceof Person);
//          System.out.println(s1 instanceof Singer);
//          System.out.println(s1 instanceof Person);
//          System.out.println(p instanceof Teacher);
//          t.walk();
//		   s.eat();
//		   s.walk();
		   
		   
		   Person p = new Teacher("ASK");
		   
		   ////this results in an error
		   //Singer si = (Singer)p;
		   
		   p.walk();
		   System.out.print("\n");
		   System.out.println((int)('z'));
		   
	}

}
