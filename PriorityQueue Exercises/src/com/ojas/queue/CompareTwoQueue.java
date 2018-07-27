package com.ojas.queue;

import java.util.PriorityQueue;

public class CompareTwoQueue {
	public static void main(String[] args) {
		
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Orange");
		priorityQueue.add("Yellow1");
		priorityQueue.add("Green");
		priorityQueue.add("Blue");
		priorityQueue.add("Maroon");
		
		
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
		priorityQueue1.add("Orange");
		priorityQueue1.add("Yellow");
		priorityQueue1.add("Green");
		priorityQueue1.add("Blue");
		priorityQueue1.add("Maroon");
		
		for(String priority:priorityQueue1)
		{
			System.out.println(priorityQueue1.contains(priority)?"TWO Queues are Equals":"TWO Queues are nOt Equals");
		}
	}

}
