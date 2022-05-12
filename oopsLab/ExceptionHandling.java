package oopsLab;

import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args){
//		int arr[] = {3,4,5};
//		System.out.println(arr[3]);
		
		// try-catch
		
//		try {
//			int arr[] = {3,4,5};
//			System.out.println(arr[3]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
////			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}
		
		
		//finally
		
//		try {
//			int a = 1/0;
//		}catch(ArithmeticException e){
//			System.out.println(e);
//		}finally {
//			System.out.println("Inside 'finally' ");
//		}
//		System.out.println("Outside try-catch");
		 
//		throw new ArithmeticException();
		try {
			excep();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try{
//			System.out.println("Exception thrown!");
//			throw new ArithmeticException();			
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("Exception handled!");
//		}
		
		try {
			throw new MyException();
		}catch(MyException e) {
			System.out.println(e);
//			System.out.println(e.getMessage());
		}
		
	}
	
	static void excep() throws IOException {
//		throw new ArithmeticException();
		throw new IOException();
	}

	static class MyException extends Exception{
		    
		public String toString() {
			   return "MyException....";
		}
		   
	}
}
