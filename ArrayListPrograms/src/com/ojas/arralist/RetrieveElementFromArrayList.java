package com.ojas.arralist;

import java.util.ArrayList;

public class RetrieveElementFromArrayList {
	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<>();
		
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		
	}

}
