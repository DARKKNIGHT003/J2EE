package com.dbit.polymrophism;

class Vehicle1
{
	void Move()
	{
		System.out.println("vehicle is moving");								// overriden method w.r.t parent class
	}
}
class Bike1 extends Vehicle1
{
	void Move()
	{
		System.out.println("bike is moving medium speed");								// overriding method w.r.t child class	}
	}
}
class Car1 extends Vehicle1
{
	void Move()
	{
		System.out.println("Car is moving high speed");								// overriding method w.r.t child class	}
	}
}
class Truck1 extends Vehicle1
{
	void Move()
	{
		System.out.println("Truck is moving low speed");								// overriding method w.r.t child class	}
	}
}

public class Demo3 //PARENT REFERENCE TO CHILD OBJECT
{
	public static void main(String[] args) //[upcasting]
	{
Vehicle1 v = new Vehicle1();	//object creation of parent class
		
		v = new Bike1();	//[child object with parent refernce]
		v.Move();
		
		v = new Car1();
		v.Move();
		
		v = new Truck1();
		v.Move();		// 1:3 
	}

}
