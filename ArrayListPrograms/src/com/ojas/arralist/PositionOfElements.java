package com.ojas.arralist;

import java.util.ArrayList;

public class PositionOfElements {
	public static void main(String[] args) {
		

		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("White");
		arrayList.add("Block");
		arrayList.add("Green");
		arrayList.add("Blue");
		arrayList.add("Red");
		
		for (int i = 0; i < arrayList.size()-1; i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
	

}
