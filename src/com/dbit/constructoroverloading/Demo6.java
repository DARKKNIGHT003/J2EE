package com.dbit.constructoroverloading;

class A6
{
	A6()
	{
			//super()			//--> added by the compiler
			System.out.println("inside default constructor");
		
	}
	
	
}
public class Demo6 //this() and super()
{
	public static void main(String[] args) 
	{
		A6 a=new A6();

	}

}
