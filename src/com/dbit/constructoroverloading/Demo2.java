package com.dbit.constructoroverloading;

class A1 //this() constructor call
{
	A1()
	{
		this("ramu");
		System.out.println("inside default constructor");
	}
	A1(int x)
	{
		this();
		System.out.println("inside parametrized constructor");
	}
	A1(String s)
	{
		System.out.println("inside String parametrized constructor");
	}	

}
public class Demo2 
{
	public static void main(String[] args) 
	{
		A1 a = new A1(18);
	}

}
