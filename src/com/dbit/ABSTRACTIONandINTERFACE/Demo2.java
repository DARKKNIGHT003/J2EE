package com.dbit.ABSTRACTIONandINTERFACE;

class Calc
{
	int a;
	int b;
	void add()							// concrete method
	{
		a=10;
		b=20;
		int c=a+b;
		System.out.println(c);
	}
	void sub()							// concrete method
	{
		a=20;
		b=10;
		int c=a-b;
		System.out.println(c);
	}
}

public class Demo2 //EXAMPLE FOR  NORMAL CLASS WITHOUT OBJECT OREIENTATION FEATURES
{
	public static void main(String[] args) 
	{
		Calc c = new Calc();
		c.add();
		c.sub();
	}

}
