package com.dbit.blocks;
import java.util.*;

class Student1
{
	private String name;
	private int age;
	private String schoolName;

	public void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NAME : ");
		name = sc.next();
		
		System.out.println("ENTER THE AGE : ");
		age = sc.nextInt();

		System.out.println("ENTER THE SCHOOL NAME : ");
		schoolName = sc.next();
	}
	public void display()
	{
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("schoolname is :"+schoolName);

	}

}
public class Demo5 
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1();
		s1.setData();
		s1.display();
	}

}
