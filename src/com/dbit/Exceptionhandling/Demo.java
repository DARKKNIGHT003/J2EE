package com.dbit.Exceptionhandling;

import java.util.Scanner;

public class Demo //NORMAL TERMINATION
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for A");
		int a = sc.nextInt();
		System.out.println("enter the value for B");
		int b = sc.nextInt();
		System.out.println("A/B is ="+(a/b));
	}

}
