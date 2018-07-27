package com.ojas.hashset;

import java.util.HashSet;

public class RemoveAllElements {

	
	public static void main(String[] args) {
		
		
		HashSet<String> h = new HashSet<String>();
		 System.out.println("HashSet is Empty : "+h.isEmpty());
	        // Adding elements into HashSet using add()
	        h.add("India");
	        h.add("Australia");
	        h.add("South Africa");
	        h.add("US");
	        
	        h.clear();
	        
	        System.out.println(h);
	}
}
