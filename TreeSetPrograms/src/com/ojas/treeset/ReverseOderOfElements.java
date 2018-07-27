package com.ojas.treeset;


import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOderOfElements {
	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("RED");
		set.add("YELLOW");
		set.add("BLUE");
		set.add("WHITE");
		set.add("BLACK");
		set.add("GREEN");
		Iterator<String> iter=set.descendingIterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
			
		}
	}

}
