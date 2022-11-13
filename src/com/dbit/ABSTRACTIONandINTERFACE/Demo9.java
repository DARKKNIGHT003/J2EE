package com.dbit.ABSTRACTIONandINTERFACE;

interface Calculate3
{
	void add();
	void sub();
}
class Calculator3 implements Calculate3
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a,b,c;
		a=20;
		b=05;
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);
	}

}
public class Demo9 //INTERFACE
{
	public static void main(String[] args) 
	{
		Calculate3 c;
		Calculator3 cal = new  Calculator3();
		c = cal;
		c.add();
		c.sub();
		//c.mul(); --> 
		((Calculator3)(c)).mul();		// --> downcasting 
	}

}
