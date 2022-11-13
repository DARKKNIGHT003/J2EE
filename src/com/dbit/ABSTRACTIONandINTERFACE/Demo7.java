package com.dbit.ABSTRACTIONandINTERFACE;

interface calculate1
{
	int min = 10;
}
interface calculate2
{
	int min = 20;
}
class Test implements calculate1,calculate2
{
	public void disp()
	{
		System.out.println(calculate1.min);
		System.out.println(calculate2.min);

	}
}
public class Demo7 //INTERFACE
{
	public static void main(String[] args)
	{
		Test t =  new Test();
		t.disp();
	}

}
