package com.dbit.methods;

public class Demo2 //PARAMETER AND RETURN VALUE
{
	public static void main(String[] args) // passing the input and returning the output
	{
		Addition2 a1=new Addition2();
		 int x=12;
		 int y=12;
		 int res = a1.add(x,y);
		 System.out.println(res);
	}

}

class Addition2
{
	int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
}