package com.ojas.linkedList;

import java.util.LinkedList;

public class AppendTheSpecifiedElement {
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		list.offerLast("Last_Yellow");
		
		System.out.println(list);
		
	}

}
