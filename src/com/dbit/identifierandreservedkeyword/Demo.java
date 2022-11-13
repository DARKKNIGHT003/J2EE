package com.dbit.identifierandreservedkeyword;

public class Demo // checking Identifiers should never starts with the digits
{
	public static void main(String[] args) //main method
	{
		int a = 10;
		int A = 10;
		
		//String 18vk = "virat"; //this line don't have the identifier rules
		String vk18 = "virat"; //this having the correct form of identifier rules
		//String vk@18 = "virat";
		String vk$18 = "virat";
		String v_k18 = "virat";
		System.out.println(v_k18); //print the statement
	}

}
