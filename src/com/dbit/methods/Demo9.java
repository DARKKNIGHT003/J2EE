package com.dbit.methods;

class Student2 //By creating Public setter and getter methods in order to access and view the data
{
	private String name;
	private int age;
	private int roll_no;

	public void SetData(String sname, int sage, int sroll_no)
	{
		name=sname;
		age=sage;
		roll_no=sroll_no;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getRoll_no()
	{
		return roll_no;
	}

}
public class Demo9 //OBJECT ORIENTATION FEATURES
{
	public static void main(String[] args) //ENCAPSULATION
	{
		Student2 s2=new Student2();
		s2.SetData("raju",21,84);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getRoll_no());

	}

}
