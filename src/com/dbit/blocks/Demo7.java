package com.dbit.blocks;

class Test //STATIC METHODS
{
	void fun1()
	{
		System.out.println("inside the instance method");
	}
	static void fun2()
	{
		System.out.println("inside the static  method");
	}
}
public class Demo7 
{
	public static void main(String[] args) 
	{
		Test t1 =new Test();
		t1.fun1();
		t1.fun2();
		
		Test.fun2();
	}

}
