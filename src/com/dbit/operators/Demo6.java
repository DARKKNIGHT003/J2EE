package com.dbit.operators;

public class Demo6 // DECREMENTATION
{
	public static void main(String[] args) 
	{
		int a = 7;

		System.out.println(a); // 7
		System.out.println((--a + --a) + (a-- + --a) * (++a + a++) - (--a + --a));// 68
		System.out.println(a); // 3
	}

}
