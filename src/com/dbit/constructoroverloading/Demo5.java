package com.dbit.constructoroverloading;

class A4
{
	A4()
	{
			System.out.println("inside default constructor");
		
	}
	void A4()
	{
		//this(); //call to this must be first statement in constructor this()
		System.out.println("inside default constructor");
	}
	
}
public class Demo5 
{
	public static void main(String[] args) //RULE3:this() can be used or placed only within the constructor but not in any method
	{
		A4 a = new A4();
		
	}

}
