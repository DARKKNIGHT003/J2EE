package com.dbit.MULTITHREADING;

class MyThread10 extends Thread
{
	public void run()
	{
		System.out.println("child thread");

	}
	
}
public class Demo7 
{
	public static void main(String[] args)
	{
		System.out.println("main method");
		MyThread10 mt = new MyThread10();
		Thread t1 = new Thread(mt);
		mt.start();
	}

}
