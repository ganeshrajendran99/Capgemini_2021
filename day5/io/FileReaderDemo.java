package day5.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
		int r = fr.read();
		
		while(r!=-1) {
			System.out.print((char) r);
			r=fr.read();//it  will read the next character
		}
	}
}
