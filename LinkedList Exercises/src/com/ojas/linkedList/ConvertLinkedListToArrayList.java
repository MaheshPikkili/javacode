package com.ojas.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("MI");
		linkedList2.add("NOkia");
		linkedList2.add("samSung");
		linkedList2.add("Oppo");
		linkedList2.add("VIvo");
		
		ArrayList<String> arrayList=new ArrayList<>(linkedList2);
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

}
