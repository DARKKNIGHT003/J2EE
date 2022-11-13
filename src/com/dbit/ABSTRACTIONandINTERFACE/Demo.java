package com.dbit.ABSTRACTIONandINTERFACE;

class Vehicle		//parent class
{
	void Move()
	{
		System.out.println("vehicle is moving");
	}
	void Start()
	{
		System.out.println("vehicle is started");
	}
}
class Car extends Vehicle			//child class
{
	void Start()			//overridden method
	{
		System.out.println("self start or auto start");
	}
}
class Bike extends Vehicle
{
	void Start()
	{
		System.out.println("kick start");
	}
}
public class Demo //PROGRAM WITHOUT ABSTRACTION
{
	public static void main(String[] args) 
	{
		Vehicle V = new Vehicle();
		Car C = new Car();
		Bike B = new Bike();

		V.Move();
		V.Start();

		C.Move();
		C.Start();
		
		B.Move();
		B.Start();
	}

}
