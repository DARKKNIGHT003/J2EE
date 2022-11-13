package com.dbit.VARIABLES;

public class Demo2 //STATIC VARIABLE
{
	String name;
	int addhar_no;
	static String nationality="Indian";
	public static void main(String[] args) 
	{
		//People p1 = new People();

		System.out.println(nationality);		// directly we can access
		//System.out.println(p1.nationality);		// using object reference 
		//System.out.println(People.nationality);		// using class name [recommended]
	}
	//System.out.println(nationality);
}
