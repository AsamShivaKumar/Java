package oopsLab.fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Output {

	public static void main(String[] args) {
		   
//		   FileOutputStream fout;
//		   try{
//			   fout = new FileOutputStream("C:\\Users\\Shiva Kumar\\Documents\\git.txt",true);
//			   fout.write("\nNa ishtam\n".getBytes(),2,5);
//			   fout.write((byte)('a'));
//			   fout.flush();
//			   fout.close();
//		   }catch(Exception e) {
//			   System.out.println(e);
//		   }
		   
//		   FileReader fr;
//		   try{
//				   fr = new FileReader("C:\\Users\\Shiva Kumar\\Documents\\git.txt");
//				   int i;
//				   while((i = fr.read()) != -1) System.out.println((char)i);
//				   fr.close();
//		   }catch(IOException e) {
//			   System.out.println(e);
//		   }
		
//		FileWriter fw;
//		try {
//			fw = new FileWriter("C:\\Users\\Shiva Kumar\\Documents\\git.txt");
//			fw.write("ask\n");
//			fw.write("shiva\n");
//			fw.close();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		method(5);method("Shiva");
		method(5,"Shiva");method("ask",new Object());
		System.out.println(methoD(new ArrayList<>()));
		
	}
	
	public static <E> void method(E ele) {
		System.out.println(ele);
	}
	
	public static <X,Y> void method(X x,Y y) {
		System.out.println("x: " + x + "\ny: " + y);
	}
	
	public static <E> E methoD(E ele) {
		return ele;
	}
}
