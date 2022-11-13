package com.dbit.inheritances;

//multilevel inheritance
class GrandFather
{
	void business()
	{
		System.out.println("GrandFather had a great business..!");
	}
}

class Father1 extends GrandFather
{
	void property()
	{
		System.out.println("Father having a beautiful bunglow..!");
	}
	
}
class Son1 extends Father1	
{
}
public class Demo7 
{
	public static void main(String[] args)
	{
		Son1 s = new Son1();
		s.property();
		s.business();
	}

}
