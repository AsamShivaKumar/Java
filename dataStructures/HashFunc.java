package dataStructures;

public class HashFunc {

	public static void main(String[] args) {
		
		System.out.println(getHash("Shiva"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i <s.length(); i++) {
			hash += s.charAt(i);
		}
		
		return hash;
	}

}
