package helloWorld;

public class Operators{
	
	public static void main(String[] args) {
		
//		Bitwise Operators
		int a = 7;
		int b = 6;
		int c = a & b;
		
		System.out.println(c);

		int e = c | b;
		
		System.out.println(e);
		
		int f = b>>2;
		
	    System.out.println(f);
	    
//	    Comparison Operators
	    
	    System.out.println(c >= b); 
	    
//	    Logical Operators- Not Operator - Represented by:! 
	    
	    if(!(a > b)) {System.out.println(b);
	     }else {System.out.println(a);
	     }
	}
}

