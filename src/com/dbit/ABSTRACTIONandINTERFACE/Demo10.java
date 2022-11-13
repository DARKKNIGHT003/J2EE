package com.dbit.ABSTRACTIONandINTERFACE;

interface calculate6
{
	void add();
	void sub();
}
interface calculate7
{
	void mul();
}
abstract class calculator implements calculate6,calculate7
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public abstract void sub();
	public abstract void mul();
}
class juniorCalculator4 extends calculator
{
	public void sub()
	{
		int a,b,c;
		a=20;
		b=10;
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		int a,b,c;
		a=10;
		b=10;
		c=a*b;
		System.out.println(c);
	}

	
}

public class Demo10 //INTERFACE
{
	public static void main(String[] args) 
	{
		juniorCalculator4 jc = new juniorCalculator4();
		//jc.add();
		jc.sub();
		jc.mul();
	}

}
