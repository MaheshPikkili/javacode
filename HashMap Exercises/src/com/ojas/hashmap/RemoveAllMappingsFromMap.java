package com.ojas.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveAllMappingsFromMap {
	
	public static void main(String[] args) {
		

		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  for (Map.Entry<Integer, String> elements:hash_map.entrySet()) {
				 
				 System.out.println(elements.getKey()+" "+elements.getValue());
			} 

		  //to remove all of the mappings from a map
		  System.out.println("------------------After Removed----------------");
		  
		  
		  
		  for (Map.Entry<Integer, String> elements:hash_map.entrySet()) {
				 
				 System.out.println(elements.getKey()+" "+elements.getValue());
				
			} 

		  
		
	}

}
