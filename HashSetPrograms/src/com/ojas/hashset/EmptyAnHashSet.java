package com.ojas.hashset;

import java.util.HashSet;

public class EmptyAnHashSet {

	public static void main(String[] args) {
		
		 HashSet<String> h = new HashSet<String>();
		 
	        // Adding elements into HashSet using add()
	        h.add("India");
	        h.add("Australia");
	        h.add("South Africa");
	        h.add("US");
	        System.out.println(h);
	        h.clear();
	        
	}
}
