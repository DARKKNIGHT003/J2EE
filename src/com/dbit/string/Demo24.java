package com.dbit.string;

public class Demo24 // example for converting char array to string and vice-versa
{
	public static void main(String[] args) 
	{
		String s1 = "StudyOnline";
		System.out.println(s1);
		char a[] = s1.toCharArray();
		for (char ch :a )
		{
			System.out.println(ch);
		}
	}

}
