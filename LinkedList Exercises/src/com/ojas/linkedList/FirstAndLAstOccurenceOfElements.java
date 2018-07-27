package com.ojas.linkedList;

import java.util.LinkedList;

public class FirstAndLAstOccurenceOfElements {

	public static void main(String[] args) {
		
	LinkedList<String> linkedList = new LinkedList<>();
	linkedList.add("Dell");
	linkedList.add("Hp");
	linkedList.add("Lenovo");
	linkedList.add("Macbook");
	
	System.out.println("First Occurence: "+linkedList.getFirst());
	System.out.println("Last Occurence: "+linkedList.getLast());
	
	}
}
