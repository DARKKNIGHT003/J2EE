package com.dbit.string;

import java.util.*;

public class Demo21 //READING THE STRING FROM SCANNER CLASS
{
	public static void main(String[] args) 
	{
		System.out.println("enter your name:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("the entered name is :" + s);
	}

}
