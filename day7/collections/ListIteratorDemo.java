package day7.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		ListIterator<Integer> it=o1.listIterator();
		System.out.println("forward direction");
		while(it.hasNext())
		{
			System.out.println("backward direction");
		}
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
