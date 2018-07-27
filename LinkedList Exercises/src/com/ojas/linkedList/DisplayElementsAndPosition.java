package com.ojas.linkedList;

import java.util.LinkedList;

public class DisplayElementsAndPosition {

	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dell");
		linkedList.add("Hp");
		linkedList.add("Lenovo");
		linkedList.add("Macbook");
	for (int i = 0; i < linkedList.size(); i++) {
		
		System.out.println("INdex NO: "+i+" - "+linkedList.get(i));
		
	}
	
	
	}
}
