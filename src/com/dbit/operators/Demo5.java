package com.dbit.operators;

public class Demo5 // DECREMENTATION
{
	public static void main(String[] args) 
	{
		int a = 7;

		System.out.println(a); // 7
		System.out.println(--a +  --a + a++); // (7->6 [6]) + (6->5 [5]) +([5] 5->6) op-> 16 
		System.out.println(a); // 6
	}

}
