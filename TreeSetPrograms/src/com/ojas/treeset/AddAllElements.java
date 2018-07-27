package com.ojas.treeset;

import java.util.TreeSet;

public class AddAllElements {
	public static void main(String[] args) {
		
		
		TreeSet<String> set=new TreeSet<>();
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		set.add("Testing");
		
		TreeSet< String> treeSet=new TreeSet<>();
		treeSet.addAll(set);
		for (String string : treeSet) {
			System.out.println(string);
		}
		
	}

}
