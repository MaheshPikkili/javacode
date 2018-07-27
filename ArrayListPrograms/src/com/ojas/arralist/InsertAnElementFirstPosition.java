package com.ojas.arralist;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class InsertAnElementFirstPosition {

	static final Logger logger = Logger.getLogger(InsertAnElementFirstPosition.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		ArrayList<Object> list=new ArrayList<>();
		
		list.add(0, "Ojas");
		list.add(1,"Mahesh");
		
		for (Object object : list) {
			
			logger.debug(object);
		}
		
	}
}
