package com.dbit.string;

public class Demo9 //intern() method
{
	public static void main(String[] args)
	{
		String s1 = new String("sagar");		//ncp d!
		String s2 = s1.intern();				//cp d
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}

}


