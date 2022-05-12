package oops;

public class Base {
    
	private Base() {
		 
	}
	
	private static Base obje;
	
	public static Base getInstance() {
		if(obje == null) {
			obje = new Base();
		}
		return obje;
	}
}
