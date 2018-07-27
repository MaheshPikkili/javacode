package com.ojas.treeset;

import java.util.TreeSet;

public class CloneTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		set.add("Testing");
		set.clone();

		
		TreeSet<String> elements = new TreeSet<String>(set);
		System.out.println(elements);
	
	}

}
