package com.dbit.ABSTRACTIONandINTERFACE;

//program without object oriented features

import java.util.*;
class Square
{
	float length;
	float area;

	public void input()
	{
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the length: ");
		length = s.nextFloat();
	}
	public void compute()
	{
		area= length * length;
	}
	public void disp()
	{
		System.out.println("the area of the square is :"+area);
	}
}  
class Rectangle
{
	float length;
	float breadth;
	float area;

	public void input()
	{
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the length: ");
		length = s.nextFloat();
		System.out.println("enter the breadth: ");
		breadth = s.nextFloat();
	}
	public void compute()
	{
		area= length * breadth;
	}
	public void disp()
	{
		System.out.println("the area of the rectangle is :"+area);
	}
}  
public class Demo6 
{
	public static void main(String[] args)
	{
		Square s = new Square();
		s.input();
		s.compute();
		s.disp();

		Rectangle r = new Rectangle();
		r.input();
		r.compute();
		r.disp();
	}

}
