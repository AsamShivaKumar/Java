package oopsLab.fileHandling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadingWritingFile {

	public static void main(String[] args) {
           
		   File f = new File("C:\\Users\\Shiva Kumar\\Documents\\git.txt");
		   
		   System.out.println("git.txt --before writing.");
		   try {
			   Scanner sc = new Scanner(f);
			   System.out.println("File content: ");
			   while(sc.hasNextLine())  System.out.println(sc.nextLine());
			   sc.close();
			   System.out.println("Completed reading the file!");
		   }catch(FileNotFoundException e) {
			   System.out.println(e);
		   }
		   
		   try {
			FileWriter fw = new FileWriter("C:\\Users\\Shiva Kumar\\Documents\\git.txt");
			fw.append("Sarada...just for fun!!!\nNa Saavu nen sastha niku endhuku?");
			fw.close();
		   }catch (IOException e) {
			System.out.println(e);
		   }
		   
		   System.out.println("git.txt --after writing.");
		   try {
			   Scanner sc = new Scanner(f);
			   System.out.println("File content: ");
			   while(sc.hasNextLine())  System.out.println(sc.nextLine());
			   sc.close();
			   System.out.println("Completed reading the file!");
		   }catch(FileNotFoundException e) {
			   System.out.println(e);
		   }
	}

}
