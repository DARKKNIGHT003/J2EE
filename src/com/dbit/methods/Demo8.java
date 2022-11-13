package com.dbit.methods;

class Student1  //By making the instance variable as private
{
	private String name;
	private int age;
	private int roll_no;

	public void SetName(String sname)
	{
		name=sname;
	}
	public void SetAge(int sage)
	{
		age=sage;
	}
	public void SetRoll_no(int sroll_no)
	{
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
public class Demo8 //OBJECT ORIENTATION FEATURES
{
	public static void main(String[] args) //ENCAPSULATION
	{
		Student1 s1=new Student1();
		s1.SetName("raju");
		System.out.println(s1.getName());
		s1.SetAge(21);
		System.out.println(s1.getAge());
		s1.SetRoll_no(84);
		System.out.println(s1.getRoll_no());
	}

}
