package com.dell.javacollections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionDemo {

	public static void main(String[] args) {
		// TODO Queue is data structure which works in first in first out (FIFO) order
		
		//Queue : Priority queue : Does not order element in FIFO
		Queue <String> bankQueue = new PriorityQueue<String>();
		bankQueue.add("John");
		bankQueue.add("Wilson");
		bankQueue.add("Mike");
		bankQueue.add("Karan");
		
		System.out.println(bankQueue);
		
		//peek an element only prints head element
		System.out.println("Head: " + bankQueue.peek());
		
		//poll - prints element and removes element from queue
		System.out.println("Head: " + bankQueue.poll());
		
		//So now head element will be changed and queue will be re shuffled 
		System.out.println("Head: " + bankQueue.peek());
		
		//Iteration Over queue
		for(String n : bankQueue)
		{
			System.out.println(n);
		}
		
		//ArrayDequeue - Provides class facility and re sizable array and arrange elements unlikely queue
		//Element can be stored in both the orders or both the ends
		//Faster components 
		//There is no restriction in terms of inserting data i.e can be added in both the ends
		//It does not maintain FIFO order 
		ArrayDeque <String> queueFiles = new ArrayDeque<String>();
		queueFiles.addFirst("File");
		queueFiles.add("File 1");
		queueFiles.add("File 2");
		queueFiles.add("File 3");
		queueFiles.addLast("File 4");
		for(String f : queueFiles)
		{
			System.out.println(f);
		}
	}

}
