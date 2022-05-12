package helloWorld;

public class SwitchCaseStatements {

public static void main(String[] args) {

//	int month = 2;
//	
//	switch(month) {
//	case 1:
//	case 2:	
//		System.out.println("This is winter.");
//	break;
//	case 3:
//	case 4:
//	case 5:
//		System.out.println("This is summer.");
//	break;
//	default:
//		System.out.println("Neither summer nor winter");
	
	int rating = 3;
	
	switch(rating) {
	case 1:
	case 2:
	System.out.println("Bad");
	break;
	case 3:
	System.out.println("Average");
	break;
	case 4:
	case 5:
	System.out.println("Good");
	break;
	default:
	System.out.println("Not valid");
		}
 }
}
