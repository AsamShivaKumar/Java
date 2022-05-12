package oopsLab.threads;

import java.util.Scanner;

public class Search {
    
	
	static int arr[];
	static int k;
	volatile static int cnt;
	public static void main(String[] args) {
	       
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number of elements in the array: ");
		   int n = sc.nextInt();
		   System.out.println("Enter the key to be searched: ");
		   k = sc.nextInt();
		   arr = new int[n];
			
		   for(int i = 0; i < n; i++) arr[i] = (int)(Math.random()*10000);   
		   
		   long start = System.nanoTime();
		   System.out.println(count() + " :: Count Function");
		   long end = System.nanoTime();
		   System.out.println("Time taken: " + (end-start) + " ns");
		   
		   start  = System.nanoTime();
		   twoThreads();
		   end = System.nanoTime();
		   System.out.println("Time taken: " + (end-start) + " ns");
		   
		   start  = System.nanoTime();
		   fourThreads();
		   end = System.nanoTime();
		   System.out.println("Time taken: " + (end-start) + " ns");
		
	}
 
	
	static int count() {
		   int count = 0;
		   for(int i: arr) {
			   if(i == k) count++;
		   }
		   return count;
	}
	
	
	static void twoThreads() {
		   int n = arr.length;
		   MyThread m1 = new MyThread(0,n/2,"One");
		   MyThread m2 = new MyThread(n/2+1,n-1,"Two");
		   
		   m1.start();m2.start();
		   try {
			   m1.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   try {
			   m2.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   System.out.println(cnt + " :: Using two threads");
		   cnt = 0;
	}
	
	static void fourThreads() {
		   int n = arr.length;
		   MyThread m1 = new MyThread(0,n/4,"one");
		   MyThread m2 = new MyThread(n/4 + 1,n/2,"two");
		   MyThread m3 = new MyThread(n/2 + 1,3*(n/4),"three");
		   MyThread m4 = new MyThread(3*(n/4)+1,n-1,"four");
		   
		   m1.start();m2.start();m3.start();m4.start();
		   
		   try {
			   m1.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   try {
			   m2.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   try {
			   m3.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   try {
			   m4.join();
		   }catch(InterruptedException e) {
			   System.out.println(e);
		   }
		   
		   System.out.println(cnt + " :: Using four threads");		   
	}
	
	synchronized static int func(int i, int j) {
		   
		   for(int p = i; p <= j; p++) {
			   if(arr[p] == k) cnt++;
		   }
		   return cnt;
	}
	
	static class MyThread extends Thread{
		int i,j;
		
		MyThread(int i, int j, String name){
			super(name);
			this.i = i;
			this.j = j;			
		}
		
		public void run() {
			   func(i,j);
		}
	}
}
