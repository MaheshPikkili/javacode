package com.ojas.queue;

import java.util.PriorityQueue;

public class RetriveAndRemoveFirstElement {
	public static void main(String[] args) {
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow1");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");
		
		//retrieve the first element of the priority queue
	System.out.println(priorityQueue.peek());
	}

}
