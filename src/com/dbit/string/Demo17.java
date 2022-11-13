package com.dbit.string;

public class Demo17 //insert(int index, String s) method
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("sagar");
		System.out.println(s1);
		s1.insert(5,"is a good boy..!");
		System.out.println(s1);
		s1.insert(0,6);
		System.out.println(s1);
	}

}
