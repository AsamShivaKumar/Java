package oopsLab;

import java.util.*;

public class infixToPostfix {

	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Enter the infix expression: ");		   
		   String in = scan.nextLine();
		   
		   System.out.println("Postfix expression: " + toPost(in));
		   
	}	
	
	static String toPost(String in) {
		 
		String ret = "";
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			System.out.println("Before: " + st);
			switch(c) {
			   case '(':
				  st.push('(');
				  break;
			   case ')':
				  while(!st.isEmpty() && st.peek() != '(') ret += st.pop();
				  st.pop(); // popping '('				  
				  break;
			   case '+':
				   if(!st.isEmpty() && st.peek() != '(') {
					   while(!st.isEmpty()) ret += st.pop();
				   }
				   st.push(c);
				   break;
			   case '-':
				   if(!st.isEmpty() && st.peek() != '(') {
					   while(!st.isEmpty()) ret += st.pop();
				   }
				   st.push(c);
				   break;
			   case '*':
				   if(!st.isEmpty() && (st.peek() == '*' || st.peek() == '/')) {
					   while(!st.isEmpty() && (st.peek() == '*' || st.peek() == '/')) ret += st.pop();						   
				   }
				   st.push(c);
				   break;
			   case '/':
				   if(!st.isEmpty() && (st.peek() == '*' || st.peek() == '/')) {
					   while(!st.isEmpty() && (st.peek() == '*' || st.peek() == '/')) ret += st.pop();						   
				   }
				   st.push(c);
				   break;
			   default:
				    ret += c;
			}
			System.out.println("After: " + st);
		}
		
		while(!st.isEmpty()) ret += st.pop();
		
		return ret;
	}
	

}
