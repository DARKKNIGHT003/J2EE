package com.dbit.string;

public class Demo23 // example for checking whether the given string is palindrome or not
{
	public static void main(String[] args) 
	{
		String s1 = "madam";
		String rev ="";
		int len =s1.length();
		for (int i=len-1;i>=0;i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println("Reversed string is :" + rev);

		if (s1.equals(rev))
		{
			System.out.println("the given string is a palindrome");

		}
		else
		{
			System.out.println("the given string is not a palindrome");
		}
	}

}
