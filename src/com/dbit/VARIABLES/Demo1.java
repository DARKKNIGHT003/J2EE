package com.dbit.VARIABLES;

public class Demo1 //INSTANCE VARIABLE
{
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bo;
	char ch;
	
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();		//--> 0
		System.out.println(d1.b);	//--> 0
		System.out.println(d1.s);	//--> 0
		System.out.println(d1.i);	//--> 0
		System.out.println(d1.l);	//--> 0
		System.out.println(d1.f);	//--> 0.0
		System.out.println(d1.d);	//--> 0.0
		System.out.println(d1.bo);	//--> false
		System.out.println(d1.ch);	//--> space 
		//System.out.println(d1.st);	//--> null

	}

}
