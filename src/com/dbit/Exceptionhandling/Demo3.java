package com.dbit.Exceptionhandling;


import java.util.*;

public class Demo3 //MULTIPLE CATCH BLOCK
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
		catch(ArithmeticException e)
		{
			System.out.println("learn maths..!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("plz enter valid inputs ");
		}

		catch (Exception e)
		{
			System.out.println("invalid");
		}

	}

}
