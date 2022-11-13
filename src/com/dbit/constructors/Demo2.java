package com.dbit.constructors;

class Student2 //using the constructors
{
	String name;
	int roll_no;

	Student2(String sname,int sroll_no)
	{
		name=sname;
		roll_no=sroll_no;
		System.out.println(name);
		System.out.println(roll_no);
	}
}
public class Demo2 
{
	public static void main(String[] args)
	{
		Student2 s2 = new Student2("bheem",28);
		Student2 s3 = new Student2("somu",89);
	}

}
