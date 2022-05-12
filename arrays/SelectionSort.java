package arrays;

public class SelectionSort {

public static void main(String[] args) {
   
   int a[] = {-3,3,2,-5,-6};
   int n = a.length;
   
   for(int i = 0; i < n-1; i++) {
	 int minInd = i;
	 for(int j = i; j < n; j++) {
		 if(a[j] < a[minInd]) {
			 minInd = j;
		 }
	  }
	 int temp = a[minInd];
	 a[minInd] = a[i];
	 a[i] = temp;
     }
   for(int item: a) {
	   System.out.print(item + " ");
   }
	}
}
