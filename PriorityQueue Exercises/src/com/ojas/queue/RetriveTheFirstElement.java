package com.ojas.queue;

import java.util.PriorityQueue;

public class RetriveTheFirstElement {
	public static void main(String[] args) {
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");
		System.out.println(priorityQueue.poll());
	
		
	}

}
