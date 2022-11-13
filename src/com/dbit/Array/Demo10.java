package com.dbit.Array;

import java.util.Scanner;

public class Demo10 //MULTI-DIMENSIONAL ARRAY
{
	public static void main(String[] args) //2D jagged array
	{
		int a[][] = new int [3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
		Scanner sc = new Scanner(System.in); //scanner object creation
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("Enter the marks of student " + j +"of classroom "+i);
				a[i][j]= sc.nextInt();
			}
		}
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
