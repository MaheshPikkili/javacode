package com.ojas.hashset;

import java.util.HashSet;

public class CompareHashSet {
public static void main(String[] args) {

	
	HashSet<String> elements = new HashSet<String>();

	elements.add("Telangana");
	elements.add("UP");
	elements.add("MP");
	elements.add("Hp");
	elements.add("Ap");
	elements.add("RJ");

	System.out.println("The elements of first HashSet  are");
	System.out.println(elements);

	HashSet<String> elements2 = new HashSet<String>();

	elements2.add("Telangana");
	elements2.add("UP");
	elements2.add("MP");
	elements2.add("Hp");
	elements2.add("Ap");
	elements2.add("RJ");


	System.out.println();
	System.out.println("The elements of Second HashSet  are");
	System.out.println(elements2);

	System.out.println();
	System.out.println("Are both HashSets same? "+elements.toString().contentEquals(elements2.toString()));
	
}
}
