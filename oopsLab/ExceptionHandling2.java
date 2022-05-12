package oopsLab;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
//	       try{
//	    	   func();	
//	    	   throw new IOException();
//	       }
////	       catch(MyException e) {
////	    	   System.out.println(e);
////	       }
//	       catch(ArithmeticException e) {
//	    	   System.out.println(e);
//	       }catch(IOException e) {
//	    	   e.printStackTrace();
//	       } catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		
		
		try {
			func2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void func2() throws IOException{
		throw new IOException();
	}
	
	static void func() throws MyException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mailID: ");
		
		String s = sc.nextLine();
		
		if(!s.substring(s.length()-4,s.length()).equals(".com")) {
//			throw new MyException(s);
//			throw new IOException();
//			throw new ArithmeticException();
		}else {
		       System.out.println("Success!");
		}
		
	}
	
	static class MyException extends Exception{
		  private String mail;
		  
		  public MyException(String mail){
			  this.mail = mail;
		  }		  
		  
		  public String toString() {
			     return "Invalid mail address!";
		  }
	}
}
