package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
     Student a1 = new Student();
     
     a1.setAge(12);
//     int x = a1.getAge();
     a1.setName("Shiva");
//     String y = a1.getName();
//     System.out.println(x);
     System.out.println(a1.getAge());
     
//     System.out.println(y);
     System.out.println(a1.getName());
	}
}
