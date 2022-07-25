package lesson3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileHandling {

	public static void main(String[] args) {
		File file = new File("data.txt");

	    try {
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("The new file is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    try {
	    FileWriter fil =new FileWriter("data.txt");
	    fil.write("welcome to java FSD!");
	    System.out.println("data successfully written in to file");
	    fil.close();
	    }catch(Exception e) {
	    	e.getStackTrace();
	    }
	    try {
	    	char a[]=new char[100];
		    FileReader in =new FileReader("data.txt");
		    in.read(a);
		    System.out.println("data successfully read from file");
		    System.out.println(a);
		    in.close();
		    }catch(Exception e) {
		    	e.getStackTrace();
		    }
	    try {
		    FileWriter app =new FileWriter("data.txt",true);
		    app.write("\nLearn successfully");
		    System.out.println("data successfully appended in to file");
		    app.close();
		    }catch(Exception e) {
		    	e.getStackTrace();
		    }
	    try {
	    	char a[]=new char[100];
		    FileReader in =new FileReader("data.txt");
		    in.read(a);
		    System.out.println("data successfully read from file");
		    System.out.println(a);
		    in.close();
		    }catch(Exception e) {
		    	e.getStackTrace();
		    }
	}

}
