package com.dbit.constructoroverloading;

class A2
{
	A2()
	{
		System.out.println("inside default constructor");
		//this();     --> compilation error	
	}
	
}
public class Demo3 
{

	public static void main(String[] args) // RULE:1:-this() should be used as the first statement in the user defined constructor
	{
		A2 a = new A2();
	}

}
