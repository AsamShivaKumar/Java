package helloWorld;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i > 45) {
			break;
			}
			System.out.println(i);
		}
		
		for(int a = 1; a <= 100; a++) {
			if(a >=50 && a < 60){
				continue;
			}System.out.println(a);
		}
		
		
//		for(int i = 1; i <= 10; i++) {
//			for(int a = 1; a <= 100; a++) {
//				System.out.println(a+" ");
//			}
//		}

	}

}
