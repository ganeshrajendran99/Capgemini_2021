import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class SetDemo1 {

	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		s.add(3);
		s.add(3);
		s.add(45);
		s.add("hello");
		s.add(100);
		
		System.out.println(s);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("hi");
		lhs.add("hello");
		lhs.add(45);
		lhs.add(100);
		lhs.add("thank you");
		
		
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(5);
		ts.add(30);
		//ts.add("sam");
		
		System.out.println(ts);
		
		
		TreeSet<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee(1,"rahul"));
		emp.add(new Employee(2,"kumar"));
		
		System.out.println("treeset "+emp);
		
	}

}
