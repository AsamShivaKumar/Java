package oopsLab.strings;

public class RandomWalker {

	static int x,y;
	
	public static void main(String[] args) {
		   int n = Integer.parseInt(args[0]);
		   System.out.println("n: " + n);
		   x = y = 0;
		   
		   walk(n);
		   System.out.println("Sqaured distance: " + (x*x+y*y));
		   
	}
    
	static void walk(int n) {
	       
		   for(int i = 0; i < n; i++) {
			   int dir = (int) (Math.random()*(4-1+1)+1);          //Math.random()*(max-min+1) + min -> [min,max]
		       
			   if(dir == 1) {
				   x += 1;          // East
			   }else if(dir == 2) {
				   x -= 1;          // West
			   }else if(dir == 3) {
				   y -= 1;          // North
			   }else {
				   y += 1;          // South
			   }
			   
			   System.out.println("(" + x + ", " + y + ")");
		   }
		  
	}
	
}
