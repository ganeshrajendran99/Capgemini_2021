package day6.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	static String name;
	transient int age;
	public Employee(int id, String name,int age) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
	}
}

public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(1,"sachin",18);
		FileOutputStream fis = new FileOutputStream("four.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fis);
		
		ois.writeObject(emp);
		ois.flush();
		ois.close();
		
		System.out.println("serilization completed ..");
		
	}

}
