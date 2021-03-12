package day6.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("four.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e =(Employee)ois.readObject();
		System.out.println(e.id+" "+e.name+" "+e.age);
	}

}
