package day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}	
}

class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id==o2.id)
		{
			return 0;
		}
		else if(o1.id>o2.id)
		{
			return 1;
		}
		return -1;
	}
	
	
}

class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name) ;
	}
	
}
class MarksComparator implements Comparator<Student>
{
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks==o2.marks)
		{
			return 0;
		}
		else if(o1.marks>o2.marks)
		{
			return 1;
		}
		return -1;
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> stulist = new ArrayList<Student>();
		stulist.add(new Student(1,"ravi",87));
		stulist.add(new Student(8,"abhinav",92));
		stulist.add(new Student(5,"sumukha",45));
		
		for(Student s:stulist)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println("sorting by Id");
		Collections.sort(stulist,new IdComparator());
		for(Student s:stulist)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println("sorting by Name");
		Collections.sort(stulist,new NameComparator());
		
		for(Student s:stulist)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("sorting by Marks");
	    Collections.sort(stulist,new MarksComparator());
		
		for(Student s:stulist)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
	}
	}
}
