package com.ojas.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortKeysInTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> treeMap=new TreeMap<String,String>(new Sort());
		treeMap.put("A4","Green");
		treeMap.put("A2", "Black");
		treeMap.put("A5", "Red");
		treeMap.put("A1", "Pink");
		treeMap.put("A3", "White");
		
		for (Map.Entry<String, String> string :treeMap.entrySet()) {
			
			System.out.println(string.getKey()+" ==> "+string.getValue());
			
		}
	
	}
}
	
	class Sort implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	}

