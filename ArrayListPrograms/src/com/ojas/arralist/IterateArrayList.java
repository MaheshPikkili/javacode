package com.ojas.arralist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

public static void main(String[] args) {
		
		
		ArrayList<Object> list=new ArrayList<>();
		
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		
		Iterator<Object> iter=list.iterator();
		while (iter.hasNext()) {
			Object object = (Object) iter.next();
			String color=(String) object;
			System.out.println(color);
			
		}
}
}
