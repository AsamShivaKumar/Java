package oopsLab.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		   
		   File f = new File("C:\\Users\\Shiva Kumar\\Desktop\\naSaavu.txt");
		   
		   try {
			   f.createNewFile();
			   System.out.println("New file created!");
		   }catch(IOException e) {
			   System.out.println("Error!!!!");
		   }
	}

}
