package day7.collections;

import java.util.HashMap;
import java.util.Map;

public class MapIterateDemo {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("sachin","sachin is a batsman");
		hm.put("rahul","rahul is a wkbatsman");
		hm.put("bumrah","bumrah is a bowler");
		
		System.out.println("Hashmap "+hm);
		System.out.println();
		
		for(String key : hm.keySet())
		{
		System.out.println("keys are "+ key);
		//System.out.println("value in the"+key+" = "+hm.get(key));
		}
		System.out.println();
		for(String val:hm.values())
		{
			System.out.println(val);
		}
		System.out.println();
		for(Map.Entry<String, String> h:hm.entrySet())
		{
			if(h.getKey()=="sachin")
			System.out.println(h);
			
		}
	}

}
