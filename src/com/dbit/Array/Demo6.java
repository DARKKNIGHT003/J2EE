package com.dbit.Array;

import java.util.Scanner;

public class Demo6 //WAP to store and print marks of 5 students using while and do while loop
{
	public static void main(String[] args) //1D array
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int i;
		i=0;
		do
		{
			System.out.println("Enter the marks:");
			a[i]= sc.nextInt();
			i++;
		}
		while(i<=4);
		
		i=0;
		do
		{
			System.out.print(a[i]+" ");
			i++;
		}
		while(i<=4);
	}

}
