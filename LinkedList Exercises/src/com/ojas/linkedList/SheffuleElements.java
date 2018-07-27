package com.ojas.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SheffuleElements {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dell");
		linkedList.add("Hp");
		linkedList.add("Lenovo");
		linkedList.add("Acer");
		linkedList.add("Macbook");
		
		Collections.shuffle(linkedList);
		Iterator<String> iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		
	}

}
