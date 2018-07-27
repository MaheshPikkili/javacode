package com.ojas.treeset;

import java.util.TreeSet;

public class NumberOfElements {

	public static void main(String[] args) {
		
		
		TreeSet<String> set=new TreeSet<>();
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		set.add("Testing");
		
		System.out.println("Number Of Elements : "+ set.size());
	}
}
