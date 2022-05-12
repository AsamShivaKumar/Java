package oops.polymorphism;

public class MainClass {

public static void main(String[] args) {
		
//	RUN TIME POLYMORPHISM
	
	Dog d = new Dog();
	Pet p = d;
	Animal a = p;
	d.walk();
	p.walk();
	
//	COMPILE TIME POLYMORPHISM
	
	greeting();
	greeting("Shiva");

	}

    public static void greeting() {
    	System.out.println("HI......HI");
    }
    public static void greeting(String n) {
    	System.out.println("Hi...." + n);
    }
}
