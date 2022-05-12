package dataStructures;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		List<String> age = new LinkedList<>();
		
//		age.add("18");
//		age.add("21");
//		fruits.addAll(age);
//		fruits.remove(2);
//		fruits.removeAll(age);
	
//		fruits.clear();
//		System.out.println(fruits.get(1));
		
		String temp[] = new String[fruits.size()];
		
		fruits.add(1, "Guava");
		fruits.toArray(temp);
		fruits.iterator();
		System.out.println(fruits);
		System.out.println(fruits.contains("21"));
		System.out.println(fruits.isEmpty());
		
	}

}
