package com.dbit.Exceptionhandling;

import java.util.Scanner;

public class Demo5 //EXCEPTION OBJECT
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of A");
			int a = sc.nextInt();
		
			System.out.println("enter the value of B");
			int b = sc.nextInt();

			System.out.println(a/b);
		}
		catch (Exception e)
		{
			e.printStackTrace();	// name cause and path
			System.out.println();
			System.out.println(e);	//name cause
			System.out.println();
			System.out.println(e.getMessage());	//cause
		}

	}

}
