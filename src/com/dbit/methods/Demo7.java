package com.dbit.methods;

public class Demo7 //METHOD OVERLOADING IN JAVA
{
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		
		int a=10, b=20, c=30;								// NAME OF THE METHOD
		float x=1.2f, y=2.2f, z=3.2f;							// NUMBER OF PARAMETER
		double p=10.222, q=20.2433, r=30.3233;						// DATATYPES OF THE PARAMETER
												// ORDER OF THE PARAMETER
		System.out.println(t1.add(p,q));
		System.out.println(t1.add(a,x));
		System.out.println(t1.add(a,b,c));
		System.out.println(t1.add(a,p));
	}

}

class Test1
{
	int add(int x, int y)
	{
		return x+y;
	}
	float add(float x, float y)
	{
		return x+y;
	}
	double add(double x, double y)
	{
		return x+y;
	}
	float add(int x, float y)
	{
		return x+y;
	}
	double add(int x, double y)
	{	
		return x+y;
	}
	double add(float x, double y)
	{
		return x+y;
	}
	float add(float x, int y)
	{
		return x+y;
	}
	double add(double x, int y)
	{
		return x+y;
	}
	double add(double x, float y)
	{
		return x+y;
	}
	int add(int x, int y, int z)
	{
		return x+y+z;
	}
	float add(float x, float y, float z)
	{
		return x+y+z;
	}
	double add(double x, double y, double z)
	{
		return x+y+z;

	}
	double add(int x, float y, double z)
	{
		return x+y+z;
	}
	float add(int x, float y, float z)
	{
		return x+y+z;
	}
	double add(int x, double y, double z)
	{
		return x+y+z;
	}
	float add(float x, int y, int z)
	{
		return x+y+z;
	}

}

