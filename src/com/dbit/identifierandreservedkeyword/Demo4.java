package com.dbit.identifierandreservedkeyword;

public class Demo4 //Reserved Keyword
{
	public static void main(String[] args)
	{
		int Exception = 10;
		System.out.println(Exception);
		
		String String = "sagar";
		System.out.println(String);
		
		int System = 10;//if we want to use "System" as class name then we have to use its fully qualified
		//System.out.println(System);//if we use "System" as class name then compiler will rise an error
	}

}
