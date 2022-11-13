package com.dbit.methods;
class Student
{
	private String name;
	private int age;
	private float height;
	
	void setName(String sname)
	{
		name=sname;
	}
	void setAge(int sage)
	{
		age=sage;
	}
	void setHeight(float sheight)
	{
		height=sheight;
	}

	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	float getHeight()
	{
		return height;
	}


}
public class Demo5 //MUTATORS/SETTERS and ACCESSORS/GETTERS
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		
		s.setName("Subbu");
		s.setAge(24);
		s.setHeight(6.1f);

		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getHeight());
	}

}
