package strings;

public class AnagramMethod1 {
	
public static void main(String[] args) {

	String a = "asd";
	String b = "ads";
	boolean anagram = false;
	boolean visited[] = new boolean[b.length()];
	
	if(a.length() == b.length()) {
	for(int i = 0; i < a.length(); i++) {
	  
		for(int j = 0; j < b.length(); j++) {
		  if(a.charAt(i) == b.charAt(j) && !visited[j]) {
			 anagram = true;
			 visited[j] = true;
			  break;
		  }
	  }
	  if(!anagram) {
		  break;
	  }
	 }
	}
	if(anagram) {
		System.out.println("The given words are anagrams.");
	}else {
		System.out.println("The given words are not anagrams");
	}
 }
}
