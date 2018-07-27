package com.ojas.linkedList;

import java.util.LinkedList;

public class InsertFirstAndLastElements {

	public static void main(String[] args) {
		
		
		LinkedList<String> list=new LinkedList<>();
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		list.add("Pink");
		list.add("Yellow");
		list.addFirst("First_White");
		list.addLast("Last_Yellow");
		
		System.out.println(list);
	}
}
