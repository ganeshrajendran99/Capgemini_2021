package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
  int id;
  String name;
  String dept;
  
  public Employee(int id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
}
  
}

public class UserDefinedType {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"sachin","hr"));
		empList.add(new Employee(2,"ravi","developer"));
		empList.add(new Employee(3,"amit","tester"));
		empList.add(new Employee(4,"ganesh","analyst"));
		
		System.out.println("employee list:"+empList);
		
		Iterator<Employee> it = empList.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.id+" "+e.name+" "+e.dept);
		}
	}
}
