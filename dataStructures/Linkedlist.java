package dataStructures;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		ll.add(14);
		ll.add(13);
		ll.add(12);
		ll.add(11);
		String a = ll.toString();
		Object b[] = ll.toArray();
		System.out.println(a + " " + a.charAt(2));
		for(Object item: b) {
			System.out.println(item);
		}
		
//		getDiff(ll);
//		getDiff(al);

	}
	
//	public static void getDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i = 0; i < 100000; i++) {
//			list.add(0, i);
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println("The time taken by " + list.getClass().getName() + " is " + (end-start));
//		
//	}

}
