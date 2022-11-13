package com.dbit.Exceptionhandling;

import java.util.*;

class DistinctionException extends RuntimeException
{
	DistinctionException(String exp_msg)
	{
		super(exp_msg);
	}
		
}
class FirstClassException extends RuntimeException
{
	FirstClassException(String exp_msg)
	{
		super(exp_msg);
	}
}
class SecondClassException extends RuntimeException
{
	SecondClassException(String exp_msg)
	{
		super(exp_msg);
	}
}

public class Demo9 //USER-DIFIEND EXCEPTION or CUSTOMIZED EXCEPTION 
{
	public static void main(String[] args) 
	{
		System.out.println("welcome to grade checking app..!");
		System.out.println("Enter your total percentage");
		Scanner sc = new Scanner(System.in);
		int percentage = sc.nextInt();
		if (percentage>=75)
		{
			throw new DistinctionException("Distinction ....congrats");
		}
		else if (percentage>=60)
		{
			throw new FirstClassException("FirstClass ....still you have scope to improve");
		}
		else if (percentage>=35)
		{
			throw new SecondClassException("SecondClass ....work hard to get good marks..!");
		}
		else
		{
			System.out.println("Fail ... better luck next time...!");
		}

	}

}
