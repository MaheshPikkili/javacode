package com.ojas.treeset;


import java.util.TreeSet;

public class StrictlyGreaterThenElement {
public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(5);
		set.add(16);
		set.add(3);
		set.add(20);
		set.add(-12);
		set.add(6);
			Integer elements=set.higher(6);
			System.out.println(elements);
		
}

}
