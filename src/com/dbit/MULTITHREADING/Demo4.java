package com.dbit.MULTITHREADING;

class MyThread6 extends Thread
{
	public void run()
	{
		System.out.println("child thread");
	}
}
public class Demo4 //SETTING AND GETTING THE THREAD NAMES
{
	public static void main(String[] args) 
	{
		System.out.println("main method starts..!");
		System.out.println(Thread.currentThread().getName());
		MyThread6 t1 = new MyThread6();
		t1.start();
		System.out.println(t1.getName());
		Thread.currentThread().setName("sagar");
		System.out.println(Thread.currentThread().getName());
		t1.setName("sandesh");
		System.out.println(t1.getName());
		System.out.println(10/0);
	}

}
