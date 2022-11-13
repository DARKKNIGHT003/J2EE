package com.dbit.MULTITHREADING;

class MyThread7 extends Thread
{
	public void run()
	{
		System.out.println("run method is executed by : "+Thread.currentThread().getName());
	}
}
public class Demo5 //SETTING AND GETTING THE THREAD NAMES
{
	public static void main(String[] args)
	{
		MyThread7 t1 = new MyThread7();
		t1.start();
		System.out.println("main method  is executed by: "+Thread.currentThread().getName());
	}

}
