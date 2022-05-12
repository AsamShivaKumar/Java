package helloWorld;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number ");
	double a = sc.nextDouble();
	System.out.println("Enter the second number ");
	double b = sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter the operation");
	char operation = sc.nextLine().charAt(0);
	
	switch(operation) {
	case '+':
		System.out.println(a + b);
	break;
	case '-':
		System.out.println(a - b);
	break;
	case '*':
		System.out.println(a * b);
	break;
	case '/':
		System.out.println(a / b);
	break;
	default:
		System.out.println("Invalid");
	  }
	}
}
