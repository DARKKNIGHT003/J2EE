package com.dbit.clbl;

import java.sql.*;
import java.io.*;
public class bl
{
public static void main(String[] args) throws Exception
{
	String jdbc_url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	
	String sqlQuery="insert into bl values(?,?)";
	PreparedStatement ps = con.prepareStatement(sqlQuery);
	ps.setString(1,"joker");
	
	File f = new File("joker.jpg");
	FileInputStream fis = new FileInputStream(f);
	ps.setBinaryStream(2,fis);
	
	System.out.println("inserting image from :"+f.getAbsolutePath());
	int updateCount=ps.executeUpdate();
	if(updateCount==1)
	{
		System.out.println("Record Inserted");
	}
	else
	{
		System.out.println("Record Not Inserted");
	}

}

}
