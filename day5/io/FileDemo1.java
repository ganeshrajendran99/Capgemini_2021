package day5.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\capg\\B.txt");
		System.out.println(f.exists());
		
		if(f.exists()) {
			System.out.println("file is present");
		}
		else {
			System.out.println(" file is not present");
			System.out.println(" file is being created");
			f.createNewFile();
		}
	}

}
