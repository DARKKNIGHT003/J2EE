package com.dbit.blocks;

class Student
{
	int register_number;
	
	{
		
		System.out.println("WELCOME TO Java Sessions..!");
	}
	Student()
	{
		register_number=20;
		System.out.println("your registration number is :" +register_number);
	
	}
	Student(int x)
	{
		register_number = x;
		System.out.println("your registration number is :" +register_number);

	}
}
public class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("inside the main method");
				Student s1 =new Student();
				Student s2 =new Student(21);
	}

}
