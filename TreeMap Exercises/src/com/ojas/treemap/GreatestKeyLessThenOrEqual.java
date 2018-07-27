package com.ojas.treemap;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GreatestKeyLessThenOrEqual {
	public static void main(String[] args) {
		
		 TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>(Collections.reverseOrder());
		   
		    //add key value pairs to TreeMap
		    treeMap.put(1,"One");
		    treeMap.put(3,"Three");
		    treeMap.put(2,"Two");
		    treeMap.put(5,"Five");
		    treeMap.put(4,"Four");
		    
		  Entry<Integer, String>  entry=treeMap.higherEntry(5);
		  
		  System.out.println(entry.getKey()+" : "+entry.getValue());
		  
	}

}
