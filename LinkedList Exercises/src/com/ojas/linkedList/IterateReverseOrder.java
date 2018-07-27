package com.ojas.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class IterateReverseOrder {
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		list.add("Pink");
		list.add("Yellow");
		
		Collections.reverse(list);
		for (String string : list) {
			System.out.println(string);
		}
	}

}
