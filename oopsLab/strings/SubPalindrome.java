package oopsLab.strings;

import java.util.Scanner;

public class SubPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  
	    System.out.println("Enter the string: ");
		String s = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i < s.length()-1; i++) {
			for(int j = i+1; j < s.length(); j++) {
				if(palin(s.substring(i,j+1))) count++;
			}
		}
		
		if(count == 0) {
			System.out.println("The string does not contains any palindrome-substrings");
		}else{
			System.out.println("The string contains " + count + " substrings which are palindromes");
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
