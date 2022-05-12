package helloWorld;

public class TernaryOperatorForNestedStatements {

	public static void main(String[] args) {
//	TERNARY OPERATOR!!!
		int a = 9;
		int b = 8;
		int c = 35;
		int max = 0;
		
		max = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println(max);
	}
}
