package com.dbit.ABSTRACTIONandINTERFACE;

abstract class Bank
{
	abstract void roi();				// 100% abstraction 
	
}
class Sbi extends Bank
{
	void roi()
	{
		System.out.println("intrest rate is 7.5%");
	}
}
class Hdfc extends Bank
{
	void roi()
	{
		System.out.println("intrest rate is 8.5%");
	}
}
class Icici extends Bank
{
	void roi()
	{
		System.out.println("intrest rate is 9.5%");
	}
}
public class Demo1 
{
	public static void main(String[] args)
	{
		//Bank b =new Bnak();
				Bank b;

				b = new Sbi();								// upcasting 
				b.roi();
				
				b = new Hdfc();								// upcasting 
				b.roi();
				
				b = new Icici();								// upcasting 
				b.roi();
	}

}
