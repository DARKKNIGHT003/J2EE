package com.dbit.ABSTRACTIONandINTERFACE;

abstract class DemoA
{
	public DemoA()
	{
		System.out.println("parent constructor");
	}
	abstract void fun1();
}
class DemoB extends Demo
{
	/* public Demo1()
		{
			super();
		}
	*/

	void fun1()
	{
		System.out.println("inside the child class fun1 method");
	}
}

public class Demo5 //RULE 3:RULES W.R.T ABSTRACTION
{
	public static void main(String[] args) 
	{
		DemoB d =new DemoB();
		d.fun1();
	}

}
