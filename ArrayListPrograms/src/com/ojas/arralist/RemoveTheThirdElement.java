package com.ojas.arralist;

import java.util.ArrayList;

public class RemoveTheThirdElement {

public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("White");
		list.add("Block");
		list.add("Green");
		list.add("Blue");
		list.add("Red");
		for (Object o : list) {
			
			System.out.println(o);
		}
		//remove the third element from a array list
		list.remove(2);
		
		System.out.println("--------------------After Removed 3rd Element ----------------");
for (Object o : list) {
			
			System.out.println(o);
		}
		}



	
}
