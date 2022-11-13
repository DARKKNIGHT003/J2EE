package com.dbit.JavaStatements;

public class Demo14 //Transfer Statements
{
	public static void main(String[] args) //continue label
	{
		l1:for(int i=0;i<10;i++)
		{
		for(int j=0;j<10;j++)
		{
		if(j==5)
		{
		continue l1;
		}
		System.out.println(i+" "+j);
		}
		}
	}

}
