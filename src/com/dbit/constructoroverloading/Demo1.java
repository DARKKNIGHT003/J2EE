package com.dbit.constructoroverloading;

class A //this() constructor call
{
	A()
	{
		System.out.println("inside default constructor");
	}
	A(int x)
	{
		this();
		System.out.println("inside parametrized constructor");
	}

}
public class Demo1
{
	public static void main(String[] args) 
	{
		A a = new A(18);
	}

}
