package com.ojas.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class CompareTwoLinkedlist {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("MI");
		linkedList2.add("NOkia");
		linkedList2.add("samSung");
		linkedList2.add("Oppo");
		linkedList2.add("VIvo");
		
		LinkedList<String> linkedList1 = new LinkedList<>();
		linkedList1.add("MI");
		linkedList1.add("NOkia");
		linkedList1.add("samSung");
		linkedList1.add("Oppo");
		linkedList1.add("VIvo");
		Collections.sort(linkedList1);
		Collections.sort(linkedList2);
		if(linkedList1.equals(linkedList2))
		{
			System.out.println("Two Lists are Equal");
		}
		else {
			System.out.println("Two Lists are NOt Equal");
		}
		
		
	}

}
