package com.dell.Multithreading;
//Employee demo
//Two classes are extending thread class here

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram thrd1 = new Ram();
		John thrd2 = new John();
		thrd1.start();
		thrd2.start();

	}

}
class Ram extends Thread {
	@Override //This uses run method from Thread class, hence we use override here
	public void run()
	{
		System.out.println("Ram thread is running");
	}
}

class John extends Thread {
	@Override
	public void run()
	{
		System.out.println("John thread is running");
	}
	
}