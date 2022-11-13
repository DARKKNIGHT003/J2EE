package com.dbit.datatypes;

public class Demo4 //Implicit Type Casting
{
	public static void main(String[] args) 
	{
		char c='A'; //character value is storing in short
		//short s=c; //Compilation Error, Possible loss of precision
		
		//System.out.println(c+" "+s); //byte and short internal data representations are not compatible to convert into char
	}

}
