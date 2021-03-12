package day3.oops;


class Person{
	int id;
	String name;
	int age;
	
	void display() {
		System.out.println("this is the display method");
	}
	
	
}

class Cricketer extends Person{
	String role;
	void displayDetails()
	{
		System.out.println(" id "+ id);
		System.out.println(" name "+ name);
		System.out.println(" age "+ age);
		System.out.println(" Role "+ role);
	}
}

class Student extends Person{
	String dept;
}
class Manager extends Person{
	int experience;
}
public class InheritanceDemo {

	public static void main(String[] args) {
         Cricketer cricketer = new Cricketer();
         cricketer.id=1;
         cricketer.name="sachin";
         cricketer.age=46;
         cricketer.role="batsman";
         
         cricketer.displayDetails();
		
		
	}

}
