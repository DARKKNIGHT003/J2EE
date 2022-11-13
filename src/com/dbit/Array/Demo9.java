package com.dbit.Array;

import java.util.Scanner; //MULTI-DIMENSIONAL ARRAY

public class Demo9 //WAP to store and print the marks of students from 3 class rooms where in each class 5 students are presents
{
	public static void main(String[] args) //2D regular array
	{
	int a[][] = new int [3][5];
	Scanner sc = new Scanner(System.in); //scanner object creation
	
	for (int i=0;i<=2;i++)
	{
		for (int j=0;j<=4;j++)
		{
			System.out.println("Enter the marks of student " + j +"of classroom "+i);
			a[i][j]= sc.nextInt();
		}
	}
	
	for (int i=0;i<=2;i++)
	{
		for (int j=0;j<=4;j++)
		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println(" ");
	}

	}

}
