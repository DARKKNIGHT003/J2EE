package com.dbit.inheritances;


//note9 

class A5
{
	int i,j;
	int a,b;
	A5(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("inside the parent class constructor");
	}
}

class B5 extends A5		
{
	B5(int i, int j)
	{
		super(30,60);
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
	}
}
public class Demo5 {

	public static void main(String[] args) 
	{
		B5 b= new B5(10,20);
		b.display();
	}

}
