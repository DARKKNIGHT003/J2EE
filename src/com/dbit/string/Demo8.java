package com.dbit.string;

public class Demo8 //inbuilt methods in strings
{
	public static void main(String[] args) 
	{
		String s1 = new String("virat");	//ncp d!
		String s2 = new String("rohit");	//ncp d!

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.toUpperCase());		//VIRAT
		System.out.println(s2.toLowerCase());		//ROHIT

		System.out.println(s1.length());		//5

		System.out.println(s1.startsWith("vi"));	//true
		System.out.println(s1.endsWith("at"));		//true

		System.out.println(s2.contains("ohi"));	//true

		System.out.println(s1.indexOf("r"));		//2		

		System.out.println(s1.charAt(4));		//t
	}

}
