package com.dbit.polymrophism;

class Vehicle
{
	void Move()
	{
		System.out.println("vehicle is moving");								// overriden method w.r.t parent class
	}
}
class Bike extends Vehicle
{
	void Move()
	{
		System.out.println("bike is moving medium speed");								// overriding method w.r.t child class	}
	}
}
class Car extends Vehicle
{
	void Move()
	{
		System.out.println("Car is moving high speed");								// overriding method w.r.t child class	}
	}
}
class Truck extends Vehicle
{
	void Move()
	{
		System.out.println("Truck is moving low speed");								// overriding method w.r.t child class	}
	}
}
public class Demo2 //METHOD OVERRIDING
{
	public static void main(String[] args) 
	{
		Bike b = new Bike();
		Car c = new Car();
		Truck t = new Truck();

		b.Move();		// 1:1
		c.Move();		// 1:1
		t.Move();		// 1:1
		
	}

}
