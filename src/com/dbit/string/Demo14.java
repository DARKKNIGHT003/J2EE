package com.dbit.string;

public class Demo14 //INTERNAL IMPLEMENATION OF THE MUTABLE STRING
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer();
		
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		s1.append("students");
		
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		s1.append(" prepare for exams");
		
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());

		s1.append(" and get placed in a good company");
		
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
	}

}
