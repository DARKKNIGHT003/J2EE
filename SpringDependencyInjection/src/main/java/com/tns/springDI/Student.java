package com.tns.springDI;

public class Student {
            
	private  String studentName;
	private int id;
	
	/*Setter Injection
	public void setId(int id)
	{
		this.id = id;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	*/
	
	//Constructor Injection
	public Student(String studentName, int id)
	{
		this.studentName = studentName;
		this.id = id;
	}
	
	
	public void display()
	{
     System.out.println("Student name is : "+studentName);
     System.out.println("Student Id is : "+id);
    }
	}
	