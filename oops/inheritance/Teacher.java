package oops.inheritance;

public class Teacher extends Person {
  public Teacher(String name) {
		super(name);
			}
public void teach() {
	  super.eat();
	   System.out.println("Teacher is teaching.");
   }
   public void walk() {
	   super.walk();
	   System.out.println("Teacher " + name + " is walking.");
   }
}