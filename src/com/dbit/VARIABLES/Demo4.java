package com.dbit.VARIABLES;

public class Demo4 
{
	static int iv = 25;
	int sv = 50;
	private int x;
	private int y;
	public static void main(String[] args) 
	{
		Demo4 d4 = new Demo4();
		System.out.println(d4.x); 			// 25
		System.out.println(d4.y); 			// 50
		d4.x = 143; 
		d4.y = 420;
		System.out.println(d4.x); 			// 143
		System.out.println(d4.y); 			// 420



		Demo4 d5 = new Demo4();
		System.out.println(d5.x);			// 143 
		System.out.println(d5.y);			// 50

	}

}
