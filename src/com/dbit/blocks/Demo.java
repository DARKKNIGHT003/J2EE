package com.dbit.blocks;

class A
{
	A()
	{
		System.out.println("inside the default constructor");
	}
	A(int x)
	{
		System.out.println("inside the parametrized constructor");
	}
	{
		System.out.println("inside the instance block");
	}
}
public class Demo //instance methods and instance block
{
	public static void main(String[] args) 
	{
		A a =new A();
	}

}
