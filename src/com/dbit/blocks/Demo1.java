package com.dbit.blocks;

class A1
{
	{
		System.out.println("inside the first instance block");
	}
	{
		System.out.println("inside the second instance block");
	}
	{
		System.out.println("inside the third instance block");
	}
}
public class Demo1 
{
	public static void main(String[] args)
	{
		A1 a =new A1();
	}

}
