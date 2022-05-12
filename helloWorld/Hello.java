package helloWorld;

import java.util.Scanner;

public class Hello {
//
//	public static void main(String[] args) {
//		int x = 1;
//		
//		double y = x;
//System.out.println(x);
//
//System.out.println(y);
	public static void main (String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for(int i = 1; i <= t; i++){
//		    int n = sc.nextInt();
//		    int a[] = new int[n];
//		    
//		    for(int item: a){
//		        item = sc.nextInt();
//		    }
//		    int sum = 0;
//		    for(int j = 0; j < n; j++){
//		        sum += a[j];
//		    }
//		    System.out.println(sum);
//		}
		
		int a[] = {1,2,3,5,2,8};
		System.out.println(stock(a,6));
	    
		
	}
	
	public static int stock(int a[], int n) {
		int min = a[0];
		int max = 0;
		for(int i = 1; i < n; i++) {
			if(min > a[i]) {
				min = a[i];
			}else {
				if(max < a[i]-min) {
					max = a[i]-min;
				}
			}
			
		}
		return max;
	}
}

