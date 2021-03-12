package PracticePrograms1;
class Employee{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void Validation() throws Exception
	{
		if(firstName==null & lastName==null) {
			throw new NullPointerException("Entry Missing");
		}
		if(firstName.length()<3 & lastName.length()<3) {
			throw new Exception("Name should be minimum 3 characters");
		}
		else 
		{
			System.out.println("FirstName "+firstName+" LastName "+lastName);
		}
	}
}
public class Program3 {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Ab","Cd");//Enter abc cde as input it will display firstname and lastname
		emp.Validation();
	}
}
