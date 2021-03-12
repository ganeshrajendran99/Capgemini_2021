package day3.oops;

class Parent1{
	int id;
	
	Parent1(int id){
		System.out.println("this is a parent constructor of type int");
		System.out.println("id "+id);
	}
	Parent1(String name){
		System.out.println("this is a parent constructor of type string");
		System.out.println("name "+name);
	}
}

class Child1 extends Parent1{
	Child1(){
		super("sam");
		System.out.println("this is a child constructor");
	}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
	
       Child1 child1 = new Child1();
	}

}
