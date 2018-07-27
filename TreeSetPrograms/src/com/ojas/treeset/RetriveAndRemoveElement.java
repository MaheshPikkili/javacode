package com.ojas.treeset;

import java.util.TreeSet;

public class RetriveAndRemoveElement {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		set.add("Testing");
		String fisrt=set.pollFirst();
		System.out.println(fisrt);
		String last=set.pollLast();
		System.out.println(last);
		System.out.println(set);
		
	}

}
