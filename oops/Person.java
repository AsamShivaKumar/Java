package oops;

public class Person {
	String name;
	static String breed = "Homosapians";
	int age;

public static void main(String[] args) {

	Person a = new Person();
	a.name = "Shiva";
	a.age = 18;
 
    System.out.println(a.breed);
 }
}
