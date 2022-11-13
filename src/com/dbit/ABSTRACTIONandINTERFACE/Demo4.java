package com.dbit.ABSTRACTIONandINTERFACE;

abstract class Bird //RULE-2:RULES W.R.T ABSTRACTION
{
	abstract void fly();
	abstract void eat();
}
class Pigeon extends Bird
{
	void fly()
	{
		System.out.println("pigeon fly very low");
	}
	void eat()
	{
		System.out.println("pigeon eats grains");
	}
}

abstract class Eagle extends Bird
{
	void fly()
	{
		System.out.println("eagle fly very high");
	}
	abstract void eat();
}
class MountainEagle extends Eagle
{
	void eat()
	{
		System.out.println("Mountain eagles hunt and eat over mounatins");
	}
}
class GoldenEagle extends Eagle
{
	void eat()
	{
		System.out.println("Golden eagles hunt and eat over oceans");
	}
}

class sky
{
	void allow(Bird b)
	{
		b.fly();
		b.eat();
	}
}
public class Demo4 
{
	public static void main(String[] args) 
	{
		MountainEagle m = new MountainEagle();
		GoldenEagle g = new GoldenEagle();
		Pigeon p = new Pigeon();
		sky s = new sky();

		s.allow(m);
		s.allow(g);
		s.allow(p);
	}

}
