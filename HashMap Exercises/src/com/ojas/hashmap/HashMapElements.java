package com.ojas.hashmap;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class HashMapElements {

	static final Logger logger = Logger.getLogger(HashMapElements.class);
		public static void main(String args[]) {  
			PropertyConfigurator.configure("log4j.properties");
			  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
			  hash_map.put(1, "Red");
			  hash_map.put(2, "Green");
			  hash_map.put(3, "Black");
			  hash_map.put(4, "White");
			  hash_map.put(5, "Blue");
			  
			  for(Map.Entry x:hash_map.entrySet()){  
			   logger.debug(x.getKey()+" "+x.getValue());  
			  }  
		}

}
