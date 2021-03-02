package com.dell.javacollections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestArrayDequeue {

	//WAP to Create integer queue with data insertion from both the ends and start iterating over queue
	public static void main(String[] args)
	{
		Queue<Integer> numberQueue = new PriorityQueue<Integer>();
		numberQueue.add(10);
		numberQueue.add(20);
		numberQueue.add(30);
		numberQueue.add(40);
		numberQueue.add(50);
		
		System.out.println(numberQueue);
		
		//peek head element
		System.out.println("Head: " +numberQueue.peek());
		
		//Remove head element
		System.out.println("Head: " +numberQueue.poll());
		System.out.println("Head: " +numberQueue.peek());
		
		ArrayDeque<Integer> numq = new ArrayDeque<Integer>();
		numq.addFirst(90);
		numq.add(0);
		numq.add(1);
		numq.add(2);
		numq.add(3);
		numq.addLast(50);
		for(Integer i : numq)
		{
			System.out.println(numq);
		}
		
	}
}
