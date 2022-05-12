
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class fastReader {
	  public static class Reader{
		  BufferedReader br;
		  StringTokenizer st;
		  
		  public Reader() {
			  br = new BufferedReader(new InputStreamReader(System.in));
		  }
		  
		  String next() {
			  while(st == null || !st.hasMoreElements()) {
				  try {
					  st = new StringTokenizer(br.readLine());
				  }catch(IOException e) {
					  e.printStackTrace();
				  }
			  }
			  return st.nextToken();
		  }
		  int nextInt() {
			  return Integer.parseInt(next());
		  }
		  float nextFloat() {
			  return Float.parseFloat(next());
		  }
		  double nextDouble() {
			  return Double.parseDouble(next());
		  }
		  long nextLong() {
			  return Long.parseLong(next());
		  }
		  String nextLine() {
			  return next();
		  }
	  }

	public static void main(String[] args) throws IOException{
		
////		BufferedReader can be used for faster inputs but it involves a lot of typing
//		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//		
//		int a = Integer.parseInt(buff.readLine());
//		String x = (buff.readLine());
//		String y  = (buff.readLine());
//		System.out.println(x + " " + a + " " + y);
        
		
		Reader re = new Reader();
		
		System.out.println("Enter a number: ");
		int a = re.nextInt();
		System.out.println("Enter a string: ");
		String s = re.nextLine();
		System.out.println(s + " " + a);
		
	}

}
