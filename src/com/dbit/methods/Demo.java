package com.dbit.methods;

public class Demo //NO PARAMETER AND NO RETURN VALUE
{
	public static void main(String[] args) // no passing the input and no returning the output
	{
		Addition a1=new Addition(); //addition object creation
		 a1.add();//using the addition object calling the add() from addition class
	}

}

class Addition
{
	void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}
