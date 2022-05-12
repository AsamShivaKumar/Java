package helloWorld;

import java.util.Scanner;

public class SeriesSum {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
double sum = 0;
// Sum of series :
// 1 + 1/2 + 1/3 + ..... + n
//
//double sum = 0;
//
//for(double i = 1; i <= n; i++) {
//	sum += 1 / i;
//  }
//System.out.println("The sum of the series is " + sum);

//Sum of the series 
// 1 - 1/2 + 1/3 - 1/4 +     - 1/n  
for(double i = 1; i <= n; i++) {
	if(i == 1 || i % 2 == 1) {
		sum = sum + 1 / i;
	}else {
		sum = sum - 1 / i;
	}
  }
System.out.println(sum);
 }
}
