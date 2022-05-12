package strings;

public class AnagramMethod3 {

public static void main(String[] args) {

	String a = "adsz";
    String b = "asdf";
    boolean anagram = true;
    
    int al[] = new int[256];
        
    for(char c: a.toCharArray()) {
    	int index = (int)c;
    	al[index]++;
    }
    for(char c: b.toCharArray()) {
    	int index = (int)c;
    	al[index]--;
    }
    for(int i: al){
    	if(i != 0) {
    		anagram = false;
    		break;
    	}
    }
    if(anagram) {
    	System.out.println("The given words are anagrams.");
    }else {
    	System.out.println("The given words are not anagrams");
    }
 }
}