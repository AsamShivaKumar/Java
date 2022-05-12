package methods;

public class Intro {
	
	public static void pri() {
		System.out.println("kgdahwljsaknmcbvdhsbj");
	}
public static void main(String[] args) {
	
	
	int x = 23;
	int y = 45;
	int z = 12;
	
	int result = maxOf(x, y, z);
	pri();
	System.out.println("The maximum of the numbers is: " + result);
	sayHi();
	maxOf();
	
	int max = maxOf(x, y);
	System.out.println(max);
 }

public static int maxOf(int a, int b, int c) {
	if(a > b) {
		if(a > c) {
			return a;
		}else {
			return c;
		}
	}else {
		if(b > c) {
			return b;
		}else {
			return c;
		}
	}
}
   public static void maxOf() {
	   System.out.println("............................................................................................................");
   }
   
   public static int maxOf(int a, int b) {
	   return a > b ? a : b;
   }
   
public static void sayHi() {
	System.out.println("Hello");
	System.out.println("Good evening!!!");
}

 }
