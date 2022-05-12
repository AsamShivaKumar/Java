package patterns;

import java.util.Scanner;

public class Pattern12 {

public static void main(String[] args) {
		
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 
   for(int i = 1; i <= n; i++) {
	   int m = 0;
	   m++;
	for(int j = 1; j <= n-i; j++) {
		System.out.print("  ");
	}
	for(int j = 1; j <= (2*i)-1; j++) {
//		int m = 1;
		System.out.print(m++ + " ");
	}System.out.println(); 
   }
  }
}
