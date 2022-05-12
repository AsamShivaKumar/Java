package helloWorld;

public class IfElseStatements {
	
	public static void main(String[] args) {

		int x = 10;
		int y= 15;
//		
//	
//		if (x > y) {
//			System.out.println("x is greater than y");
//		}
//		else if (x <= y) {System.out.println("x is less than or equals to y");
//	}
//		else {System.out.println("y is greater than x");
//		}
		
//		if (x % 2 == 0) {System.out.println("x is even");
//		}else {System.out.println("x is odd");
//		}
     
		int max = 0;
//		
//		if (x > y) { max = x;	
//		}else { max = y;
//				}
//		System.out.println(" The greater number is " + max);
		
		max = x > y ? x : y;
		
		System.out.println(max);
		
	}
}
