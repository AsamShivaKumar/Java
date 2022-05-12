import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

public class Tokenizer {

	public static void main(String[] args) {
		   StringTokenizer str = new StringTokenizer("Using string-tokenizer!"," -",true);
		   
		   while(str.hasMoreTokens())   
			   System.out.println(str.nextToken());
		   System.out.println("Second while loop-");
           while(str.hasMoreTokens()) System.out.println(str.nextToken());	
           System.out.println("Done!");
           
           try {
        	   throw new IOException();
           }catch(IOException e) {
        	   System.out.println(e);
        	   e.printStackTrace();
           }
           
           StringBuilder s = new StringBuilder();
           
           System.out.println(s.capacity());
           s.append("shivakjbcjfxknflnbldk");
           System.out.println(s.capacity());
           System.out.println(s.toString());
           
		
	}
}
