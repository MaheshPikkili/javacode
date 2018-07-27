package com.ojas.treeset;

import java.util.TreeSet;

public class FirstAndLastElements {
	public static void main(String[] args) {
		TreeSet<String> elements = new TreeSet<String>();

		elements.add("Telangana");
		elements.add("UP");
		elements.add("MP");
		elements.add("Hp");
		elements.add("Ap");
		elements.add("RJ");
		elements.add("MA");
		elements.add("MB");
		
		System.out.println("First Element :"+elements.first());
		System.out.println("Last Element :"+elements.last());
		
	}

}
