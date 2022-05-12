package oopsLab.strings;

public class RandomWalkers {

	static int x,y;
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double t = Double.parseDouble(args[1]);
		
		System.out.println("n: " + n);
		System.out.println("t: " + t);
		x = y = 0;
		walk(n,t);
	}
	
	static void walk(int n,double t) {
	    double meanSumSq = 0;   
		for(int j = 0; j < t; j++) {
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
//			   System.out.println("(" + x + ", " + y + ")");
		   }
		   
		   meanSumSq += x*x + y*y;
		}
		System.out.println("Mean squared distance= " + (double) (meanSumSq/t));
	}

}
