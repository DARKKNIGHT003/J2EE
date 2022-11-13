package com.dbit.constructors;

class Student4 // SHADOWING PROBLEM 
{
	private String name;
	private int age;

	Student4(String name,int age)
	{
		name=name;
		age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
public class Demo3 
{
	public static void main(String[] args) 
	{
		Student4 s1= new Student4("ramu",21);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());

	}

}
