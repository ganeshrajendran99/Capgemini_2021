package day7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class LabBookProblem6 {
	List getValues(HashMap<Integer,Integer>h)
	{
		List l = new ArrayList();
		for(Integer values : h.values())
		{
			l.add(values);
		}
		Collections.sort(l);
		return l;
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 15);
		hm.put(3, 5);
		
		LabBookProblem6 d = new LabBookProblem6();
		List mysortedList = d.getValues(hm);
		
		System.out.println(mysortedList);
	}

}
