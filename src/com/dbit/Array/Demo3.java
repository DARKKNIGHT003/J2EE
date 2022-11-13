package com.dbit.Array;

import java.util.Scanner;

public class Demo3 ////WAP to store and print marks of 5 students
{
	public static void main(String[] args) //1D array
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in); //scanner object creation in 1d array
		
		System.out.println("Enter the marks:");
		a[0]= sc.nextInt();
		
		System.out.println("Enter the marks:");
		a[1]= sc.nextInt();
		
		System.out.println("Enter the marks:");
		a[2]= sc.nextInt();
		
		System.out.println("Enter the marks:");
		a[3]= sc.nextInt();
		
		System.out.println("Enter the marks:");
		a[4]= sc.nextInt();

		System.out.print(a[0]+ " ");
		System.out.print(a[1]+ " ");
		System.out.print(a[2]+ " ");
		System.out.print(a[3]+ " ");
		System.out.print(a[4]+ " ");

	}

}
