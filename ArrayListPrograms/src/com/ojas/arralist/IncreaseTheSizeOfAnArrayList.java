package com.ojas.arralist;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class IncreaseTheSizeOfAnArrayList {
	static final Logger logger = Logger.getLogger(IncreaseTheSizeOfAnArrayList.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		ArrayList<String> list_Strings = new ArrayList<String>(10);
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		list_Strings.ensureCapacity(15);

		for (Object object : list_Strings) {

			logger.debug(object);
		}
	}
}
