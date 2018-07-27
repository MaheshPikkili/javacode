package com.ojas.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class AddAllElements {
	public static void main(String[] args) {
		
		
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");

		

		PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(priorityQueue);
		
		Iterator<String> elements = priorityQueue1.iterator();
		System.out.println("PriorityQueue elements");
		while(elements.hasNext()) {
		System.out.println(elements.next());
		}
	}

}
