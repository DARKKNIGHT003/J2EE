package com.dbit.Array;

import java.util.Scanner;

public class Demo5 //WAP to store and print marks of 5 students using while loop statement
{

	public static void main(String[] args)  //1D array
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int i;
		i=0;
		while(i<=4)
		{
			System.out.println("Enter the marks:");
			a[i]= sc.nextInt();
			i++;
		}
		

		i=0;
		while(i<=4)
		{
			System.out.print(a[i]+" ");
			i++;
		}

	}

}
