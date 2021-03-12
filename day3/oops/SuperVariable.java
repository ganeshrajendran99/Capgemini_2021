package day3.oops;
class Parent{
	int a=10;
}
class child extends Parent{
	int a=20;
	void add()
	{
		int result=a+a;//20+20
		int result1=a+super.a;//20+10
		int result2=super.a+super.a;//10+10
		System.out.println("Result "+result);
		System.out.println("Result1 "+result1);
		System.out.println("Result2 "+result2);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
         child child = new child();
         child.add();
	}

}
