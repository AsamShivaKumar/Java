package oops;

public class StaticKeyword {

	
	static {
		System.out.println("1111111111111111");
	}
	public static void main(String[] args) {
		
//      Person b = new Person();
//      b.name = "Kumar";
//     
      System.out.println(Math.PI);
//      System.out.println(b.breed);
		
		A objA = new A();
		A.B objB = objA.new B();
		A.C objC = new A.C();
		
	}
	static {
		System.out.println("2222222222222222");
	}

}
