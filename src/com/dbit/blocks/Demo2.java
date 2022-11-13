package com.dbit.blocks;

class A2
{
	//int a=10;
	A2()
	{
		System.out.println("inside the constructor");
	}

	{
		System.out.println("inside the instance block");
	}
	
	float f = 12.14f;
	void fun()
	{
		System.out.println("inside the instance method");
	}
}
public class Demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("inside the main method");
		A2 a =new A2();
		//a.fun();
	}

}
