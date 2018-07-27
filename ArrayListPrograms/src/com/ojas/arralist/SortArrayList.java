package com.ojas.arralist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList{
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	
	list.add("White");
	list.add("Block");
	list.add("Green");
	list.add("Blue");
	list.add("Red");
	System.out.println("Without Sorting ..."+list);
	Collections.sort(list);
	System.out.println("----------------------------------------------");
System.out.println("Sorting ....."+list);
}

}
