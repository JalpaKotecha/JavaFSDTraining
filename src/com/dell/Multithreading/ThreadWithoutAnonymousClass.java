package com.dell.Multithreading;

public class ThreadWithoutAnonymousClass {

	public static void main(String[] args) {
		ThreadABC t1 = new ThreadABC();
		//t1.run();
		Thread thrd = new Thread(t1);
		thrd.run();
	}

}
class ThreadABC  implements Runnable{
	
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("ThreadABC :: Hello");
		}
	}
}