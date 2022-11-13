package com.dbit.Exceptionhandling;

public class Demo2 //RUN-TIME STACK OR Exception object propagation
{
	public static void wakeup()
	{
		sleep();
		System.out.println("in wakeup method");
	}

	public static void sleep()
	{
		System.out.println("in sleep method");
	}

	public static void main(String[] args) 
	{
		wakeup();
		System.out.println("in main method");
	}

}
