package com.ojas.arralist;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayLists {

	public static void main(String[] args) {
		 List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  List<String> list_Strings_More=new ArrayList<String>();
		  list_Strings_More.add("yellow");
		  list_Strings_More.add("Pink");
		  list_Strings_More.addAll(list_Strings);
		  System.out.println(list_Strings_More);
		  
	}
}
