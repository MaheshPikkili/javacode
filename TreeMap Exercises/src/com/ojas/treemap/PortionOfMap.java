package com.ojas.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PortionOfMap {
	
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
	
		SortedMap<String,String> key =  listOfElements.headMap("C");
		Set<Entry<String,String>> set = key.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
		
	}

}
