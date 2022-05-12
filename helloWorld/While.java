package helloWorld;

import java.util.*;

public class While {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n >= 0) {
		System.out.println("The number entered is " + n);
		n = sc.nextInt();
	}
	}

}
