package com.ojas.queue;

import java.util.PriorityQueue;

public class QueueToStringRepresentation {
	public static void main(String[] args) {
		
		
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow1");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");
		// to convert a Priority Queue elements to a string representation
		System.out.println(priorityQueue.toString());
		
	}

}
