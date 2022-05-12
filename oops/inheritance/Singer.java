package oops.inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		super(name);
	}
	
	public void eat() {
		super.eat();
		System.out.println("Singer, " + name + " is eating.");
	}

	public void sing() {
		System.out.println("Singer is singing.");
	}
	
}
