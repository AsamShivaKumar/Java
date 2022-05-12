package oopsLab.strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Enter the strings: ");
		   String a = scan.nextLine();
		   String b = scan.nextLine();
		   
		   if(areAnagrams(a,b)) {
			   System.out.println("The given strings are anagrams");
		   }else {
			   System.out.println("The given strings are not anagrams");
		   }
	}
	
	static boolean areAnagrams(String a,String b) {
		
		char alpha[] = new char[26];
		//Ignoring the case and assuming the strings to be alphabetical
		a = a.toLowerCase();         
		b = b.toLowerCase();
		
		for(int i = 0; i < a.length(); i++) if(Character.isLetter(a.charAt(i))) alpha[a.charAt(i)-('a')]++;
		for(int i = 0; i < b.length(); i++) if(Character.isLetter(b.charAt(i))) alpha[b.charAt(i)-('a')]--;
		
		for(int i = 0; i < 26; i++) if(alpha[i] != 0) return false;
		return true;
	}

}
