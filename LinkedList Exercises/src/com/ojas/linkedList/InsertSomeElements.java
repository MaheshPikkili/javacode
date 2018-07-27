package com.ojas.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertSomeElements {
	public static void main(String[] args) {
		
	LinkedList<String> linkedList = new LinkedList<>();
	linkedList.add("Dell");
	linkedList.add("Hp");
	linkedList.add("Lenovo");
	linkedList.add("Macbook");

	System.out.println("Before adding element at specified position");
	Iterator<String> iterator = linkedList.iterator();
	while(iterator.hasNext()) {
	System.out.println(iterator.next());
	}

	linkedList.add(2, "Samsung");
	System.out.println();
	System.out.println("After adding element at specified position");
	Iterator<String> iterator2 = linkedList.iterator();
	while(iterator2.hasNext()) {
	System.out.println(iterator2.next());
	}
	}
}
