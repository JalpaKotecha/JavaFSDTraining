package com.dell.Multithreading;

//Class is extending another class and implements runnable interface

public class ThreadDemo3 {
public static void main(String[] args)
{
	//Creating Thread class instance for Bob
	Bob b1 = new Bob();
	//Pass Bob instance to Thread instance
	Thread t1 = new Thread(b1);
	t1.start();
}
}
class Bob extends Work implements Runnable {
	
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Bob:: Hi");
		}
	}
	
	
}
class Work
{
	public void coding(String name)
	{
		System.out.println("-- Coding --");
	}
}
