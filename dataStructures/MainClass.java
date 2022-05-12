package dataStructures;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student("ASK", 48));
		li.add(new Student("SK", 45));
		li.add(new Student("Shiva", 48));
		li.add(new Student("Asam", 40));
		li.add(new Student("Kumar", 38));
		Collections.sort(li);
		li.forEach(System.out::println);
	}

}
