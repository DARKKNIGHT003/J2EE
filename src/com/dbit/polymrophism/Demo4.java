package com.dbit.polymrophism;

class Plane2
{
	String name;
	int wheel;
	void takeOff()
	{
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}
class CargoPlane2 extends Plane2
{
	void takeOff()
	{
		System.out.println("Cargoplane is taking off");
	}
	void fly()
	{
		System.out.println("Cargoplane is flying with the low speed");
	}
	void CarryCargo()
	{
		System.out.println("Cargoplane is carrying the goods");
	}
}

class PassengerPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("Passengerplane is flying with the medium speed");
	}
	void CarryPassenger()
	{
		System.out.println("Passengerplane is carrying the people");
	}
}
class FighterPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("Fighterlane is flying with the high speed");
	}
	void CarryArms()
	{
		System.out.println("Fighterplane is carrying the weapons");
	}
}
public class Demo4 
{
	public static void main(String[] args) 
	{
		Plane2 ref = new Plane2();	//parent object creation

		//CargoPlane cp =new CargoPlane(); //[child refernce to child object]
		
		ref = new CargoPlane2();		//parent ref to the child object
		
		ref.takeOff();
		ref.fly();
		ref.land(); //ref.CarryCargo();
		
		ref = new PassengerPlane2();
		ref.takeOff();
		ref.fly();
		ref.land(); //ref.CarryPassenger();


		ref = new FighterPlane2();
		ref.takeOff();
		ref.fly();
		ref.land(); //ref.CarryArms();

	}

}
