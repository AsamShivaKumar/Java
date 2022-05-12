package oopsLab.strings;

import java.util.*;

public class CountVowels {

	static ArrayList<Character> arr;
	
	public static void main(String[] args) {
		  arr = new ArrayList<>();
		  char a[] = {'a','e','i','o','u','A','E','I','O','U'};
		  
		  for(char c: a) arr.add(c);
		  
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter the string: ");
		  String s = scan.nextLine();
		  
		  int vowel = vowel(s);
		  int chars = 0;
		  
		  for(int i = 0; i < s.length(); i++) if(Character.isLetter(s.charAt(i))) chars++;
		  int cons = chars - vowel;
		  System.out.println("Vowels: " + vowel + " Consonants: " + cons);
	}
	
	public static int vowel(String str) {
		   int count = 0;
		   
		   for(int i = 0; i < str.length(); i++)
			   if(arr.contains(str.charAt(i))) count++;   		   
		   return count;
	}

}
