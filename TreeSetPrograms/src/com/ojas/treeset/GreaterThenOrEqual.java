package com.ojas.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class GreaterThenOrEqual {
	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(5);
		set.add(16);
		set.add(3);
		set.add(20);
		set.add(-12);
		set.add(6);
		
		SortedSet<Integer> sortedSet=set.tailSet(6,true);
		
		for (Integer integer : sortedSet) {
			System.out.println(integer);
		}
	
		
		
	}

}
