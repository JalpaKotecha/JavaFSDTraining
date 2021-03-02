package com.dell.Multithreading;


class Counter{
	int count;
	
	//make increase count thread safe - use synchronized keyword
	public synchronized void increaseount() //thread safe
	{
		count++;
		
	}
	public void decreaseCount() //not thread safe
	{
		count--;
	}
}
public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
Thread t1 = new Thread(()-> //(->) is lamda expression which is used to implement runnable interface
//you can create runnable object to implement runnable interface or can use lambda exp as above. 
{
	for(int i=1; i<=1000;i++)
	{
		counter.increaseount();
	}
});

Thread t2 = new Thread(()->
{
	for(int i=1; i<=1000;i++)
	{
		counter.increaseount();
	}
});
t1.start();
t2.start(); //t1 and t2 - both threads will start at the same time Everytime we run this we get diff values that means increasecount and 
//decreasecount functionality are not thread safe here. 


t1.join();
t2.join();
t1.stop();
System.out.println(t1.getId());
System.out.println(t2.getId());
System.out.println("The count:: " + counter.count);

	}

}
