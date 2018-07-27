package com.ojas.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedElements {
	
public static void main(String[] args) {
	
	LinkedList<String> list=new LinkedList<>();
	list.add("White");
	list.add("Block");
	list.add("Green");
	list.add("Blue");
	list.add("Red");
	
	Iterator< String> itr=list.iterator();
	
	while (itr.hasNext()) {
		String string = (String) itr.next();
		System.out.println(string);
	}
	
}

}
