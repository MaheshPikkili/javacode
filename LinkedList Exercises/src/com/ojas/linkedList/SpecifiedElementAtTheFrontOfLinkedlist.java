package com.ojas.linkedList;

import java.util.LinkedList;

public class SpecifiedElementAtTheFrontOfLinkedlist {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		list.add("Pink");
		list.add("Yellow");
		list.addFirst("Frount_color");
		System.out.println(list);
	}

}
