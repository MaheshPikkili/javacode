package com.ojas.linkedList;

import java.util.LinkedList;

public class LinkedListIsEmptyOrNot {
	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList1 = new LinkedList<>();
		System.out.println("List is Empty : "+linkedList1.isEmpty());
		linkedList1.add("MI");
		linkedList1.add("NOkia");
		linkedList1.add("samSung");
		linkedList1.add("Oppo");
		linkedList1.add("VIvo");
		System.out.println("List is Empty : "+linkedList1.isEmpty());
	}

}
