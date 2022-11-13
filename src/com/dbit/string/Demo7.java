package com.dbit.string;

public class Demo7  //CONCATINATION OF TWO STRINGS
{
	public static void main(String[] args)
	{
		String s1 = "raghu";
		String s2 = "raghurama";
		System.out.println(s1 == s2);				// false
		
		String s3 = new String("raghu");
		String s4 = new String("raghurama");
		System.out.println(s3 == s4);				// false
		System.out.println(s2.equals(s4));			// true
		String s5 = "raghurama";
		String s6 = "raghu"+"rama";
		String s7 = s1+"rama";
		System.out.println(s6==s7);                 // false

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);

	}

}
