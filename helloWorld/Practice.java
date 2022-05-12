package helloWorld;

import java.util.Scanner;

public class Practice{
	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//double x = 4.5636;
//int y = (int)x;
//System.out.println(y);
//int b = y << 2;
//System.out.println(b);

//int a = 42;
//int b = 23;
//int c = 54;
//
//if(a % 2 == 0) {
//	System.out.println("a is an even number");
//}else {
//	System.out.println("a is an odd number");
//   }
//int max = 0;
//
////max = a > b ? a : b;
//max = a > b ? a > c ? a : c : b > c ? b : c;
//
//System.out.println("The greatest number is: " + max);

//if(a > b) {
//	if(a > c) {
//		max = a;
//	}else {max = c;}
//  }else {
//	  if(b > c) {max = b;}
//	  else {max = c;}
//  }
//System.out.println(max);

int a = sc.nextInt();
sc.nextLine();
char opr = sc.nextLine().charAt(0);
int b = sc.nextInt();

switch(opr) {
case '+':
	System.out.println(a + b);
	break;
case '-':
	System.out.println(a - b);
	break;
case '*':
	System.out.println(a * b);
	break;
case '/':
	System.out.println(a / b);
	break;
default:
	System.out.println("Invaid");
   }
 }
}