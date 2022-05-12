package arrays;

import java.util.Scanner;

public class ArraysIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] age = new int[6];
		for(int i = 0; i <= 5; i++) {
			age[i] = sc.nextInt();
					}
		sc.nextLine();
		System.out.println("You have given your input!");
		for(int i = 0; i <= 5; i++) {
			System.out.println(age[i]);
		}
	}
}