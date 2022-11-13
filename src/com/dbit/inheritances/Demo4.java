package com.dbit.inheritances;

class A4 // note8 
{
	int i,j;
	A4()
	{
		//super();
		System.out.println("inside the default constructor");
	}
}
class B4 extends A4		
{
	B4()
	{
		super();
	}
	B4(int i, int j)
	{
		super();
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
	}
}
public class Demo4
{
	public static void main(String[] args) 
	{
		B4 b= new B4(10,20);
		b.display();
	}

}
