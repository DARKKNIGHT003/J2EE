package com.dbit.inheritances;

//Single level inheritance
class Father 
{
	void property()
	{
		System.out.println("Father having a beautiful bunglow..!");
	}
	
}
class Son extends Father	
{
}
public class Demo6 //TYPES OF INHERITANCE
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.property();
	}

}
