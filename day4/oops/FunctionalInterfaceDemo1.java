package day4.oops;
@FunctionalInterface
interface Test{
	void display();
	static void display2() {
		
	}
	default void display3() {
		
	}
}
@FunctionalInterface
interface Calculate{
	//void operation(int a,int b);
	int operation(int a, int b);
}
public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
    Test t=()->System.out.println("hello this is display method imp1");
	Test t2=()->{
		System.out.println("this is display method impl");
		System.out.println("this is multi line statement");
	};
	t.display();
	System.out.println("=========");
	t2.display();
	System.out.println("*****************");
	
	 //void
	 //Calculate c=(a,b)->System.out.println(a+b);
	 //c.operation(2,4);
	Calculate add=(a,b)->a+b;
	Calculate sub=(a,b)->a-b;
	Calculate mul=(a,b)->a*b;
	}
}
