package com.ojas.treeset;

import java.util.TreeSet;

public class StrictlyLessThenOrEqual {
	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(5);
		set.add(16);
		set.add(3);
		set.add(20);
		set.add(-12);
		set.add(6);
		Integer i=set.lower(20);
		
		System.out.println(i  );
	}

}
