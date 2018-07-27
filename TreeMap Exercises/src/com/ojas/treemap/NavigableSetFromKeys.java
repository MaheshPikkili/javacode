package com.ojas.treemap;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromKeys {
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
		
		NavigableSet<String> navigableSet = listOfElements.navigableKeySet();
		System.out.println("List of keys "+navigableSet);
	}

}
