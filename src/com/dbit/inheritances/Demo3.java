package com.dbit.inheritances;

//note7
class A3
{
	int i;
	int j;
	A3()
	{
		super();
		i=1111;
		j=2222;
	}
}
class B3 extends A3		
{
	B3()
	{
		super();
	}
	void display()
	{
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
	}
}
public class Demo3
{
	public static void main(String[] args)
	{
		B3 b= new B3();
		b.display();
	}

}
