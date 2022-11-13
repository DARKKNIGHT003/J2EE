package com.dbit.string;

public class Demo15 //ensureCapacity() method
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		s1.ensureCapacity(1500);
		System.out.println(s1.capacity());
	}

}
