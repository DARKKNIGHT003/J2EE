package com.dbit.constructoroverloading;

class A3
{
	A3()// recursive constructor invocation A()
	{
		//this();
		System.out.println("inside default constructor");
		
	}
	
}
public class Demo4 
{
	public static void main(String[] args) //RULE2:-this() constructor call can not be recurrsive in nature
	{
		A3 a = new A3();
	}

}
