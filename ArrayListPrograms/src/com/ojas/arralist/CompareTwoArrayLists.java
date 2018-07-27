package com.ojas.arralist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

// TODO: Auto-generated Javadoc
/**
 * The Class CompareTwoArrayLists.
 *
 * @author pmahesh
 */
public class CompareTwoArrayLists {
	
	
	
	/** The logger. */
	private static  Logger logger = Logger.getLogger(CompareTwoArrayLists.class);
	
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	
	
	public static void list()
	{

		List<String> listOfStrings=null;
		ArrayList<String> list=null;
		 listOfStrings = new ArrayList<String>();
		  listOfStrings.add("Red");
		  listOfStrings.add("Green");
		  listOfStrings.add("Black");
		  listOfStrings.add("Orange");
		  listOfStrings.add("White1");
		  
		  
		  list=new ArrayList<>();
			list.add("White");
			list.add("Black"); list.add("Green");
			list.add("Orange");
			list.add("Red");
			Collections.sort(list);
			Collections.sort(listOfStrings);
			logger.error("THis is error");
			
			logger.debug("THis is debug");
			logger.fatal("Fatal");
			if(list.equals(listOfStrings))
			{
				logger.debug("Both Lists are Equal");
			}
		else {
			logger.debug("Two lists are Different");
		}
		
	}
	
	public static void main( final String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		list();
	
		
	}

}
