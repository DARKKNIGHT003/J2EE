package com.dbit.obejctorientation;

class Lion //CREATION OF OBJECT
{
	String name; 
	String breed;
	String gender;

	void eat() //eat method for loin class
	{
		System.out.println("lion always eats non-veg");

	}
	void sleep() //sleep method for loin class 
	{
		System.out.println("lion sleeps 10 hr per day...!");
	}
	void run() //run method for loin class
	{
		System.out.println("lion runs faster than human being");

	}
}
public class Demo 
{
	public static void main(String[] args) //main method
	{
		Lion l1 = new Lion();//object loin is created
		 l1.eat();
		 l1.sleep();
		 l1.run();

	}

}
