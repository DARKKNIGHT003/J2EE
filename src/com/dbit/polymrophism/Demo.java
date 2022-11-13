package com.dbit.polymrophism;

class A 
{
	int x = 10;	//IV of parent class
}
class B extends A
{
	int x=20;  	//IV child class
	void fun2()
	{
		System.out.println(x);			// 20
		System.out.println(this.x);		// 20
		System.out.println(super.x);		// 10

	}
}
public class Demo //super keyword
{
	public static void main(String[] args)
	{
		B b1 =new B();
		b1.fun2();
	}

}
