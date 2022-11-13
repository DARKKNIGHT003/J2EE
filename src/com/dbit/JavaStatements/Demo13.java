package com.dbit.JavaStatements;

public class Demo13  //Transfer Statements
{
	public static void main(String[] args) //break
	{
		l1:for(int i=0;i<10;i++)// Outer loop
		{
		for(int j=0;j<10;j++)// Nested Loop
		{
		if(j==5)
		{
		break l1;
		}
		System.out.println(i+" "+j);
		}
		// Out side of nested Loop
		}
		//Out side of outer loop

	}

}
