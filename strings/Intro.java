package strings;

public class Intro{
	
public static void main(String[] args) {
 
//	Initializing a string by literals.
	String name = "Shiva";
	String name3  = "Shiva";
//	name = name + " Kumar";
//	System.out.println(name);
	String a = "      Shiva    ";
//	Initializing a string by objects.
	String name2 = new String("Shiva");
    String name4 = "";
	System.out.println(name == name2);
	System.out.println(name == name3);
	String ex = "tatata";
	ex = ex.replace('t','a');
	System.out.println(ex);
    System.out.println(name.charAt(0));
    System.out.println(name.length());
    System.out.println(name.substring(1));
    System.out.println(name.substring(1,5));
    System.out.println(name.isEmpty());
    System.out.println(name.contains("Sh"));
    System.out.println(name.equals(name2));
    System.out.println(name.concat(" Kumar"));
    System.out.println(name.replace('S','s'));
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(a.trim());
    System.out.println(name.indexOf('r'));
    System.out.println(name.indexOf('h'));
    
    String names = "Shiva,Kumar,Asam,Laya,Laxman,Kavitha";
    String naming[] = names.split(",");
    for(String item: naming) {
    	System.out.print(item + " ");
    }
    char nm[] = name.toCharArray();
    for(char i: nm) {
    	System.out.println(i);
    
    }
    char x = 'a';
    int y = (int)x;
    System.out.println(y);
 }
}