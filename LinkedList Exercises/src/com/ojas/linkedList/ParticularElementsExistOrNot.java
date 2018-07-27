package com.ojas.linkedList;

import java.util.LinkedList;

public class ParticularElementsExistOrNot {
	
public static void main(String[] args) {
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("MI");
		linkedList2.add("NOkia");
		linkedList2.add("samSung");
		linkedList2.add("Oppo");
		linkedList2.add("VIvo");
		
		System.out.println("particular element exists :"+linkedList2.contains("MI"));
}
}
