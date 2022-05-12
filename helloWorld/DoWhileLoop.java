package helloWorld;

import java.util.Scanner;

public class DoWhileLoop {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = 0;
	do {
		 n = sc.nextInt();
	System.out.println("The entered number is " + n);
	}while(n > 0);
	}

}
