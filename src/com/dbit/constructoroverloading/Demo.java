package com.dbit.constructoroverloading;

class Employee
{
	private String name;	
	private int id;
	private float salary;

	public Employee(String name)
	{
		this.name = name;
	}
	public Employee(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	public Employee(String name,int id,float salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public float getSalary()
	{
		return salary;
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("ramu");
		System.out.println(e1.getName());
		Employee e2 = new Employee("ramu",124);
		System.out.println(e2.getName());
		System.out.println(e2.getId());
		Employee e3 = new Employee("ramu",124,50.45f);
		System.out.println(e3.getName());
		System.out.println(e3.getId());
		System.out.println(e3.getSalary());
	}

}
