package com.hi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Ex10 {

	public static void main(String[] args) {
		java.util.Map<String, String> map = new HashMap<>();
		
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", "val4");
		
		map.replace("key3", "VAL3");
		map.remove("key3", "VAL3");
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(map.get(key));
			
		}
		
		System.out.println("--------------------------------------");
		
		Set<Entry<String, String>> entrys = map.entrySet();
		Iterator<Entry<String, String>> ite2 = entrys.iterator();
		while(ite2.hasNext()){
			// entry에 키와 벨류가 들어있는것임  Entry<String, String>
			Entry<String, String> entry = ite2.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
