package com.ojas.linkedList;

import java.util.LinkedList;

public class JoinTwoLinkedList {
	public static void main(String[] args) {
		

	LinkedList<String> linkedList1 = new LinkedList<>();
	linkedList1.add("Dell");
	linkedList1.add("Hp");
	linkedList1.add("Lenovo");
	linkedList1.add("Acer");
	linkedList1.add("Macbook");
	
	LinkedList<String> linkedList2 = new LinkedList<>();
	linkedList2.add("MI");
	linkedList2.add("NOkia");
	linkedList2.add("samSung");
	linkedList2.add("Oppo");
	
	linkedList1.addAll(linkedList2);
	
	System.out.println(linkedList1);
	}

}
