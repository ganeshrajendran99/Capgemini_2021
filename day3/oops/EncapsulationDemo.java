package day3.oops;

class Employee{
	private int id;
	private String name;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		//emp.id=1 not possible
		emp.setId(23);
		//System.out.println(emp.id);
		System.out.println(emp.getId());
		
		Employee emp2 = new Employee();
		System.out.println(emp2.getId());
	}

}
