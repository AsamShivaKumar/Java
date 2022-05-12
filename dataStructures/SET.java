package dataStructures;

import java.util.*;
import java.util.Map.Entry;

public class SET {

	public static void main(String[] args) {
		
//		HashSet<String> s = new HashSet<>();
//		s.add("Shiva");
//		s.add("Kumar");
//		s.add("Asam");
//		System.out.println(s);	
//	    System.out.println(s.add("Asam"));
//	    System.out.println(s);
//	    for(String str: s) {
//	    	System.out.print(str + " ");
//	    }
//		s.add(null);
//	    Iterator<String> it = s.iterator();
//	    while(it.hasNext()) {
//	    	System.out.print(it.next() + " ");
//	    }
		
//		LinkedHashSet<String> lh = new LinkedHashSet<>();
//		lh.add("asam");
//		lh.add("shiva");
//		lh.add("kumar");
//		System.out.println(lh);
//		Iterator<String> i = lh.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		TreeSet<String> ts = new TreeSet<>();
//		ts.add("Asam");
//		ts.add("Shiva");
//		ts.add("Kumar");
//		System.out.println(ts);
//		Iterator<String> it = ts.descendingIterator();
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2,  "two");
		map.put(3,  "three");
		map.put(4,  "four");
		System.out.println(map.remove(3));
		for(Entry<Integer, String> me: map.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}
		
		Map<Character, ArrayList<Integer>> ma = new HashMap<>();
		for(int i = 0; i < 4; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j = 1; j < 4; j++) {
				arr.add(j);
			}
			ma.put((char)(97+i), arr);
		}
		System.out.println(ma);
	}

}
