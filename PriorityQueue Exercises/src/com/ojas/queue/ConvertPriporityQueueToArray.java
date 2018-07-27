package com.ojas.queue;

import java.util.PriorityQueue;

public class ConvertPriporityQueueToArray {
public static void main(String[] args) {
	
	
	PriorityQueue<String> priorityQueue = new PriorityQueue<>();
	priorityQueue.add("Orange");
	priorityQueue.add("Yellow");
	priorityQueue.add("Green");
	priorityQueue.add("Blue");
	priorityQueue.add("Maroon");
	
	Object object[]=priorityQueue.toArray();
	for (Object object2 : object) {
		System.out.println(object2);
	}
}
}
