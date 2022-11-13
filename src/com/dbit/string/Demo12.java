package com.dbit.string;

public class Demo12 //compareTo() method
{
	public static void main(String[] args) 
	{
		String s1 = "abhilash";
		String s2 = "asha";
		int res = s1.compareTo(s2);
		if(res == 0)
		{
			System.out.println("Strings are equal");
		}
		else if (res > 0)
		{
			System.out.println("String s1 is greater than String s2");
		}
		else
		{
			System.out.println("String s1 is lesser than String s2");
		}

	}

}
