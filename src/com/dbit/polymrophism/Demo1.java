package com.dbit.polymrophism;

class Plane
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
class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("Cargoplane is flying with the low speed");
	}
	void CarryCargo()
	{
		System.out.println("Cargoplane is carrying the goods");
	}
}

class PassengerPlane extends Plane
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
class FighterPlane extends Plane
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
public class Demo1 //INHERITED , OVERRIDDEN , SPECILIZED METHODS
{
	public static void main(String[] args) 
	{
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		cp.takeOff();
		cp.fly();
		cp.land();
		cp.CarryCargo();

		pp.takeOff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();
	}

}
