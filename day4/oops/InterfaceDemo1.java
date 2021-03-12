package day4.oops;
interface Bank{
	abstract void rateofInterest(); // abstract keyword can be taken or it will be taken by default
	// how to provide implementation we have to do overriding 
	int workingDays=27;
}
interface Loan{
	abstract void creditLimit();
}

class SBI implements Bank,Loan{

	@Override
	public void rateofInterest() {
    System.out.println("5% of interest");
    System.out.println("bank working days"+ Bank.workingDays);		
	}

	@Override
	public void creditLimit() {
		System.out.println("upto 1cr for current account");
		System.out.println("upto 30 lakhs for savings account");
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Bank b = new SBI();
		b.rateofInterest();
		
		System.out.println("");
		
		SBI sbi = new SBI();
		sbi.rateofInterest();
		sbi.creditLimit();

	}

}
