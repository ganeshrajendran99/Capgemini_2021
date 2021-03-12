package day7.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("sachin","sachin is a batsman");
		hm.put("rahul","rahul is a wkbatsman");
		hm.put("bumrah","bumrah is a bowler");
		
		System.out.println("Hashmap "+hm);
		
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String, String>();
		lhm.put("sachin","sachin is a batsman");
		lhm.put("rahul","rahul is a wkbatsman");
		lhm.put("bumrah","bumrah is a bowler");
		
		System.out.println("LinkedHashmap "+lhm);
		
		TreeMap<String,String> tm = new TreeMap<String, String>();
		tm.put("sachin","sachin is a batsman");
		tm.put("rahul","rahul is a wkbatsman");
		tm.put("bumrah","bumrah is a bowler");
		
		System.out.println("map "+tm);
		
	}

}
