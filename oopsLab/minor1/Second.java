package oopsLab.minor1;

public class Second {

	public static void main(String[] args) {
		   int arr[] = new int[500];
		   int num = 0;
		   for(int i = 0; i < 500; i++) {
			 try{
				   num = (int)(Math.random()*1000);
			       if(isPrime(num)) {
				       throw new PrimeException();
			       }
			       arr[i] = num;
			 }catch(PrimeException e) {
				 System.out.println(e.getMessage() + "at index: " + i);
				 arr[i] = num+2;
			 }
	   }
		   
	    System.out.println("Numbers in the array: ");
	    for(int i: arr) System.out.print(i + " ");
	    System.out.println();
	}

	static boolean isPrime(int num) {
		   if(num == 1) return false;
		   if(num == 2 && num == 3) return true;
		   
		   for(int i = 2; i <= Math.sqrt(num); i++) {
			   if(num%i == 0) return false;
		   }
		   return true;
	}
	
	static class PrimeException extends Exception{
		         
		public String toString() {
			return "PrimeNumberIsGenerated";
		}
		@Override
		public String getMessage() {
			  return "PrimeNumberIsGenerated";
		}
	}
}
