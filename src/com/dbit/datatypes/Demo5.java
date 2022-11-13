package com.dbit.datatypes;

public class Demo5 //Implicit Type Casting
{
	public static void main(String[] args)
	{
		char c='A';
		int i=c;////Char internal data representation is compatible with int
		System.out.println(c+" "+i);
	}

}
