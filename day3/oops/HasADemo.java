package day3.oops;
class Employee2{
	int id;
	String name;
	String dept;
	Address ad;//entity reference or object reference
	
	public Employee2(int id, String name, String dept, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.ad = ad;
	}
	void displayEmployeeDetails() {
		System.out.println(" id "+ id);
		System.out.println(" dept "+ dept);
		System.out.println(" name "+ name);
		System.out.println(" doorno "+ ad.doorNo);
		System.out.println(" streetname "+ ad.streetName);
		System.out.println(" pincode "+ ad.pincode);
	}
	
	
}
class Address{
	int doorNo;
	String streetName;
	int pincode;
	
	public Address(int doorNo, String streetName, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
	}
	
	
}
public class HasADemo {

	public static void main(String[] args) {
	Address addr = new Address(123,"Btm",560016);
    Employee2 emp = new Employee2(1, "sachin", "hr",addr);
    
    emp.displayEmployeeDetails();
    
    Employee2 emp2 = new Employee2(2, "Rahul", "devloper", new Address(134,"rmg",560015));
    emp2.displayEmployeeDetails();
	}

}
