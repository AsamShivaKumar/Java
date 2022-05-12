package oopsLab.threads;

import java.util.Scanner;

public class LinearSearch {

	
	static int arr[];
	static int k;
	volatile static int flag = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array: ");
		int n = scan.nextInt();
		System.out.println("Enter the key value: ");
		k = scan.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = (int)(Math.random()*10000);
		
		long li,two,four;
		
		long start = System.nanoTime();
		linear();
		long end = System.nanoTime();
		li = end-start;
		
		start = System.nanoTime();
		twoThreads();
		end = System.nanoTime();
		two = end-start;
		
		start = System.nanoTime();
		fourThreads();
		end = System.nanoTime();
		four = end-start;
		
		System.out.println("Time taken without threads: " + li + "ns");
		System.out.println("Time taken by two threads: " + two + "ns");
		System.out.println("Time taken by four threads: " + four + "ns");
		
		
	}
	
 
	static void linear() {
		   for(int i = 0; i < arr.length; i++) {
			   if(arr[i] == k) {
				   System.out.println("The element is present at the index " + i);
				   break;
			   }
		   }
	}
	
	static void twoThreads() {
		   int l = arr.length;
		   MyThread t1 = new MyThread(0,l/2,k,"One");
		   MyThread t2 = new MyThread(l/2+1,l-1,k,"Two");
		   
		   t1.start();
		   t2.start();
		   
		   try {
			t1.join();
		  }catch (InterruptedException e) {
			System.out.println(e);
		}
		   try {
				t2.join();
			  }catch (InterruptedException e) {
				System.out.println(e);
			}
		   flag = 0;
	}
	
	static void fourThreads() {
		   int l = arr.length;
		   MyThread t1 = new MyThread(0,l/4,k,"one");
		   MyThread t2 = new MyThread(l/4 + 1, l/2,k,"two");
		   MyThread t3 = new MyThread(l/2 + 1, 3*(l/4),k,"three");
		   MyThread t4 = new MyThread(3*(l/4)+1,l-1,k,"four");
		   
		   t1.start();
		   t2.start();
		   t3.start();
		   t4.start();
		   
		   try {
				t1.join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		 
		   try {
				t2.join();
			  }catch (InterruptedException e) {
				System.out.println(e);
			}
		   try {
				t3.join();
			  }catch (InterruptedException e) {
				System.out.println(e);
			}
		   try {
				t4.join();
			  }catch (InterruptedException e) {
				System.out.println(e);
			}
	}
	
	
	synchronized static void search(int i, int j, MyThread m) {
//		System.out.println(flag);
				if(flag == 0) {
				     for(int p = i; p <= j; p++) {
				    	 if(arr[p] == k) {
				    		 System.out.println("Key " + k + " is found at the index " + p + " by  thread - " + m.getName());
				    		 flag = 1;
				    		 break;
				    	 }
				     }
				   }
	}
	
	static class MyThread extends Thread{
		  int i,j,key;
		  
		  MyThread(int i, int j, int k,String name){
			  super(name);
			  this.i = i;
			  this.j = j;
			  this.key = k;
		  }
		  
		  public void run() {
//			  System.out.println(flag);
			     search(i,j,this);
		  }		  
		  
	}

}
