package com.dbit.methods;

class Credentials
{
	private String un;		//IV
	private String pwd;
	
	void setUn(String username)
	{
		un=username;
	}
	void setPwd(String password)
	{
		pwd=password;
	}

	String getUn()
	{
		return un;
	}
	String getPwd()
	{
		return pwd;
	}
}
public class Demo4 //MUTATORS/SETTERS and ACCESSORS/GETTERS
{
	public static void main(String[] args) 
	{
Credentials c = new Credentials();
		
		c.setUn("StudyOnline");
		c.setPwd("3443");

		System.out.println(c.getUn());
		System.out.println(c.getPwd());

	}

}
