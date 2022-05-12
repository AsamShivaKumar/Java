package oops;

class Cat{
	String colour;
	int legs, eyes;
	public void walk() {
		System.out.println("The cat can walk.");
	}
	public void eat() {
		System.out.println("The cat can eat.");
	}
	public void description() {
		System.out.println("The cat has " + legs + " legs and " + eyes + " eyes. It is " + colour + " coloured.");
	}
}
public class ClassesAndObjects {

public static void main(String[] args) {

	Cat cat1 = new Cat();
	Cat cat2 = new Cat();
	
	cat1.walk();
	cat2.eat();
	
	cat1.legs = 4;
	cat1.eyes = 2;
	cat1.colour = "black";
	cat1.description();
	
	cat2.legs = 3;
	cat2.eyes = 2;
	cat2.colour = "peach brown";
	cat2.description();
	
 }
}
