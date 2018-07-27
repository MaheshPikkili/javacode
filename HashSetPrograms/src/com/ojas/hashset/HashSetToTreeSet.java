package com.ojas.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
	
	public static void main(String[] args) {
		
		
			
			 HashSet<String> h = new HashSet<String>();
			 
		        // Adding elements into HashSet using add()
		        h.add("India");
		        h.add("Australia");
		        h.add("South Africa");
		        h.add("US");
		        System.out.println(h);
		        
		        TreeSet<String> set=new TreeSet<>(h);
		        
		        for (String string : set) {
					System.out.println(string);
				}
		        
		        
	}

}
