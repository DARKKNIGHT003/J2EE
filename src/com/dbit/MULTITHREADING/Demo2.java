package com.dbit.MULTITHREADING;

//overloading of run method

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("no-parameter");

	}
	public void run( int i )
	{
		System.out.println("one-parameter");

	}

}
public class Demo2
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.run(5);
		System.out.println("main method");
	}

}
