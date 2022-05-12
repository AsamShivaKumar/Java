package helloWorld;

import java.util.Scanner;

public class WhileLoop {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = n;
	int sum = 0;
		
	while(x > 0 ) {
		int lasDigi = x % 10;
		sum += lasDigi;
		x /= 10;
	}
	System.out.println("The sum of the digits in " + n + " is " + sum);
	}
}
