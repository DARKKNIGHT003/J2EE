package com.dbit.MULTITHREADING;

class ChildThread extends Thread
{
	public void run()
	{
		for (int i =1 ;i<=10 ;i++ )
		{
			System.out.println("Child Thread");
		}
	}
}
public class Demo10 {

	public static void main(String[] args)
	{
		ChildThread ct = new ChildThread();
		ct.start();
		ct.setPriority(10);
		for (int i =1 ;i<=10 ;i++ )
		{
			System.out.println("Main Thread");
		}
		System.out.println(ct.getPriority());

	}

}
