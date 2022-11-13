package com.dbit.Array;

import java.util.Scanner;

public class Demo11 //Creation of 3D array
{
	public static void main(String[] args) //3D regular array
	{
		int a[][][] = new int [2][3][3]; 
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of student " + k +"of the classroom "+j+" from the school " +i);
					a[i][j][k]= sc.nextInt();

				}
				
			}
		}
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1 ;k++ )
				{
					System.out.print(a[i][j][k] + " ");

				}
				System.out.println(" ");
				
			}
			
		}


	}

}
