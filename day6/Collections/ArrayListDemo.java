package day6.Collections;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList o =new ArrayList();
		System.out.println("before adding size is "+o.size());
		System.out.println("before adding elements are "+o);
		o.add(1);//internally it will do auto boxing
		o.add("sachin");
		o.add("ravi");
		o.add('c');
		o.add(10.24);
		o.add(null);
		
		System.out.println("after adding size is "+o.size());
		System.out.println("after adding elements are "+o);
		
		o.add(2, "hello");//put the value at index 2 and remaining are shifted to the next index
		System.out.println("after adding elements are "+o);
		
		o.set(4, "ganesh");//replace in the index position
		
		o.remove("ravi");
		System.out.println("after removing elements are "+o);
		
		o.remove(1);
		System.out.println("after removing elements are "+o);
		
		o.remove(Integer.valueOf(1));
		System.out.println("after removing elements are "+o);
		
		System.out.println(o.contains("sachin"));
		System.out.println(o.contains("hello"));
		
		System.out.println("get the element by index "+o.get(1));
		//o.add("sumukha");
		
	}
}
