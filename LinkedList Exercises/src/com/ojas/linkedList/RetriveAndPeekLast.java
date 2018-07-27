package com.ojas.linkedList;

import java.util.LinkedList;

public class RetriveAndPeekLast {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("MI");
		linkedList2.add("NOkia");
		linkedList2.add("samSung");
		linkedList2.add("Oppo");
		linkedList2.add("VIvo");
		
		String last=linkedList2.peekLast();
		System.out.println(" Last Element :"+last);
	}

}
