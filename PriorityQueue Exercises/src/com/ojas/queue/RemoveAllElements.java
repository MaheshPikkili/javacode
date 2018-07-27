package com.ojas.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class RemoveAllElements {

	public static void main(String[] args) {
		
		

		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");
	//remove all the elements from a priority queue.
		priorityQueue.clear();
		System.out.println(priorityQueue);

		
	}
}
