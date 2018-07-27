package com.ojas.treeset;

import java.util.Collections;
import java.util.TreeSet;

public class AddElementsTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>(Collections.reverseOrder());
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		
		
		set.add("Testing");
		
		for (String string : set) {
			System.out.println(string);
		}
		
		
	}

}
