package day3.oops;
abstract class Calculate{
	int a=10;
	void display() {
     System.out.println("this is normal method");		
	}
	// abstract method
	abstract int doOperation(int a,int b);
	abstract void message();
}
class Add extends Calculate{
	@Override
	int doOperation(int a, int b) {
		return a+b;
	}

	@Override
	void message() {
    System.out.println("hello");
	}
}
class Sub extends Calculate{
	@Override
	int doOperation(int a, int b) {
		return a-b;
	}

	@Override
	void message() {
       System.out.println("welcome");		
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
     Calculate c = new Add();
     System.out.println("Result :"+c );

	}

}
