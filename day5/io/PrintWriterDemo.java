package day5.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("two.txt");
		pw.write(100);
		pw.print(100);
		
		pw.flush();
		pw.close();
	}

}
