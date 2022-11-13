package com.dbit.Array;

public class Demo //SINGLE DIMENSION ARRAY
{
	public static void main(String[] args) 
	{
		int a[];//The declaration of the array
		a = new int[5];//Creation of array object
		a[0] = 10;
		a[1] = 20;// Initialization of a array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]);       --> error: ArrayIndexOutOfBoundsException: 5
	}

}
