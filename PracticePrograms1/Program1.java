package PracticePrograms1;
class Fruit{
	String name;
	String taste;
    void eat() {
	System.out.println("Apple is Sweet" );
	System.out.println("Orange is Sour");	
}
}
class Apple extends Fruit{
	@Override
	 void eat()
	    {
	    	System.out.println("Name of the fruit : Apple");
	    	System.out.println("Taste of the fruit : Sweet");
	    }
}
class Orange extends Fruit{
	@Override
     void eat() {
		System.out.println("Name of the fruit : Orange");
    	System.out.println("Taste of the fruit : Sour");
	}
}
public class Program1 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.eat();
		Orange orange = new Orange();
		orange.eat();
	}
}
