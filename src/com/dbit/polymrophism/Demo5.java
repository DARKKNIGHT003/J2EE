package com.dbit.polymrophism;

class Plane3
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
class CargoPlane3 extends Plane3
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

class PassengerPlane3 extends Plane3
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
class FighterPlane3 extends Plane3
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
class Airport
{
	void allow(CargoPlane3 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
	void allow(PassengerPlane3 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
	void allow(FighterPlane3 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class Demo5 // VIRTUAL POLYMORPHISM USING THE METHOD OVERLOADING
{
	public static void main(String[] args) 
	{
		CargoPlane3 cp = new CargoPlane3();
		PassengerPlane3 pp = new PassengerPlane3();
		FighterPlane3 fp = new FighterPlane3();
		Airport a = new Airport();

		a.allow(cp);
		a.allow(pp);
		a.allow(fp);
	}

}
