package com.dbit.string;

public class Demo16 //FEW INBUILT METHODS WITH RESPECT TO STRINGBUFFER CLASS
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("sagar");
		System.out.println(s1);
		System.out.println(s1.charAt(2));

		s1.setCharAt(2,'p');
		System.out.println(s1);

		s1.deleteCharAt(2);
		System.out.println(s1);
	}

}
