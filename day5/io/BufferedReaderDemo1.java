package day5.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("one.txt"));
		
		//System.out.println(br.readLine());
		String r = br.readLine();
		while(r!=null) {
			System.out.println(r);
			r=br.readLine();
		}
		
	}

}
