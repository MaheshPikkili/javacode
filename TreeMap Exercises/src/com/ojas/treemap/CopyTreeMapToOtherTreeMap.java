package com.ojas.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CopyTreeMapToOtherTreeMap {

	public static void main(String[] args) {
		 TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		  tree_map.put(1, "Red");
		  tree_map.put(2, "Green");
		  tree_map.put(3, "Black");
		  tree_map.put(4, "White");
		  tree_map.put(5, "Blue");
		  TreeMap<Integer,String> tree_map1=new TreeMap<Integer,String>(tree_map);
		
		  for (Map.Entry<Integer,String> entry : tree_map1.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
	}
}
