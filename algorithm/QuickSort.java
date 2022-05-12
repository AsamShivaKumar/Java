package algorithm;

import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {19,14,20,15,29,10,25,24,17,21};
		quicksort(arr,0,arr.length-1);
		reverse(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}

	static int partition1(int a[],int start,int end)

	{

	int pivot=a[start],p1=start+1,i,temp;

	for(i=start+1;i<=end;i++)
	{

	if(a[i]<pivot)
	    {
	        if(i!=p1)
	      {  
	            temp=a[p1];
	            a[p1]=a[i];
	            a[i]=temp;
	      }    p1++;
	    }
	}

	        a[start]=a[p1-1];
	        a[p1-1]=pivot;

	return p1-1;
	}




	static void quicksort(int a[],int start,int end){
		 int p1;
		 if(start<end)
		{
		    p1=partition1(a,start,end);
		    quicksort(a,start,p1-1);
		    quicksort(a,p1+1,end);

		}
		}
	 static void reverse(int arr[]) {
		 Stack<Integer> st = new Stack<>();
		 for(int i: arr) {
			 st.push(i);
		 }
		 int i = 0;
		 while(!st.isEmpty()) {
			 arr[i] = st.pop();
			 i++;
		 }
	 }
}
