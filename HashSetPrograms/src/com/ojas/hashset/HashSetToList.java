package com.ojas.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetToList {

	public static void main(String[] args) {
		
		
		
		 HashSet<String> h = new HashSet<String>();
		 
	        // Adding elements into HashSet using add()
	        h.add("India");
	        h.add("Australia");
	        h.add("South Africa");
	        h.add("US");
	        System.out.println(h);
	        System.out.println("----------------Array List Data ------------");
	        List<String>  list=new ArrayList<>(h);
	      for (String object : list) {
	    	  System.out.println(object);
			
		}
	}
}
