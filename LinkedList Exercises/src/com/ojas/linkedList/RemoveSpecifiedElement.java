package com.ojas.linkedList;

import java.util.LinkedList;

public class RemoveSpecifiedElement {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dell");
		linkedList.add("Hp");
		linkedList.add("Lenovo");
		linkedList.add("Macbook");
	//Removed Specified Element from The LinkedList
		linkedList.remove("Macbook");
		System.out.println(linkedList);
	
	}

}
