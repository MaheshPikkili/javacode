package com.ojas.linkedList;

import java.util.LinkedList;

public class ReplaceAnElement {
	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList1 = new LinkedList<>();
		
		linkedList1.add("MI");
		linkedList1.add("NOkia");
		linkedList1.add("samSung");
		linkedList1.add("Oppo");
		linkedList1.add("VIvo");
		
		linkedList1.set(0,"Redmi-Y2");
		System.out.println(linkedList1);
		
	}

}
