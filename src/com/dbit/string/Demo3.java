package com.dbit.string;

public class Demo3 // comparing the two strings using the equalsIgnoreCase() method
{
	public static void main(String[] args) 
	{
		String s1 = new String("raghu");
		String s2 = new String("RAGHU");
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String  are  not equal");
		}
	}

}
