package oopsLab.strings;

public class TenDice {

	public static void main(String[] args) {
		   
		   int n = Integer.parseInt(args[0]);
//		   System.out.println((int) (Math.random()*(6-1+1) + 1));
		   int arr[] = new int[51];
		   
		   rollDice(arr,n);
		   
		   for(int i = 0; i < 51; i++) {
			   System.out.print(i+10 + ": ");
			   for(int j = 0; j < arr[i]; j++) System.out.print("* ");
			   System.out.println();
		   }
		   
	}
	
	static void rollDice(int arr[], int n) {
		 
		 for(int i = 0; i < n; i++) {
			 int sum = 0;
			 for(int j = 0; j < 10; j++) sum += (int) (Math.random()*6+1);
			 arr[sum-10]++;
		 }
	}

}
