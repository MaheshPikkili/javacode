package com.ojas.treeset;


import java.util.TreeSet;

public class CompareTwoTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("JAVA");
		set.add("C++");
		set.add("SQL");
		set.add("IDM");
		set.add("Testing");
		
		TreeSet<String> set1=new TreeSet<>();
		set1.add("JAVA");
		set1.add("C++");
		set1.add("SQL");
		set1.add("IDM");
		set1.add("Testing");
		set1.add("UI");
		
		if(set.size()==set1.size())
		{
			if(set.equals(set1))
			{
				System.out.println("Two sets are  equal");
			}
			else
			{
				System.out.println("Two sets are not equal ");
			}
		}
		else
		{
			System.out.println("Two sets are not equal ");
		}

		
	}
}
