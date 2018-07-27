package com.ojas.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateAllElementsHashSet {

	public static void main(String[] args) {
		

			
			HashSet< String> set=new HashSet<>();
			set.add("Mahesh");
			set.add("Manu");
			set.add("Madhu");
			set.add("Malli");
			set.add("Nimal");
			Iterator<String> itr=set.iterator();
			while (itr.hasNext()) {
				String string = (String) itr.next();
				System.out.println(string);
			}
	}
}
