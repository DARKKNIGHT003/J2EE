package com.dbit.Exceptionhandling;

import java.util.*;

public class Demo11 // multiple catch block in a single line
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter the value for A");
			int a = sc.nextInt();
			System.out.println("enter the value for B");
			int b = sc.nextInt();
			System.out.println(a/b);
		}
		catch (ArithmeticException | InputMismatchException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
