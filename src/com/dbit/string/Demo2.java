package com.dbit.string;

public class Demo2 // comparing the two strings using the == symbol 
{
	public static void main(String[] args)
	{
		String s1 = new String("sagar");
		String s2 = new String("sagar");
		if(s1 == s2)
		{
			System.out.println("reference are equal");
		}
		else
		{
			System.out.println("refrence  are  not equal");
		}

	}

}
