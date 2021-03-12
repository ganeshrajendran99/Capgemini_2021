package day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int salary;
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(id==o.id) 
		{
			return 0;
		}
		else if(id>o.id)
		{
			return 1;
		}
		return -1;
	}
	
}
public class ComparableDemo {
	
	/*
	 * ArrayList<Employee> findbyDept(String dept ,ArrayList<Employee> emplist) {
	 * ArrayList<Employee> emp = new ArrayList<Employee>(); Iterator<Employee>
	 * itr=emplist.iterator(); while(itr.hasNext()) { Employee e=itr.next();
	 * if(e.dept.equals(dept)) { emp.add(e); } } return emp; }
	 */
	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"ravi","hr",65000));
		emplist.add(new Employee(17,"anil","developer",80000));
		emplist.add(new Employee(13,"suresh","ui",70000));
		emplist.add(new Employee(4,"kumar","developer",95000));
		
		System.out.println("Employee list "+ emplist);
		
		for(Employee e:emplist)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
		}
		
		Collections.sort(emplist);
		for(Employee e:emplist)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
		}
		
		/*Iterator<Employee> itr = emplist.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			
			if(e.dept=="developer")
				System.out.println(e.id+" "+e.name+" "+e.salary);
			
		}*/
		/*
		 * ComparableDemo c = new ComparableDemo(); ArrayList<Employee>
		 * em=c.findbyDept("developer",emplist); for(Employee e:em) {
		 * System.out.println(e); }
		 */
	}	
}
