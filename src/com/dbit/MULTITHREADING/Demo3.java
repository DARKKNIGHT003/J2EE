package com.dbit.MULTITHREADING;

//override of start method.

class MyThread5 extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");

	}

}
public class Demo3 
{
	public static void main(String[] args) 
	{
		MyThread5 t1 = new MyThread5();
		t1.start();
		System.out.println("main method");
	}

}
