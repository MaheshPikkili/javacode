package com.ojas.hashset;

import java.sql.Array;
import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		
		 HashSet<String> h = new HashSet<String>();
         // Adding elements into HashSet using add()
    h.add("India");
    h.add("Australia");
    h.add("South Africa");
    h.add("US");
    Object[] a=h.toArray();
    for (Object object : a) {
		System.out.println(object);
	}
    
	}

}
