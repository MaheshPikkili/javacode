package com.ojas.linkedList;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {

	public static void main(String[] args) {
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("MI");
		linkedList2.add("NOkia");
		linkedList2.add("samSung");
		linkedList2.add("Oppo");
		
	String removedFirstElement=	linkedList2.removeFirst();
	System.out.println("removedFirstElemen"+removedFirstElement);
	}
}
