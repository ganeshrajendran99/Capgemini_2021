package day3.oops;
class Person2{
	void sleep() {
		System.out.println("sleep for 8 hrs");
	}
	void work() {
		System.out.println("work for 8 hrs");
	}
}

class Employee3 extends Person2{
	void work() {
		System.out.println("work for 9 hrs");
	}
	void display() {
		System.out.println("this is diplay it is not overriding");
	}
}
public class Overriding4 {

	public static void main(String[] args) {
		Person2 person = new Employee3();//it will call only call overridden 
		person.sleep();
        person.work();
        //person.display();display method it will not call it has not been overriddent
	}

}
