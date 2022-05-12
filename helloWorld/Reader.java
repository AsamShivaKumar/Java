package helloWorld;

import java.io.*;
import java.util.StringTokenizer;

public class Reader {

	BufferedReader buff;
	StringTokenizer str;
	
	public Reader() {
		buff = new BufferedReader(new InputStreamReader(System.in));
	}
	
	String next() {
		while(str == null || !str.hasMoreElements()) {
			try {
				str = new StringTokenizer(buff.readLine());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return str.nextToken();
	}
	public String nextLine() {
//		String str = "";
//		try {
//			str = buff.readLine();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		return next();
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
	
}
