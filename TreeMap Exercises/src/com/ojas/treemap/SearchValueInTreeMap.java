package com.ojas.treemap;

import java.util.TreeMap;

public class SearchValueInTreeMap {

	 public static void main(String[] args) {
		 TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		  tree_map.put(1, "Red");
		  tree_map.put(2, "Green");
		  tree_map.put(3, "Black");
		  tree_map.put(4, "White");
		  tree_map.put(5, "Blue");
		 System.out.println("Value is Present :" +tree_map.containsValue("Red"));
	}
}
