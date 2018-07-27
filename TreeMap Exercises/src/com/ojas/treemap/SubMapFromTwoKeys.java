package com.ojas.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SubMapFromTwoKeys {
	
	public static void main(String[] args) {
		TreeMap<String, String> listOfElements = new TreeMap<>();
		listOfElements.put("A", "Rose");
		listOfElements.put("B", "Lavendar");
		listOfElements.put("C", "Jasmine");
		listOfElements.put("D", "Sunflower");
		listOfElements.put("F", "Ramesh");
		listOfElements.put("E", "Suresh");
		listOfElements.put("H", "mahesh");
		System.out.println("Key " + " Value");

		for (Map.Entry<String, String> element : listOfElements.entrySet()) {
			System.out.println(element.getKey() + " " + element.getValue());
		}
		System.out.println();

		SortedMap<String, String> keyValue = listOfElements.subMap("B", "D");
		System.out.println("Portion of map with inclusive and exclusive ");
		Set<Entry<String, String>> setOfKeyValues = keyValue.entrySet();
		for (Entry<String, String> entry : setOfKeyValues) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
