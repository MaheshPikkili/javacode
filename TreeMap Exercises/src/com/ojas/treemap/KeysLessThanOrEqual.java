package com.ojas.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class KeysLessThanOrEqual {

	public static void main(String[] args) {
		TreeMap<String, String> listOfElements = new TreeMap<>();
		listOfElements.put("A", "Rose");
		listOfElements.put("B", "Lavendar");
		listOfElements.put("C", "Jasmine");
		listOfElements.put("D", "Sunflower");
		System.out.println("Key " + " Value");

		for (Map.Entry<String, String> element : listOfElements.entrySet()) {
			System.out.println(element.getKey() + " " + element.getValue());
		}
		System.out.println();

		NavigableMap<String, String> map = listOfElements.headMap("C", true);
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iterator =  set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
