package com.ojas.linkedList;

import java.util.LinkedList;

public class RemoveAllElementsFromList {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dell");
		linkedList.add("Hp");
		linkedList.add("Lenovo");
		linkedList.add("Acer");
		linkedList.add("Macbook");
		//remove all the elements from a linked list
		linkedList.clear();
		
		System.out.println(linkedList);
	}

}
