package com.dbit.MULTITHREADING;

public class Demo9 //IN-BUILT METHODS AVAILABLE IN THREAD CLASS
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Thread t = new Thread();
		System.out.println(t.getPriority());
		t.setPriority(7);
		System.out.println(t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY-2);
		System.out.println(t.getPriority());
		t.setPriority(12);
	}

}
