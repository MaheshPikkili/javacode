package com.ojas.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class NumberLessThen7 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(5);
		set.add(16);
		set.add(3);
		set.add(20);
		set.add(-12);
		set.add(6);
	
		
	SortedSet<Integer> sortedset=set.headSet(7);
		System.out.println(" the numbers less than 7 in a tree set");
	for (Integer integer : sortedset) {
		System.out.println(integer);
	}
	}

}
