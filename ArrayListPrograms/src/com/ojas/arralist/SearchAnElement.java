package com.ojas.arralist;

import java.util.ArrayList;

public class SearchAnElement {
public static void main(String[] args) {
	

	ArrayList<String> list=new ArrayList<>();
	
	list.add("White");
	list.add("Block");
	list.add("Green");
	list.add("Blue");
	list.add("Red");
	//to search an element in a array list
	System.out.println("Red is Avalible : "+list.contains("Red"));
	
	System.out.println("Yellow is Avalible : "+list.contains("Yellow"));
	
	
}
}
