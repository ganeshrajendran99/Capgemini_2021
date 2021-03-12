package day7.collections;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		ArrayList<String> project1 = new ArrayList<String>();
		project1.add("sachin");
		project1.add("rahul");
		project1.add("amit");
		project1.add("kumar");
		System.out.println("project1 "+project1);

		ArrayList<String> project2 = new ArrayList<String>();
		project2.add("roshan");
		project2.add("varsha");
		project2.add("rahul");
		project2.add("rahull");
		project2.add("amit");
		System.out.println("project2 "+project2);
		
		project2.removeAll(project1);
		System.out.println("project2 "+project2);
		project2.addAll(project1);
		System.out.println("project2 "+project2);
		
	}

}
