package com.dbit.blocks;

class A3
{
	int age;	//IV
	
	{
		age=16;
		System.out.println("the age is "+ age);
	}
}
public class Demo3 {

	public static void main(String[] args) 
	{
		System.out.println("inside the main method");
		A3 a =new A3();
	}

}
