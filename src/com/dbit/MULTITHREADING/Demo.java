package com.dbit.MULTITHREADING;

import java.util.*;

class sample1
{
	public void sq_num() //throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
			//Thread.sleep(2000);
			System.out.println("sq_num"+(i*i));
		}
	}
}
class sample2
{
	public void double_num() //throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
			//Thread.sleep(2000);
			System.out.println("double_num"+(i*2));
		}
	}
}
public class Demo //SINGLE- THREADED APPLICATION
{
	public static void main(String[] args)
	{
		System.out.println("main method..!");
		sample1 s1= new sample1();
		sample2 s2 = new sample2();
		
		s1.sq_num();
		s2.double_num();
	}

}
