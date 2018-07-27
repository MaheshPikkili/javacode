package com.ojas.arralist;

import java.util.ArrayList;

public class UpdateSpecificArrayElement {
public static void main(String[] args) {
	

	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("White");
	arrayList.add("Block");
	arrayList.add("Green");
	arrayList.add("Blue");
	arrayList.add("Red");
	for (String string : arrayList) {
		System.out.println(string);
	}
	System.out.println("--------------------After Updated----------------");
	
	arrayList.set(4, "updated_Red");
	for (String string : arrayList) {
		System.out.println(string);
	}
}
}
