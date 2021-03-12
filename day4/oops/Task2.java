package day4.oops;
class SavingsAccount{
	private int balance;
	private int interest;
	public SavingsAccount(int balance, int interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	public void withdraw(int amount) {
		balance-=amount;
	}
	public void deposit(int amount) {
		balance+=amount;
	}
	public int interest() {
		balance+=balance*interest/100;
		return balance;
	}
	
	
	
}

public class Task2 {

	public static void main(String[] args) {
	SavingsAccount account = new SavingsAccount(1000,4);
    System.out.println("your balance "+ account.interest());
    account.deposit(4000);
    System.out.println("your balance "+ account.interest());
    account.withdraw(2000);
    System.out.println("your balance "+ account.interest());
	}
}
