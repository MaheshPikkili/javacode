package com.ojas.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RemoveAndGetGreatestKey {
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
		
		Entry<String,String> keyValue = listOfElements.pollLastEntry();
		System.out.println("Greatest key-value pair that is removed");
		System.out.println(keyValue.getKey()+" "+keyValue.getValue());
		
		System.out.println();
		System.out.println("key-value pair after the removal of greatest key-value");
		for (Map.Entry<String, String> element : listOfElements.entrySet()) {
			System.out.println(element.getKey() + " " + element.getValue());
		}
	}

}
