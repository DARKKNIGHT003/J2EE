package com.dbit.inheritances;

class A // // note3:the instance variable of the parent class
{
	int i =10;			// parent class or super class
}
class B extends A		
{
	int j = 20;
}

public class Demo 
{
	public static void main(String[] args) 
	{
		B b= new B();
		System.out.println(b.i);
		System.out.println(b.j);
	}

}
