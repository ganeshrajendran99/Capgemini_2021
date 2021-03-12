package day7.collections;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.push(4);
		
		Enumeration e=s.elements();
		while(e.hasMoreElements()) {
			
		}
		
		System.out.println("elements are "+s);
		System.out.println("top element "+s.peek());
		System.out.println("removed element +"+s.pop());
		
		System.out.println("elements are "+s);
		System.out.println("top element "+s.peek());
		System.out.println("removed element +"+s.pop());
		
		System.out.println("elements are "+s);
		System.out.println("top element "+s.peek());
		System.out.println("removed element +"+s.pop());
		
		System.out.println("elements are "+s);
		System.out.println("top element "+s.peek());
		System.out.println("removed element +"+s.pop());
		
		/*System.out.println("elements are "+s);
		System.out.println("top element "+s.peek());
		System.out.println("removed element +"+s.pop());*/
		
		
	}

}
