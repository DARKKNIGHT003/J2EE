package com.dbit.Exceptionhandling;

import java.util.Scanner;

public class Demo8 //'throw' keyword
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of A");
		int a = sc.nextInt();
		System.out.println("enter the value of B");
		int b = sc.nextInt();
		System.out.println(divide(a,b));
	}
	public static int divide (int a ,int b)
	{
		if (b<0)
		{
			throw new ArithmeticException ("/ by zero");
		}
		else if(b>a)
		{
			throw new ArithmeticException ("b>a");
		}
		return a/b;
	}

}
