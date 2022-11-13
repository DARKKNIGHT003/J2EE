package com.dbit.Array;

import java.util.Scanner;

public class Demo8 //WAP to store and sum the values and  print sum value
{
	public static void main(String[] args)  //1D array
	{
		System.out.println("Enter the length/size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("the length of the array is: "+a.length);
		
		for (int i =0;i<=a.length-1 ;i++)
			{
				System.out.println("Enter the marks of the students");
				a[i] = sc.nextInt();
			}
			int sum = 0; 
		
		for (int i=0;i<=a.length-1 ;i++)
			{
				sum = sum+a[i];
				System.out.print(a[i]+ " ");
			}
			System.out.print("The sum of values is : "+ sum);
	}

}
