package com.dbit.Exceptionhandling;
import java.io.*;
public class Demo7 //CHECKED EXCEPTION
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader r = new FileReader("abc.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("file not found");
		}
	}

}
