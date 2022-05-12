package dataStructures;

import java.util.*;

public class Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> fruits = new PriorityQueue<>();
		fruits.add("Mango");
		fruits.add("CustardApple");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add("Apple");
		System.out.println(fruits);
//		System.out.println(fruits.remove());
//		System.out.println(fruits.remove());
//		System.out.println(fruits.remove());
		System.out.println(fruits.remove());
		String a[] = new String[fruits.size()];
		fruits.toArray(a);
		for(String i: a) {
			System.out.print(i + " ");
		}
	}

}
