package com.dbit.Exceptionhandling;

import java.util.Scanner;

public class Demo4 //finally block
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter the value of A");
			int a = sc.nextInt();
		
			System.out.println("enter the value of B");
			int b = sc.nextInt();

			System.out.println(a/b);
		}
		catch (Exception e)
		{
			System.out.println("invalid");
		}

		finally 
		{
			System.out.println("finally executed..!");
		}

	}

}
