package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) throws NullPointerException {
	       int arr[] = {1,2,3};
	       
	       try {
	    	   System.out.println(arr[3]);
	       }catch(ArrayIndexOutOfBoundsException e) {
	    	   System.out.println("Catch");
	       }
	       System.out.println("Outside catch");
	}
}
