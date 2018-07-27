package com.ojas.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveFirstAndLast {


	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dell");
		linkedList.add("Hp");
		linkedList.add("Lenovo");
		linkedList.add("Acer");
		linkedList.add("Macbook");
	// remove first and last element from a linked list	
	linkedList.removeFirst();
	linkedList.removeLast();
	Iterator<String> iterator = linkedList.iterator();
	while(iterator.hasNext()) {
	System.out.println(iterator.next());
	}
	
	}
}
