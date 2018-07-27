package com.ojas.hashmap;

import java.util.HashMap;

public class MapEmptyOrNot {
	public static void main(String[] args) {
		

		// TODO Auto-generated constructor stub

		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  System.out.println("Map is Empty :"+hash_map.isEmpty());
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  System.out.println("Map is Empty :"+hash_map.isEmpty());
	}

}
