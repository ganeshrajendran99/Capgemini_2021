package day7.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> o1=new Vector<Integer>();//default 10
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("vector "+o1);
		System.out.println("capacity :"+o1.capacity());
	}

}
