package com.dbit.string;

public class Demo6 //CONCATINATION OF TWO STRINGS
{
	public static void main(String[] args) 
	{
		String s1 = "raghu";
		String s2 = "raghurama";
		String s3 = "raghu";
		s1.concat(s3);
		s1= s1+"dg";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s3);

	}

}
