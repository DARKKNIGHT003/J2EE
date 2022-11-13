package com.dbit.string;

import java.util.Scanner;

public class Demo22 // example for next() method and nextline() method
{
	public static void main(String[] args) 
	{
		System.out.println("enter your name:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("the entered name is :" + s);
	}

}
