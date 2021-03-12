package day7.collections;

import java.util.HashMap;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("sachin","sachin is a batsman");
		hm.put("rahul","rahul is a wkbatsman");
		hm.put("bumrah","bumrah is a bowler");
		hm.replace("sachin","Kohli");
		System.out.println("Hashmap "+hm);
		
		hm.put("rahul", "rahul is a mentor");
		System.out.println("Hashmap overwritten "+hm);
		
		hm.remove("bumrah");
		System.out.println("Hashmap removed "+hm);
		
	}

}
