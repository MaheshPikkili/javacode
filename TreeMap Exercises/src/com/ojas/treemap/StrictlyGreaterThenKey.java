package com.ojas.treemap;

import java.util.TreeMap;

public class StrictlyGreaterThenKey {
	
	public static void main(String[] args) {
		
		 TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		  // Put elements to the map 
		  tree_map1.put(10, "Red");
		  tree_map1.put(20, "Green");
		  tree_map1.put(40, "Black");
		  tree_map1.put(50, "White");
		  tree_map1.put(60, "Pink");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 50: ");
		  System.out.println("Key(s): " + tree_map1.lowerKey(50));
		
	}

}