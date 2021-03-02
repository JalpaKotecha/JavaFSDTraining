package com.dell.Multithreading;

public class ExtendingThreadDemo extends Thread {
	public static void main(String[] args)
	{
		ExtendingThreadDemo mainT = new ExtendingThreadDemo(); //
		mainT.start(); //Goes into runnable state and automatically it calls run method internally from Thread class
	}
public void run()
{
	System.out.println("Main Thread is running");
}
}
