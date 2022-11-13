package com.dbit.ABSTRACTIONandINTERFACE;

public class Demo8 implements Cloneable //interface
{
	int a = 10;
	public static void main(String[] args) throws Exception
	{
		Demo8 d = new Demo8();
		System.out.println(d.a);

		Demo8 d1=(Demo8)d.clone();
		System.out.println(d1.a);
	}

}
