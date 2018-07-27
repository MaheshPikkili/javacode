package com.ojas.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateElementsAtSpecificPosition {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		list.add("Pink");
		list.add("Yellow");
		ListIterator<String> itr=list.listIterator(2);
		
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}
}
