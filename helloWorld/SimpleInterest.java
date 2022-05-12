package helloWorld;

import java.util.Scanner;

public class SimpleInterest {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

 int p = sc.nextInt();
 
 double r = sc.nextDouble();
 
 int t = sc.nextInt();
 
 double s = (double)p * r * (double)t / 100;
 
 System.out.println("The simple interest is:" + s);
       }

   }