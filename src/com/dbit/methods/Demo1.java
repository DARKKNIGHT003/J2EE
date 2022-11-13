package com.dbit.methods;

public class Demo1 //PARAMETER AND NO RETURN VALUE
{
	public static void main(String[] args) // passing the input and no returning the output
	{
		 Addition1 a1=new Addition1();
		 int x=12;
		 int y=8;
		 a1.add(x,y);
	}

}

class Addition1
{
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
}