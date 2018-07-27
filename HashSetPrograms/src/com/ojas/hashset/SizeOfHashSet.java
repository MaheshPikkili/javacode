package com.ojas.hashset;

import java.util.HashSet;

public class SizeOfHashSet {
	public static void main(String[] args) {

		HashSet< String> set=new HashSet<>();
		set.add("Mahesh");
		set.add("Manu");
		set.add("Madhu");
		set.add("Malli");
		set.add("Nimal");
		
		System.out.println("Number Of elements of set :"+set.size());
	}

}
