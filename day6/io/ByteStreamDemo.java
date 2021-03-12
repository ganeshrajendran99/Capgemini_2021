package day6.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("three.txt");
		fos.write(67);
		
		String msg = "hello";
		byte arr[]=msg.getBytes();
		fos.write('a');
		fos.write(arr,1,2);
		fos.flush();
		fos.close();
		
	}

}
