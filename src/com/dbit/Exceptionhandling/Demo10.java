package com.dbit.Exceptionhandling;

import java.io.*;

public class Demo10 //RE-THROWING THE EXCEPTION
{
	public static void main(String[] args) 
	{
		//String path = "C:\\Users\\SagarRam\\Desktop\\day-12pics\\8790234-6615085-image-a-90_1548071159289.jpg";
				String path = "abc.txt";
				try
				{
					open(path);
				}
				catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}

			public static void open(String path) throws FileNotFoundException 
			{
				try
				{
					FileReader r = new FileReader(path);
				}
				catch (FileNotFoundException e)
				{
					System.out.println(e);
					throw e;
				}
				
			}
			

	}


