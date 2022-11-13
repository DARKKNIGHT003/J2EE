package com.dbit.jdbc;
import java.sql.*;
public class demo
{
	public static void main(String[] args) 
	{
		try
		{
		    System.out.println("Driver loaded Successfully");  
			String jdbc_url="jdbc:mysql://localhost:3306/demo";
			String user="root";
			String pwd="root";
			Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		    System.out.println("Connection Successful");
		}
		catch (SQLException e)
		{
		    System.out.println("Some problem in connection");
		    e.printStackTrace();
		}

	}

}
