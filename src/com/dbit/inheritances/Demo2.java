package com.dbit.inheritances;

class A2 // note5:Child class can call the instance method of parent class directly
{
	void fun1()
	{
		System.out.println("inside the fun1");
	}
}

class B2 extends A2		
{
	void fun2()
	{
		System.out.println("inside the fun2");
	}
}

public class Demo2 
{
	public static void main(String[] args) 
	{
		B2 b= new B2();
		b.fun2();
		b.fun1();
	}

}
