package day3.oops;
class Bank2{
	void rateofInterest() {
		System.out.println("1%");
	}
	static void display() {
		System.out.println("this is parent");
	}
}
class Hdfc extends Bank2{
	void rateofInterest() {
		System.out.println("5%");
	}
	static void display() {
		System.out.println("this is an hdfc child class");
	}
}
class Kotak extends Bank2{
	void rateofInterest() {
		System.out.println("6%");
	}
}
public class OverRidingDemo2 {

	public static void main(String[] args) {
	
		Bank2 bank2 = new Hdfc();
		bank2.rateofInterest();
		bank2.display();

	}

}
