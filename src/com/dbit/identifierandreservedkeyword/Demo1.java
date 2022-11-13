package com.dbit.identifierandreservedkeyword;

public class Demo1 // checking the Java is case sensitive in case of identifiers
{
	public static void main(String[] args) //main method
	{
		int sachin = 10; //first example of case sensitive
		System.out.println(sachin);
		
		int SACHIN = 100;// second example of case sensitive 
		System.out.println(SACHIN);
		
		int Sachin = 99;//third example of case sensitive
		System.out.println(Sachin);
	}

}
