package com.dbit.VARIABLES;

public class Demo3 //JVM always gives default values for the static variables
{
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bo;
	static char ch;
	static String st;
	public static void main(String[] args) //If the values of static variable is modified then it will be reflected on all the objects
	{
		Demo3 d3 = new Demo3();
		System.out.println(d3.b);		//--> 0
		System.out.println(d3.s);		//--> 0
		System.out.println(d3.i);		//--> 0
		System.out.println(d3.l);		//--> 0
		System.out.println(d3.f);		//--> 0.0
		System.out.println(d3.d);		//--> 0.0
		System.out.println(d3.bo);		//--> false
		System.out.println(d3.ch);		//--> space
		System.out.println(d3.st);		//--> null

	}

}
