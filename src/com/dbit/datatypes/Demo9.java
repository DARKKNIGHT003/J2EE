package com.dbit.datatypes;

public class Demo9 //Explicit Type Casting
{
	public static void main(String[] args) 
	{
		int i=130;
		byte b=(byte)i;//again storing the integer value which is out of range value in byte
		System.out.println(i+" "+b);
	}

}
