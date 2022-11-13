package com.dbit.constructors;

class Student //using the reference variable
{
	String name;
	int roll_no;
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name ="raju";
		s1.roll_no = 84;
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
	}

}
