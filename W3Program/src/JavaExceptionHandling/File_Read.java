package JavaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*Write a Java program to create a method that reads a file and throws an exception if the file is not found.*/
public class File_Read {

	public static void main(String[] args) {
		
		File file = new File("c:\\docs\\test.xlsx");
		
		
		try {
			FileInputStream IP = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program closed");


	}

}
