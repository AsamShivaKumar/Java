package strings;

public class AnagramMethod2 {

public static void main(String[] args) {

	String a = "adsz";
    String b = "asdf";
    boolean anagram = true;
    
    int al[] = new int[256];
    int bl[] = new int[256];
    
    for(char c: a.toCharArray()) {
    	int index = (int)c;
    	al[index]++;
    }
    for(char c: b.toCharArray()) {
    	int index = (int)c;
    	bl[index]++;
    }
    for(int i = 0; i < 256; i++) {
    	if(al[i] != bl[i]) {
    		anagram = false;
    		break;
    	}
   	}
    
		if(anagram) {
			System.out.println("The given strings are anagrams.");
		}else {
			System.out.println("The given strings are not anagrams");
		  }
   }
}
