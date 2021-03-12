package day3.oops;
class Parent2{
	void breakFast() {
		System.out.println("idli");
	}
	void vehicle() {
		System.out.println("xuz");
	}
}
class Child2 extends Parent2{
	void breakFast() {
		super.breakFast();
		System.out.println("maggi");
	}
}
public class OverRidingDemo {
	public static void main(String[] args) {
		Child2 child2 =  new Child2();
        child2.breakFast();
        child2.vehicle();
       

	}
}
