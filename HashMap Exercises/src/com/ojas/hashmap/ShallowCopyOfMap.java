package com.ojas.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ShallowCopyOfMap {
	public static void main(String[] args) {
		
		 HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  
		  HashMap<Integer,String> hash_map1= new HashMap<Integer,String>(hash_map);  
		  
		  for (Map.Entry<Integer, String> string : hash_map1.entrySet()) {
			  System.out.println(string.getKey()+" "+string.getValue());
			
		}
		
	}

}
