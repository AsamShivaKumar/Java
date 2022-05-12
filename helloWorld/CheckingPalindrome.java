package helloWorld;

import java.util.Scanner;

public class CheckingPalindrome {

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int x = n;
   int rvsNo = 0;
   while(x > 0) {
   int lasDigi = x % 10;
   rvsNo = rvsNo * 10 + lasDigi;
   x /= 10;
   }
    if(rvsNo == n) {
    	System.out.println("The number is palindrome.");
    }else {
    	System.out.println("The number is not a palindrome.");
    }
	}
}
