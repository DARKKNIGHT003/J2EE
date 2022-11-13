package com.dbit.constructors;

class A //THE DIFFERENCE B/W CONSTRUCTOR AND METHOD
{
	A()
	{
		System.out.println("Inside the constructor");
	}
	void A()
	{
		System.out.println("Inside the method");
	}
}
public class Demo6 
{
	public static void main(String[] args) 
	{
		A a1= new A();
		a1.A();
		a1.A();
	}

}
