package com.dbit.string;

public class Demo25 // example for finding the last occurrence for the given sun-string 
{
	public static void main(String[] args) 
	{
		String s1 = "join study online to study online";
		System.out.println(s1);
		int a = s1.lastIndexOf("study");
		if (a == -1)
		{
			System.out.println("sub  string is not found");
		}
		else
		{
			System.out.println("sub string found at the index : "+ a);
		}
	}

}
