package com.dbit.ABSTRACTIONandINTERFACE;

abstract class remote
{
	abstract void On();
	abstract void Off();
}
class Tv extends remote
{
	void On()
	{
		System.out.println("the TV is on");
	}
	void Off()
	{
		System.out.println("the TV is off");
	}

}
public class Demo3 //ABSTRACTION USING THE ABSTRACT CLASS
{
	public static void main(String[] args) 
	{
		remote r;
		r = new Tv();
		r.On();
		r.Off();
		
	}

}
