package com.dbit.Array;

import java.util.Scanner;

public class Demo4 //WAP to store and print marks of 5 students using loop statement
{
	public static void main(String[] args)  //1D array
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in); //scanner object creation in 1d array
		
		
		for (int i=0;i<=4 ;i++)
		{
			System.out.println("Enter the marks:");
			a[i]= sc.nextInt();
		}
		
		for (int i=0;i<=4 ;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
