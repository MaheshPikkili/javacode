package com.ojas.arralist;

import java.util.ArrayList;
import java.util.List;

public class ExtractionPortionOfElements {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
	        list.add("Java");
	        list.add("Cric");
	        list.add("Play");
	        list.add("Watch");
	        list.add("Glass");
	        list.add("Movie");
	        list.add("Girl");
	         System.out.println(list);
	         List<String> arrayList= list.subList(02, 06);
	         System.out.println("Portion of elements :"+arrayList);
	}
}
