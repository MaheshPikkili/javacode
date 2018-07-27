package com.ojas.arralist;

import java.util.ArrayList;


public class TrimCapacitySize {
	public static void main(String[] args) {
	ArrayList<String> list_Strings = new ArrayList<String>(10);
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		 list_Strings.trimToSize();
		  
	}

}
