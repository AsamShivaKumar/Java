package patterns;

import java.util.Scanner;

public class Pattern13 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 1;
    int no = 2;
    for(int i = 1; i <= n; i++) {
    	
	    	for(int j = 1; j <= n-i; j++) {
	    		System.out.print("  ");
	    	}
	    	System.out.print(num++ +" ");
	    	if(i != 1) {
	    		
	    		for(int k = 1; k <= (2*i)-3; k++) {
	    			System.out.print("0 ");
	    		}
	    	System.out.print(no++);
	    	}
	    	
	    	System.out.println();
      }
   
//              1
//            2 0 2  
//          3 0 0 0 3
//        4 0 0 0 0 0 4
//      5 0 0 0 0 0 0 0 5
	}
}
						