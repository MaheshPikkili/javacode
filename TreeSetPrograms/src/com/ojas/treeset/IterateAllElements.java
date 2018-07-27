package com.ojas.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateAllElements {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		set.add("Testing");
		
		Iterator<String> ietr=set.iterator();
		while (ietr.hasNext()) {
			String string = (String) ietr.next();
			System.out.println(string);
		}
	}
}
