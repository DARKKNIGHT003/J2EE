package com.dbit.inheritances;

class A1 // note4
{
	private int i =10;			// parent class or super class
}

class B1 extends A1		
{
	int j = 20;
}
public class Demo1 
{
	public static void main(String[] args) 
	{
		B b= new B();
		//System.out.println(b.i);// i has private access in A System.out.println(b.i)
		System.out.println(b.j);
	}

}
