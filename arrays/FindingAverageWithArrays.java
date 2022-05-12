package arrays;

import java.util.Scanner;

public class FindingAverageWithArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the no. of students.");
	int n = sc.nextInt();
	
	int marks[];
	marks = new int[n];
	System.out.println("Enter the marks of the students.");
	for(int i = 0; i <= n-1; i++) {
		marks[i] = sc.nextInt();
	}
	int sum = 0;
	for(int j = 0; j <= n-1; j++) {
		sum += marks[j];
	}
	System.out.println("The average of the marks is: " + sum / n);
	System.out.println(marks[n-3]);
	}

}
