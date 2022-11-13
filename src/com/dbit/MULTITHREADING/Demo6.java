package com.dbit.MULTITHREADING;

class MyThread8 implements Runnable
{
	public void run()
	{
		try
		{
			for (int i=1;i<=5 ;i++ )
			{
				Thread.sleep(2000);
				System.out.println("sq_num: "+(i*i));
			}
		}
		catch (InterruptedException e)
		{
		}
	}
}
class MyThread9 implements Runnable
{
	public void run()
	{
		try
		{
			for (int i=1;i<=5 ;i++ )
			{
				Thread.sleep(2000);
				System.out.println("db_num: "+(i*2));
			}
		}
		catch (InterruptedException e)
		{
		}
	}
}
public class Demo6 //CREATION OF THREADS BY IMPLEMENTING RUNNABLE INTERFACE
{
	public static void main(String[] args) 
	{
		System.out.println("main method");
		MyThread8 r1 = new MyThread8();
		MyThread9 r2 = new MyThread9();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}

}
