package day3.oops;
class Bank{
	void rateofInterest() {
		System.out.println(" not yet assigned");
	}
}
class Sbi extends Bank{
void rateofInterest() {
	System.out.println(" SBI 4%");
}
}
class Axis extends Bank{
	void rateofInterest() {
		System.out.println(" AXIS 6%");
	}
}

public class UpcastingDemo {

	public static void main(String[] args) {
        //upcasting call only overridden method
		Sbi s = new Sbi();
        
		Bank sbi = new Sbi();
		sbi.rateofInterest();
	}

}
