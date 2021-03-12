package day5.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write("welcome\n");
		fw.write("hi\n");
		
		fw.flush();
		fw.close();
	}

}
