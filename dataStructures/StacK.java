package dataStructures;

import java.util.*;

public class StacK {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		
		s.push("Asam");
		s.add("Shiva");
		s.push("Kumar");
		s.push("kumar");
		s.push("asam");
		s.push("ASK");
		
		String b = s.pop();
		String a = s.peek();
		
		System.out.println(a + " " + b);

	}

}
