package com.dbit.constructors;

class Student6
{
	String name;
	int age;
	
	Student6()
	{
		name="ramu";						// USER DIFIEND CONSTRUCTOR
		age=21;
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

public class Demo5 //TYPES OF CONSTRUCTOR
{
	public static void main(String[] args) //USER DIFIEND DEFAULT CONSTRUCTOR
	{
		Student6 s1 = new Student6();
		System.out.println(s1.getName());
		System.out.println(s1.getAge());

	}

}
