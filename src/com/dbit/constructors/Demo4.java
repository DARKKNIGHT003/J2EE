package com.dbit.constructors;

class Student5 // solution to the SHADOWING PROBLEM  by using 'this' keyword
{
	private String name;
	private int age;

	Student5(String name,int age)
	{
		this.name=name; //'this' keyword is used to solve the shadowing probelm
		this.age=age;
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
public class Demo4 
{
	public static void main(String[] args) 
	{

		Student5 s1= new Student5("ramu",21);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		Student5 s2= new Student5("somu",22);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
	}

}
