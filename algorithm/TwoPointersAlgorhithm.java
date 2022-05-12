package algorithm;

import java.util.Arrays;

public class TwoPointersAlgorhithm {


	public static void main(String[] args) {
		
//The task is to find whether there are any two such numbers in
//		the array so that there sum is 'x'.
		
		int arr[] = {-1,4,-2,5,-3,3,4};
		int sum = 3;
		System.out.println(findSum(arr, sum));
	}
	public static boolean findSum(int a[], int x) {
		
		int i = 0; 
		int j = a.length-1;
		Arrays.sort(a);
		while(i < j) {
			if(a[i]+a[j] < x) {
				i++;
			}else if(a[i]+a[j] > x) {
				j--;
			}else {
				return true;
			}
		}
	
		return false;
	}
}
