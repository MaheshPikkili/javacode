package com.ojas.queue;

import java.util.PriorityQueue;

public class NumberOfElements {
	public static void main(String[] args) {
		

		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");
		
		System.out.println("NUmnber of Elements : "+priorityQueue.size());
	}

}
