package helloWorld;

import java.util.Scanner;

public class Aa {
	
	public static void main(String[] args) {
		
		   int a = 2;
		   
		   System.out.println("Number: (" + a + ")");
		
		   int arr1[] = {1,3,5,7};
		   int arr2[] = {0,2,6,8,9};
		   
		   for(int i = 0; i < 4; i++) System.out.print(arr1[i] + " ");
		   System.out.println();
		   for(int i = 0; i < 5; i++) System.out.print(arr2[i] + " ");
		   System.out.println();
		   
		   merge(arr1,arr2,4,5);
		   
		   for(int i = 0; i < 4; i++) System.out.print(arr1[i] + " ");
		   System.out.println();
		   for(int i = 0; i < 5; i++) System.out.print(arr2[i] + " ");
		   System.out.println();
		   
	}
	
	public static void merge(int arr1[], int arr2[], int n, int m) {
        
        int size = (n+m);
        int temp = 0;
        for(int gap = size/2; gap >= 1; gap = gap/2){
//        	System.out.println(gap);
            for(int i = 0; ((i+gap) < size); i++){
//            	System.out.println(i + " ** " + gap);
                int c = i+gap;
                // if(c >= size) break;
                if(i < n && c < n){
                    if(arr1[c] < arr1[i]){
                    temp = arr1[c];
                    arr1[c] = arr1[i];
                    arr1[i] = temp;
                    for(int j = i-gap; (j >= 0) && (arr1[j] > arr1[i]); j -= gap){
                        temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                    }
                }
                }else if(i >= n && c >= n){
                	int x = i;
                    i -= n;
                    c -= n;
                    if(arr2[c] < arr2[i]){
                    temp = arr2[c];
                    arr2[c] = arr2[i];
                    arr2[i] = temp;
                    for(int j = x-gap; j >= 0; j -= gap){
                        if(j >= n){
	                        if(arr2[j-n] > arr2[i]) {	
	                        temp = arr2[j-n];
	                        arr2[j-n] = arr2[i];
	                        arr2[i] = temp;
	                        }else {
	                        	break;
	                        }
                        }else{
                        	if(arr1[j] > arr2[i]) {
                            temp = arr1[j];
                            arr1[j] = arr2[i];
                            arr2[i] = temp;
                            }else{
                            	break;
                            }
                        }
                    }
                }
                    i = x;
                }else{
                    // i is arr1 & c is in arr2
                    c = c-n;
                    if(arr1[i] > arr2[c]){
                        temp = arr1[i];
                        arr1[i] = arr2[c];
                        arr2[c] = temp;
                        for(int j = i-gap; (j >= 0) && (arr1[j] > arr1[i]); j -= gap){
                        temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                    }
                    }
                }
                
            }
        }
}
}



	
	 