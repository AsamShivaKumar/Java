package oops.exceptionHandling;

public class MainClass {

public static void main(String[] args) {
	try {
	int a = 4;
	int b = 0;
	int c = a/b;
	System.out.println(c);
	}catch(ArithmeticException e){
		System.out.println(e.getMessage() + " occured please check the code.");
	}
  }
}
