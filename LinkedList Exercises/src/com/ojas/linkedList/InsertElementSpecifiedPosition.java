package com.ojas.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class InsertElementSpecifiedPosition {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		list.add("Pink");
	
		list.add("Yellow");
		list.add(5,"Grey");

		//System.out.println(list.isEmpty());
		System.out.println(list.get(5));
		
	}
}
