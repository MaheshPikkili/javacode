package com.ojas.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class KeyValueLeastKey {

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

		Entry<String, String> keyValue = listOfElements.ceilingEntry("D");
		//System.out.println("Portion of map greater than given key");
		System.out.println(keyValue.getKey()+" "+keyValue.getValue());
	}
}
