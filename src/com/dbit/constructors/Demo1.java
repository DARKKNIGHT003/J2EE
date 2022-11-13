package com.dbit.constructors;

class Student1
{
	String name;
	int roll_no;

	public void SetData(String sname, int sroll_no)
	{
		name=sname;
		roll_no=sroll_no;
	}
	public String getName()
	{
		return name;
	}
	public int getRoll_no()
	{
		return roll_no;
	}
}
public class Demo1 //using the methods
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1();
		s1.SetData("somu",89);
		System.out.println(s1.getName());
		System.out.println(s1.getRoll_no());
	}

}
