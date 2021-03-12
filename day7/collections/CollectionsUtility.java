package day7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtility {

	public static void main(String[] args) {
		
		ArrayList<String> project1 = new ArrayList<String>();
		project1.add("sachin");
		project1.add("rahul");
		project1.add("amit");
		project1.add("kumar");
		System.out.println("project1 "+project1);
		
		Collections.sort(project1);
		System.out.println("project1 after sort"+project1);
		
		//Collections.reverse(project1);
		//System.out.println("project1 after reverse"+project1);
		
		int index = Collections.binarySearch(project1, "sachi");
		System.out.println("the element is found at "+index);
	}

}
