package com.dbit.constructors;

class Student8 // PARAMETERIZED CONSTRUCTOR
{
	String name;
	int age;
	Student8(String name)
	{
		this.name=name;						
	}
	public String getName()
	{
		return name;
	}
	
}
public class Demo7 
{
	public static void main(String[] args)
	{
		Student8 s1 = new Student8("RAMU");
		System.out.println(s1.getName());
	}

}
