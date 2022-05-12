package helloWorld;

public class NestedStatements{
	 
	public static void main(String[] args) {
		
		int a = 8;
		int b = 9;
		int c = 10;
//		
//		if(a > b && a > c) {
//			System.out.println("The greatest number is a: " + a);
//		}else if(b > a && b > c) {
//			System.out.println("The greatest number is b: " + b);
//		}else {
//			System.out.println("The greatest number is c: " + c);
//		}
////		TERNARY OPERATOR!!!
//		
		int max = 0;
//		
//		max = b > c ? b > a ? b : a : c > a ? c : a;
//		
//		System.out.println(max);
		
		if(a > b) {
			if(a > c) {max = a;
						}else {max = c;}
		}else {
			if(b > c) {max = b;
						}else {max = c;}
		}
		
		System.out.println(max);
	}
}
