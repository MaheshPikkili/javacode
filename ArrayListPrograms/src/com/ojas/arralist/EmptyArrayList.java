package com.ojas.arralist;

import java.util.ArrayList;

public class EmptyArrayList {
public static void main(String[] args) {
	

	ArrayList<String> list=new ArrayList<>();
	
	System.out.println("is list Empty :"+list.isEmpty());
	list.add("White");
	list.add("Black");
	list.add("Green");
	list.add("Orange");
	list.add("Red");
	System.out.println("is list Empty :"+list.isEmpty());

}
}