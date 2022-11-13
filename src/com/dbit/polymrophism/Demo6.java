package com.dbit.polymrophism;

class os
{
	String name;
	int size;
	public os(String name, int size)
	{
		this.name=name;
		this.size=size;
	}
	public String getName()
	{
		return name;
	}
	public int getSize()
	{
		return size;
	}
}
class charger
{
	String brand;
	String color;
	public charger(String brand, String color)
	{
		this.brand=brand;
		this.color=color;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getColor()
	{
		return color;
	}
}
class mobile
{
	os o = new os("android",125);
	public void hasA(charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
	}
}
public class Demo6 //RELATIONSHIPS IN JAVA
{
	public static void main(String[] args) 
	{
		mobile m = new mobile();
		charger c1 = new charger("samsung","white");

		//System.out.println(m.o.getName());
		//System.out.println(m.o.getSize());
		m.hasA(c1);

		m=null;
		//System.out.println(o.getName());
		//System.out.println(o.getSize());
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		
	}

}
