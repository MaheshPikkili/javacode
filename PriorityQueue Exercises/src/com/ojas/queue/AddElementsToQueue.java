package com.ojas.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class AddElementsToQueue {
	public static void main(String[] args) {
		
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");

		Iterator<String> elements = priorityQueue.iterator();
		System.out.println("PriorityQueue elements");
		while(elements.hasNext()) {
		System.out.println(elements.next());
		}
	}

}
