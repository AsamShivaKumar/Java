package oopsLab.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		   
		Scanner scan = new Scanner(System.in);
		  
	    System.out.println("Enter the string: ");
		String s = scan.nextLine();
		
		if(palin(s)) {
			System.out.println("Entered string is a palindrome");
		}else {
			System.out.println("Entered string is not a palindrome");
		}
		
	}
	
	static boolean palin(String str) {
		   int i = 0;
		   int j = str.length()-1;
		   
		   while(i < j) {
			   if(str.charAt(i) != str.charAt(j)) return false;
			   i++;j--;
		   }		   
		   return true;
	}

}
