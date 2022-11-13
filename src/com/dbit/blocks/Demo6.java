package com.dbit.blocks;

class A6 //// Static blocks
{
	 int x;
	 static int y;
	
	{
		x=10;
		System.out.println("inside the instance block");
		System.out.println(x);
	}
	static
	{
		y=20;
		System.out.println("inside the static block");
		System.out.println(y);
	}
	A6()
	{
		System.out.println("iniside the constructor ");
	}
}
public class Demo6 
{
	public static void main(String[] args) 
	{
		A6 a =new A6();
	}

}
