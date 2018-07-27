package com.ojas.arralist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	
	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<>();
			list.add("White");
			list.add("Black");
			list.add("Green");
			list.add("Orange");
			list.add("Red");
			for (String string : list) {
				System.out.println(string);
			}
			Collections.swap(list, 2, 4);
			System.out.println("----------------------------------------------");
			System.out.println("After Swaping...");
			System.out.println("----------------------------------------------");
			for (String string : list) {
				System.out.println(string);
			}
			
	}
}
