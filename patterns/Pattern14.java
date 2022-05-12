package patterns;

import java.util.Scanner;

public class Pattern14 {

public static void main(String[] args) {
  
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= n-i; j++) {
			System.out.print("  ");
		}
	}






//          0
//        4 0 4  
//      3 4 0 4 3
//    2 3 4 0 4 3 2
//  1 2 3 4 0 4 3 2 1
  }
}
